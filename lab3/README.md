# Lab 3 - Подготовка к защите

## Problem 1 - Interface vs Abstract Class (0.25 балла)

### Когда Abstract Class:
- Есть общий предок с общим кодом (поля, методы)
- Отношение **IS-A** ("Triangle IS A Shape")
- Нужно хранить состояние (переменные)
- Можно иметь конструкторы
- **Ограничение**: один класс может наследовать только от ОДНОГО abstract class

### Когда Interface:
- Описываем **способность/поведение** ("CAN-DO")
- Класс может реализовать **много** интерфейсов
- Нет общего состояния между классами
- Все методы по умолчанию public abstract (до Java 8)
- Поля только `static final`

### Наш пример:
- `Shape` (abstract class) - общий предок фигур, все имеют `getArea()`
- `Perimeter`, `Volume`, `LateralSurfaceArea` (interfaces) - способности
- `Cube extends Shape implements Volume, LateralSurfaceArea, Perimeter` - куб умеет всё
- `Triangle extends Shape implements Perimeter` - треугольник только периметр

### Вопросы на защите:
- **Q: Может ли abstract class иметь конструктор?** A: Да, его вызывают через `super()` в наследниках
- **Q: Можно ли создать объект abstract class?** A: Нет, `new Shape()` - ошибка компиляции
- **Q: Зачем interface если есть abstract class?** A: Множественное наследование поведения. Java не поддерживает множественное наследование классов
- **Q: Может ли interface иметь реализацию метода?** A: Да, с Java 8 через `default` методы

---

## Problem 2 - Moveable Interface (0.25 балла)

### Структура:
```
interface Moveable          -> moveRight(), moveLeft()
    |
interface MoveableVertically extends Moveable  -> moveUp(), moveDown()
```

### Классы:
- `MoveablePoints implements MoveableVertically` - точка, двигается в 4 направлениях
- `Car implements Moveable` - машина, двигается только влево-вправо

### Ключевые моменты:
- Interface может **расширять** другой interface через `extends`
- `MoveableVertically extends Moveable` = наследует moveRight/moveLeft + добавляет moveUp/moveDown
- Кто реализует `MoveableVertically` - обязан реализовать ВСЕ 4 метода

### Вопросы:
- **Q: Может ли interface наследовать interface?** A: Да, через `extends` (не implements!)
- **Q: Может ли interface наследовать несколько interface?** A: Да, `interface A extends B, C`

---

## Problem 3 - MyCollection Interface (0.75 балла)

### Что такое MyCollection:
Максимально абстрактный интерфейс коллекции с generics `<E>`.

### Методы:
| Метод | Описание |
|-------|----------|
| `add(E element)` | Добавить элемент |
| `remove(int index)` | Удалить по индексу |
| `get(int index)` | Получить элемент |
| `contains(Object obj)` | Проверить наличие |
| `size()` | Количество элементов |
| `isEmpty()` | Пуста ли коллекция |
| `clear()` | Очистить |
| `toArray()` | Преобразовать в массив |

### Вопросы:
- **Q: Зачем generics `<E>`?** A: Типобезопасность. Без них всё хранится как Object и нужны cast'ы
- **Q: Почему contains принимает Object, а не E?** A: Так сделано в стандартной Java Collection - для совместимости
- **Q: Почему интерфейс, а не класс?** A: Интерфейс задаёт контракт. Разные реализации (ArrayList, LinkedList) могут по-разному реализовать эти методы

---

## Problem 4 - Employee / Manager (1.5 балла) ⭐

### Иерархия:
```
Person
  └── Employee implements Comparable<Employee>, Cloneable
        └── Manager
```

### Person:
- Поле: `personName`
- Методы: `equals()`, `toString()`, `hashCode()`

### Employee:
- Поля: `salary` (double), `hireDate` (Date), `insuranceNumber` (String)
- `compareTo()`: сравнивает по зарплате (`Double.compare`)
- `clone()`: глубокий - клонирует `hireDate` через `hireDate.clone()`
- Переопределяет `toString()` и `equals()`

### Manager:
- Поля: `bonus` (double), `team` (Vector<Employee>)
- `compareTo()`: сначала по зарплате (через `super.compareTo`), если равны и другой тоже Manager - по бонусу
- `clone()`: **ГЛУБОКОЕ клонирование** - создаёт новый Vector и клонирует каждого сотрудника

### Компараторы:
- `ComparatorByName` - сортировка по имени (String.compareTo)
- `DateComparable` - сортировка по дате найма (Date.compareTo)

### Deep Clone Manager - ВАЖНО:
```java
public Manager clone() throws CloneNotSupportedException {
    Manager m = (Manager) super.clone();      // клонируем Employee часть
    m.team = new Vector<Employee>();           // НОВЫЙ вектор
    for (Employee e : this.team) {
        m.team.add(e.clone());                 // клонируем КАЖДОГО сотрудника
    }
    return m;
}
```
Если не делать deep clone - при изменении сотрудника в клоне, он изменится и в оригинале!

### Вопросы:
- **Q: Разница shallow vs deep clone?** A: Shallow копирует ссылки (оба объекта указывают на одни данные). Deep создаёт полную копию всех вложенных объектов
- **Q: Почему Employee.clone() клонирует Date?** A: Date мутабельный. Без clone оба Employee будут ссылаться на один объект Date
- **Q: Зачем implements Cloneable?** A: Без него `super.clone()` бросит `CloneNotSupportedException`
- **Q: Что такое Comparator vs Comparable?** A: Comparable - естественный порядок (один способ сравнения внутри класса). Comparator - внешний компаратор (можно создать много разных способов сравнения)
- **Q: Почему compareTo Manager проверяет instanceof?** A: Потому что Employee.compareTo принимает Employee. Если другой объект - обычный Employee (не Manager), сравниваем только по зарплате. Бонус сравниваем только если оба Manager

---

## Problem 5 - Sort (Generics) (1.5 балла) ⭐

### Классы:
- `Chocolate implements Comparable<Chocolate>` - сравнение по весу
- `NewTime implements Comparable<NewTime>` - сравнение по часам → минутам → секундам
- `Sort` - generic сортировка для ЛЮБОГО Comparable типа

### Sort - ключевой класс:
```java
static <E> void swap(E[] array, int i, int j)                    // generic - для любого типа
static <E extends Comparable<E>> void bubbleSort(E[] array)       // только для Comparable
static <E extends Comparable<E>> void mergeSort(E[] array)        // только для Comparable
```

### Что значит `<E extends Comparable<E>>`?
- `E` - параметр типа (generic)
- `extends Comparable<E>` - E обязан реализовать Comparable
- Благодаря этому можно вызывать `compareTo()` на элементах массива
- Один и тот же Sort работает для Chocolate, Time, Employee - любого Comparable

### Bubble Sort (как работает):
1. Проходим по массиву, сравниваем соседние элементы
2. Если левый > правого - меняем местами (swap)
3. После каждого прохода самый большой "всплывает" в конец
4. Повторяем пока массив не отсортирован
5. Сложность: O(n²)

### Merge Sort (как работает):
1. Делим массив пополам рекурсивно до массивов размера 1
2. Сливаем (merge) два отсортированных подмассива в один
3. При слиянии сравниваем головы обоих массивов, берём меньший
4. Сложность: O(n log n)

### Вопросы:
- **Q: Зачем generic а не Object[]?** A: Типобезопасность на этапе компиляции. С Object[] ошибка только в runtime
- **Q: Почему `extends` а не `implements` в `<E extends Comparable>`?** A: В generics всегда пишут `extends`, даже для интерфейсов. Это ограничение синтаксиса Java
- **Q: Может ли Sort сортировать String?** A: Да! String implements Comparable<String>
- **Q: Почему swap отдельным методом?** A: Чтобы не дублировать код свопа в каждом алгоритме сортировки

---

## Problem 6 - Improved Person & Animal (0.75 балла)

### Что сделано:
Улучшены классы из lab2 (import, не переписывание!)

### ImprovedAnimal extends Animal:
**Встроенные интерфейсы:**
1. `Comparable<ImprovedAnimal>` - сравнение по возрасту
2. `Cloneable` - глубокое клонирование (копируем список команд)

**Пользовательские интерфейсы:**
1. `Trainable` - `train(command)`, `knowsCommand(command)` - дрессировка
2. `Feedable` - `feed(food)`, `isHungry()` - кормление

### ImprovedPerson extends Person:
**Встроенные интерфейсы:**
1. `Comparable<ImprovedPerson>` - сравнение по возрасту
2. `Cloneable` - клонирование

**Пользовательские интерфейсы:**
1. `Employable` - `hire(position)`, `fire()`, `isEmployed()` - трудоустройство
2. `Introduceable` - `introduce()` - представление

### Вопросы:
- **Q: Почему extends а не переписываем?** A: Задание требует import. Наследование позволяет расширять без дублирования кода
- **Q: Зачем 2 custom интерфейса?** A: Разделение ответственности. Trainable - про обучение, Feedable - про питание. Не всё что можно кормить - можно дрессировать (и наоборот)
- **Q: Какие встроенные интерфейсы Java знаешь?** A: Comparable, Cloneable, Serializable, Iterable, Runnable, Closeable, AutoCloseable

---

## Общие вопросы по ООП:

- **Q: 4 принципа ООП?** A: Инкапсуляция, Наследование, Полиморфизм, Абстракция
- **Q: Что такое полиморфизм?** A: Один интерфейс - много реализаций. `Shape s = new Triangle()` - переменная типа Shape хранит Triangle
- **Q: Что такое инкапсуляция?** A: Скрытие деталей реализации. private поля + public getters/setters
- **Q: Может ли класс наследовать два класса?** A: Нет, Java не поддерживает множественное наследование классов. Но может реализовать много интерфейсов
- **Q: Что такое Vector?** A: Синхронизированный динамический массив. Похож на ArrayList, но thread-safe
