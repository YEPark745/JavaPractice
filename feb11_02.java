/*to create the class Student. This class has attributes as name and average mark . 
 * Create another class and instantiate the Student (make 5 objects of this kind) 
 * and find out the student with the greatest average mark.
 * Rank the students
 */
package CSschool;
import java.util.Scanner;

class Person1{
	
	int avg;
	int mark;
	String name;
	public Person1() {}
	public Person1(String name,  int mark) {
		this.name=name;
//		this.avg=avg;
		this.mark=mark;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		 this.name=name;
	}
//	public int getAvg() {
//		return avg;
//	}
//	public int setAvg(int avg) {
//		return this.avg=avg;
//	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark=mark;
	}
	

}
public class feb11_02 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("How many?");
		int h=in.nextInt();
		Person1 p[]=new Person1[h]; // depends on user input above
		for(int i=0;i<p.length;i++) {
			p[i]=new Person1(); //**********
			System.out.println("Enter name?");
				p[i].setName(in.next());
			System.out.println("Enter mark");
				p[i].setMark(in.nextInt());
			}
			int max=p[0].getMark();
			int j=0;
			for(int i=0;i<p.length;i++) {
				if(p[i].getMark()>max)
				{
					j=i;
				}
			}
		System.out.println("The highest score is "+p[j].getMark()+" is from "+p[j].getName());
	}

}
