// cd D:\8.Java\practice\week4\problem3; javac *.java; java Main
public class Main {
    public static void main(String[] args) {
        App app = new App();
        LogicGame logic = new LogicGame();
        MemoryGame memory = new MemoryGame();

        System.out.println("Game Polmorphism:");
        app.getStatistics(logic);
        app.getStatistics(memory);

        System.out.println("\nMultiple Inheritance Hierarchy (iPhone):");
        IPhone iphone = new IPhone();
        iphone.setPrice(999.0);
        iphone.info();
        iphone.plug();
    }
}

