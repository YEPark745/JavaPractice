/*
 * Create a class that accepts the strings from the user (as long as he wants to enter), 
 * and then, when the user has finished with his data entry, 
 * checks for the duplicate values and deletes them from the ArrayList. Print the final unified list of strings. 
 */
package CSschool;
import java.util.Scanner;
import java.util.ArrayList;

public class hw02 {

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
		int z=al.size();
		for(int i=0;i<z;i++) {
			for(int j=i+1;j<z;j++) {
				if(al.get(i).equalsIgnoreCase(al.get(i))) {
					al.remove(j);
					j--;
					z--;
				}
				}
			}
		
		System.out.println("Contents of al: "+al);

	}

}
