import java.util.*;
public class Main {

	/*i)Write a Java program to reverse elements in a array list?*/
	public static void reverse (List<?> x) {
		Collections.reverse(x);
	}
	
	/*ii) Write a Java program of swap two elements in an array list?*/
	public static void elementSwap(List<?>x, int i, int j) {
		Collections.swap(x, i, j);
	}
	
	/*iii)Write a Java program to iterate through 
	 * all elements in a linked list starting at 
	 * the specified position?*/
	public static void iterate(List<?>x, int index) {
		if(index > x.size()) {
			System.out.println("Please select an integer within the array's index");
		}
		else {
			for(int i=index; i<x.size();i++) {
				System.out.print(x.get(i) + " " );
			}
		}
	}
	
	/*iv)Write a Java program to replace an element in a linked list?*/
	public static void replace(List<String> x, int index, String s) {
		x.set(index, s);
	}
	
	/*v)Write a Java program to convert a hash set to an array?*/
	public static void HastToArray(HashSet<String> h) {
		String[] arr = new String[h.size()];
		h.toArray(arr);
		
		System.out.println("after Array: ");
		
		for(String i : arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		
		l.add("red");
		l.add("green");
		l.add("yellow");
		l.add("blue");
		l.add("green");
		
		System.out.println("Before reverse: ");
		System.out.println(l.toString());
		
		reverse(l);
		
		System.out.println("After reverse: ");
		System.out.println(l.toString());
		
		System.out.println();
		
		System.out.println("Before swap: ");
		System.out.println(l.toString());
		
		elementSwap(l, 1,2);
		
		System.out.println("after swap: ");
		System.out.println(l.toString());
		
		System.out.println();
		
		System.out.println("iterate: ");
		
		iterate(l, 3);
		
		System.out.println();
		
		System.out.println("Before replace: ");
		System.out.println(l.toString());
		
		replace(l, 1,"pink");
		
		System.out.println("after replace: ");
		System.out.println(l.toString());
		
		HashSet<String> h = new HashSet<String>();
		
		h.add("orange");
		h.add("pink");
		h.add("purple");
		h.add("cyan");
		h.add("red");
		h.add("green");
		
		System.out.println("Before converting to array: ");
		
		System.out.println();
		
		HastToArray(h);
		

		}
		
	}


