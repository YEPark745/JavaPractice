import java.util.*;


public class Quiz404 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
//		ArrayList<String> al1=new ArrayList<String>();
		boolean flag=true;
		Scanner in=new Scanner(System.in);
		
	/*	al1.add("Number "); //0
		al1.add(" is odd, "); //1
		al1.add(" is even, "); //2
		al1.add("not prime, "); //3
		al1.add("prime, "); //4
		al1.add("and not perfect."); //5
		al1.add("and perfect."); //6
		boolean flag=true; 
		int sum=0;
		Scanner in=new Scanner(System.in); */
		while(flag) {
			System.out.println("Wish to enter number?(yes or no)");
			String choice=in.next();
			if(choice.equalsIgnoreCase("no"))flag=false;
			else {
				System.out.println("Enter the number: ");
				al.add(in.nextInt());
			}
		}
		ArrayList<String> al1=new ArrayList<String>();
		int z=al.size();
		for(int i=0;i<z;i++) {
			String str="";
			int f=0, j=0, sum;
			if(al.get(i)%2==0) str=str+" is even, ";
			else str=str+" is odd, "; 
				for(j=2;j<al.get(i);j++) 
					if(al.get(i)%j==0 ) {
						f=1;
						break;
				}
			if(f==0) str=str+" prime, ";
			else str=str+" not prime, ";
			 for(j=1,sum=0;j<al.get(i);j++) {
				 if(al.get(i)%j==0) sum=sum+j;
			 } 
			 if(sum==al.get(i)) str=str+" and perfect.";
			 else str=str+" and not perfect.";
			 al1.add(str);
			 System.out.print("Number "+al.get(i));
			 System.out.println(al1.get(i));
		}
	}
}