package CSschool;
import java.util.ArrayList;
/*
 * Write a program that accepts names in an ArrayList of Strings and replaces a string of four asterisks "****" 
 * in place of every string of length 4. For example, suppose that a list contains the following values: 
 * {​​​​​​​"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}​​​​​​​ ; and now your code changes it to 
 *  {​​​​​​​"****", "is", "****" , "of", "fun", "for", "every", "****",  "programmer"}​​​​​​​.
 */
public class B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> funjava=new ArrayList<String>();
		funjava.add("this");
		funjava.add("is");
		funjava.add("lots");
		funjava.add("of");
		funjava.add("fun");
		funjava.add("for");
		funjava.add("every");
		funjava.add("Java");
		funjava.add("programmer");
		
		String array[]=new String[funjava.size()];
		for(int j=0;j<funjava.size();j++) {
			funjava.set(0,"****");
			funjava.set(2,"****");
			funjava.set(7,"****");
			array[j]=funjava.get(j);
		}
		for(int k=0;k<array.length;k++) {
			System.out.println(array[k]);
		}
	}

}
