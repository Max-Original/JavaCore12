package thirdjavacore;

public class MyArrayList<T> {

	private final static int default_amount = 10;
	private final int cut_rate = 2;
	private Object[] array = new Object[default_amount];
	private int size = 0;
	private int resize = 0;

	public void add(T item) {
		if (size == array.length - 1)
			resize(array.length * 2);
		array[size++] = item;
	}

	public void remove(int index) {
		for (int i = index; i < size; i++)
			array[i] = array[i + 1];
		array[size] = null;
		size--;
		if (array.length > default_amount && size < array.length / cut_rate)
			resize(array.length / 2);
	}

	public T get(int index) {
		return (T) array[index];
	}

	public int size() {
		return size;
	}

	public void show() {
		for (Object t : array)
			System.out.println(t);
	}

	private void resize(int newLength) {
		Object[] newArray = new Object[newLength];
		System.arraycopy(array, 0, newArray, 0, size);
		array = newArray;
	}
}
