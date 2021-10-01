package homework;

import java.util.Scanner;

public class ComparaisionBetweenThreeNumbers {
	
	
	
	
	



   public static void getGreaterNumber() {
	   
	   

		Scanner scan= new Scanner(System.in);
		
		
		System.out.println( "please enter your num1 ");
	    int  num1=scan.nextInt();
	    
		System.out.println("please enter your num2");
	    int num2=scan.nextInt();
		
		System.out.println(  "please enter your num3");
		 int num3= scan.nextInt();
		 
		 
		if( num1<num2 && num2>num3) {System.out.println("the greatest number is "+num2);
			
				}
		else if (num1>num2 && num1>num3  )
			
			
			System.out.println( "the gretest number is  "+num1 );
		
		else if ( num3>num2 && num3>num1) {
			System.out.println("the greatest number is "+num3 );
			}
		
		else if ( num3==num2 && num2==num1 &&  num1==num3) 
		{
			 
			 System.out.println("all numbers are equal ");
		  
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
   
	
	}
	


	 
	



public static void main(String[] args) {
//	ComparaisionBetweenThreeNumbers HomeWork = new ComparaisionBetweenThreeNumbers();
	
	ComparaisionBetweenThreeNumbers.getGreaterNumber();
	
}
}







