package lab3.Problem3;

public interface MyCollection<E> {
	void add(E element);
	void remove(int index);
	E get(int index);
	boolean contains(Object obj);
	int size();
	boolean isEmpty();
	void clear();
	Object[] toArray();
}
