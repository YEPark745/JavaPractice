import java.util.*;
import java.util.ArrayList;


public class Quiz401 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Number "); //0
		al1.add(" is odd, "); //1
		al1.add(" is even, "); //2
		al1.add("not prime, "); //3
		al1.add("prime, "); //4
		al1.add("and not perfect."); //5
		al1.add("and perfect."); //6
		boolean flag=true;
		int sum=0;
		Scanner in=new Scanner(System.in);
		while(flag) {
			System.out.println("Wish to enter number?(yes or no)");
			String choice=in.next();
			if(choice.equalsIgnoreCase("no"))flag=false;
			else {
				System.out.println("Enter the number: ");
				al.add(in.nextInt());
			}
		}
		for(int i=0;i<al.size();i++) {
		if(al.get(i)%2==0) { // even number
			if(al.get(i)==2) { // 2 is the only one prime and even number
				System.out.println("1"+al1.get(0)+al.get(i)+al1.get(2)+al1.get(3)+al1.get(5));
			} else { 
				
//				if(al.get(i)%i==0) { //To find even number (except 2) that can be perfect number 1+2+3=6
//					sum=sum+i;
					if(sum==al.get(i)) //perfect number 1+2+3=6
					System.out.println("2"+al1.get(0)+al.get(i)+al1.get(2)+al1.get(3)+al1.get(6));//"2Number "+al.get(i)+" is even, not prime, and perfect"
//					} 
					else { //not perfect even number
							System.out.println("3"+al1.get(0)+al.get(i)+al1.get(2)+al1.get(4)+al1.get(5));//"3Number "+al.get(i)+" is even, not prime and not perfect, "
						}
			}
		
		} else { //odd number
			 if(al.get(i)%2!=0 && al.get(i)%3==0){  
			//	   System.out.println("4Number "+al.get(i)+" is odd, and not prime, not perfect");    
			//	 for(i = 3; i <= al.get(i); i += 2) {
			//	 if(al.get(i)%i!=0){      
					 System.out.println("4"+al1.get(0)+al.get(i)+al1.get(1)+al1.get(3)+al1.get(5));   
		
				 
			// } else {  
				 //for(i=2;i<=al.get(i)/2;i++){      
			//	  if(al.get(i)%i==0){      
			//	     System.out.println("5Number "+al.get(i)+" is odd, and prime number, not perfect number");      
			//	     flag=1;      
			//	     break;      
			//	    }      
			//	   }      
			//	   if(flag==0)  { System.out.println(n+" is prime number"); }  
			//	  }//end of else  
			//	}
			
			
			
		//	if(al.get(i)%i==0) {
		//		sum=sum+i;
		//		}
		//		if(sum==al.get(i)%i) {
		//		System.out.println("Number "+al.get(i)+" is odd, and not prime number, and not perfect");
		//		} else if(al.get(i)==0||al.get(i)==1){  
		//			   System.out.println(al1.get(0)+al.get(i)+al1.get(1)+al1.get(3)+al1.get(5));//"5Number "+al.get(i)+" is odd, and not prime, not perfect"
		//	 
				} 
			 else {
					System.out.println("5"+al1.get(0)+al.get(i)+al1.get(1)+al1.get(4)+al1.get(5));//"6Number "+al.get(i)+" is odd, not prime, and not perfect"
		//		}
			 }
		}
			}
		
		System.out.println("Contents of al: " + al);
	
	
	}
	}
	
