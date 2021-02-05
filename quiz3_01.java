package CSschool;
import java.util.Scanner;

interface shop{
	abstract String expense();
	abstract int month();

}
abstract class grocery implements shop {
	String mon[]=new String[4];
	int exp[]=new int[4];
	int j,p;

	void Grocery(String m[], int e[]) {
		this.mon= m;
		this.exp= e;
		int min,max;
		min=max=this.exp[0];
		for(int i=1;i<4;i++) {
			if(this.exp[i]>=max) {max=this.exp[i];j=i;}
			if(this.exp[i]<=min) {min=this.exp[i];p=i;}
			
		}
	}
		public String expense() {
			return this.mon[j];
		}
		public int month() {
			return this.exp[p];
		}
	 
}
public class quiz3_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 String mon[]=new String[4];
		 int exp[]=new int[4];
	
		for(int i=0;i<4;i++) {
			System.out.print("Enter the month:");
			mon[i]=in.next();
			System.out.print("Enter the corresponding expense:");
			exp[i]=in.nextInt();
		 }
		Grocery g = new Grocery(mon, exp) ;
		String str=g.expense();
		int ex=g.month();
		
		System.out.println("\nResult: ");
		System.out.println("Month with the least expense incurred: "+str);
		System.out.println("The hightest amount of expense incurred: "+ex);
	

}
}
