package Lesson6;

public class Lesson6 {
	public static void main(String[] args) {
	
		boolean[] arr;
	arr = new boolean[10];
	System.out.println(arr);
	
	   byte[] arr1 = {10,8,-1,2};
	System.out.println(arr1);
	
	   byte[] arr2;
    arr2 = new byte[]{12,-5,3,7};
    System.out.println(arr2);
    
    for (int i=0;i<arr.length;i++) {
    	System.out.print("Element ");
    	System.out.print(i);
    	System.out.print(" = ");
    	System.out.println(arr[i]);
    }
    System.out.println();
    
    for (int i=0;i<arr1.length;i++) {
    	System.out.print("Element ");
    	System.out.print(i);
    	System.out.print(" = ");
    	System.out.println(arr1[i]);
    }
    System.out.println();
    
    for (int i=0;i<arr2.length;i++) {
        	System.out.print("Element ");
        	System.out.print(i);
        	System.out.print(" = ");
        	System.out.println(arr2[i]);
    }
    System.out.println();
	}
}
