package wyy;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeapSortTest {

	@Test
	public void testHeapSort(){
		Integer[] data = {3,2,1,4,5,9,6,7,8,0};
		HeapSort<Integer> heapSort = new HeapSort<Integer>();
		heapSort.setArray(data);
		heapSort.sort();
		for (Integer integer : data) {
			System.out.print(integer + " ");
		}
		
		for (int i = 0; i < data.length; i++) {
			assertEquals(i, data[i].intValue());			
		}
	}

}
