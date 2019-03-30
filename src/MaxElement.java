// Ex19-5
// Zachary Elmore
// 11/14/16
// returns the max value in the array

public class MaxElement {

	 public static void main(String[] args) {

	        Integer[] list = {1,4,2,7,8,4,6,9,10,5,9};
	        for (int i = 0; i < list.length; i++) {
	            list[i] = i;
	        }
	        
	        System.out.println("Max = " + max(list));
	    }

	    public static <E extends Comparable<E>> E max(E[] list) {

	        E max = list[0];
	        for (int i = 1; i < list.length; i++) {
	            E element = list[i];
	            if (element.compareTo(max) > 0) {
	                max = element;
	            }
	        }

	        return max;
	    }
}
