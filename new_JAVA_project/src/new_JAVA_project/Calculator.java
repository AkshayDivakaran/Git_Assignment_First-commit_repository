package new_JAVA_project;
//Calculator which adds, subtract, multiply & divide two integers
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the first number =");
		int a = scan.nextInt();
		
		System.out.println("Enter the second number =");
		int b= scan.nextInt();	
		Calculator.sum(a,b);
		Calculator.subtract(a,b);
		Calculator.multiply(a,b);
		Calculator.division(a,b);		
	}
	
	//Addition of two integers
    public static int sum(int a,int b) {
    	int sum = a+b;
    	System.out.println("The sum is ="+sum);
    	return sum;	
    }
    
    //Subtraction of two integers
    public static int subtract(int a, int b) {
    	int subtract = a-b;
    	System.out.println("The difference is ="+subtract);
    	return subtract;
    }
    
    //Multiplication of two integers
    public static int multiply(int a, int b){
    	int multiply = a*b;
    	System.out.println("The product is ="+multiply);
    	return multiply;
    	}
    
    //Division of two integers
    public static int division(int a, int b) {
    	if (b==0){
    		System.out.println("Invalid output");
    		return b;
    	}
    	else{
    		int division = a/b;
    		System.out.println("The quotient is ="+division);
    		return division; 		
    	}
    }
}
