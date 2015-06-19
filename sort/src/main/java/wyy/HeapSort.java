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
//		for (int i = 1; i < array.length; i++) {
//			int y = i;
//			while ((y > 0) && (array[y].compareTo(array[y - 1]) < 0)) {
//				T c;
//				c = array[y];
//				array[y] = array[y - 1];
//				array[y - 1] = c;
//				y--;
//			}
//		}

	}
	
	public T getLeftChild(int current) {
		return array[current*2+1];
	}
	
	public T getRightChild(int current){
		return array[current*2+2];
	}
	
	private static void compareWithChild(T[] array,int heapSize,int index){
		//当前点与左右子节点比较
	}
}
