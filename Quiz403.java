

	import java.util.*;
	public class Quiz403  {
		public static void main(String args[]) {
			ArrayList<String> al = new ArrayList<String>();
			al.add("a");al.add("b");al.add("c");al.add("d");al.add("e");
			al.add("f");al.add("g");al.add("h");al.add("i");al.add("j");
			System.out.println("Size of al after additions: " + al.size());
			System.out.println("Contents of al: " + al);
			boolean f=true;
			for(int i=0;i<al.size();i++) {
				if(f) { if(i%2==0) {al.remove(i);}}
				else {if(i%2==1) {al.remove(i);}}
				f=!f;
				}
			System.out.println("Size of al after deletions: " + al.size());
			System.out.println("Contents of al after deletion of even indexes: " + al);
			
			ArrayList<Integer> al1 = new ArrayList<Integer>();
			al1.add(1);al1.add(2);al1.add(3);al1.add(4);al1.add(5);
			al1.add(6);al1.add(7);al1.add(8);al1.add(9);al1.add(10);
			System.out.println("\nSize of al after additions: " + al1.size());
			System.out.println("Contents of al1: " + al1);
			f=false;
			for(int i=1;i<al1.size();i++) {
				if(f) { if(i%2==0) {al1.remove(i);}}
				else {if(i%2==1) {al1.remove(i);}}
				f=!f;
				}
			System.out.println("Size of al1 after deletions: " +al1.size());
			System.out.println("Contents of al1: " + al1);
		}
	}
