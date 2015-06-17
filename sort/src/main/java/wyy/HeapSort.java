package wyy;

public class HeapSort <T extends Comparable<T>> {
	private T[] array;

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}
	
	public void sort(){
		for (int i = 1; i < array.length; i++) {
			int y = i;
			while ((y > 0) && (array[y].compareTo(array[y - 1]) < 0)) {
				T c;
				c = array[y];
				array[y] = array[y - 1];
				array[y - 1] = c;
				y--;
			}
		}

	}
}
