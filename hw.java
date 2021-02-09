/*
 * Create a class that accepts the numbers from the user (as long as he wants to enter), 
 * and then, when the user has finished with his data entry, multiplies even numbers by 2 and odd numbers by 3 and 
 * replaces them in the ArrayList. Print the result. 
 * 
 */
package CSschool;
import java.util.Scanner;
import java.util.ArrayList;

public class hw {

	public static void main(String[] args) {
		// Create an array list
		ArrayList<String> al=new ArrayList<String>();
		boolean flag=true;
		Scanner in=new Scanner(System.in);
		while(flag) {
			System.out.println("Wish to enter Strings?(Yes/No)");
			String choice=in.next();
			if(choice.equalsIgnoreCase("no"))flag=false;
			else {System.out.println("Enter the string: ");
			al.add(in.next());
			}
		}
		for(int i=0;i<al.size();i++) {
			if(al.get(i).length()==4)al.set(i, "****");
		}
		System.out.println("Contents of al: "+al);

	}

}
