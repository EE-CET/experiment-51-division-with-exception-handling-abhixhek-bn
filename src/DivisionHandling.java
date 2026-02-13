import java.util.Scanner;

public class DivisionHandling {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
    		try{
			int div=a/b;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
    			System.out.println("Cannot divide by zero");
		}

        // TODO: Read two integers a and b
   	}     
        // TODO: Enclose the division in a try block
        
        // TODO: Catch ArithmeticException
        
}
