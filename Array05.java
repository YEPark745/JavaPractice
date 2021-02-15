/*
 * create a class Sport, having essential attributes for athletes: 
 * name, weight, and height. find the Height of lightest athlete, 
 * and Weight of tallest athlete and give the names as well.
 */
import java.util.Scanner;

class Sport{
	String name;
	int weight;
	int height;
	
	public Sport(String name, int weight, int height) {
		this.name=name;
		this.weight=weight;
		this.height=height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
}

public class Array05 {

	public static void main(String[] args) {
		int i=0,j=0,max=0, min=0;
		Scanner in=new Scanner(System.in);
		Sport s[]=new Sport[3]; // instanceated
		
		for(i=0;i<s.length;i++) {
			//find the Height of lightest athlete
			System.out.println("Enter name");
			String name=in.next();
			System.out.println("Enter wieght");
			int weight=in.nextInt();
			System.out.println("ENter height");
			int height=in.nextInt();
			s[i]=new Sport(name, weight, height); //calling constractor. s is object name
		}
	//	for(i=0;i<s.length;i++) {}
		
		for(i=0;i<s.length;i++) {
			for(j=0;j<s.length-1;j++)
			if(s[j].weight>=s[j+1].weight) {
				int temp=s[j].weight;
				String temp1=s[j].name;
				int temp2=s[j].height;
				s[j].weight=s[j+1].weight;
				s[j].name=s[j+1].name;
				s[j].height=s[j+1].height;
				s[j+1].weight=temp;
				s[j+1].name=temp1;
				s[j+1].height=temp2;
				}
			}
		for(j=0;j<s.length;j++)
			System.out.println("The name is "+s[j].name+" and weight is "+s[j].weight+" and height is "+s[j].height);
		
	//	Weight of tallest athlete and give the names as well.
		for(i=0;i<s.length;i++) {
			for(j=0;j<s.length-1;j++)
			if(s[j].height<=s[j+1].height) {
				int temp=s[j].weight;
				String temp1=s[j].name;
				int temp2=s[j].height;
				s[j].weight=s[j+1].weight;
				s[j].name=s[j+1].name;
				s[j].height=s[j+1].height;
				s[j+1].weight=temp;
				s[j+1].name=temp1;
				s[j+1].height=temp2;

				}
			System.out.println("------------------");
			}
		for(j=0;j<s.length;j++)
			System.out.println("The name is "+s[j].name+" and height is "+s[j].height+" and weight is "+s[j].weight);
	}

}
