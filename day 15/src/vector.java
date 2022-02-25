import java.util.*;
import java.io.*;

public class vector {

	public static void main(String args[])
	{
		Vector<Integer> vector = new Vector<Integer>();

		// Use add() method to add elements in the vector
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);

		// Displaying the Vector
		System.out.println("Vector: " + vector);

		// Using set() method to replace 
		System.out.println("The Object that is replaced is: "
						+ vector.set(0, 6));

		System.out.println("The Object that is replaced is: "
						+ vector.set(4, 9));
		
		vector.remove(3);
		 
        // checking vector
        System.out.println("after removal: " + vector);

		// Displaying the modified vector
		System.out.println("The new Vector is:" + vector);
	}
}
