

	import java.util.Scanner;

	public class MainClass 
	{
	   public static void main( String args[] )
	   {
	      Scanner input = new Scanner( System.in );

	      int number1;
	      int number2;

	      System.out.print( "Enter first integer: " ); // prompt 
	      number1 = input.nextInt(); // read first number from user 

	      System.out.print( "Enter second integer: " ); // prompt 
	      number2 = input.nextInt(); // read second number from user 
	      
	      if ( number1 < 0 || number2 < 0 ) 
		         System.out.printf( "one number is negative\n" );
	      
	      
	      if ( number1 == number2 ) 
	         System.out.printf( "%d == %d\n", number1, number2 );

	      if ( number1 != number2 )
	         System.out.printf( "%d != %d\n", number1, number2 );

	      if ( number1 < number2 )
	         System.out.printf( "%d < %d\n", number1, number2 );

	      if ( number1 > number2 )
	         System.out.printf( "%d > %d\n", number1, number2 );

	      

	      if ( number1 >= number2 )
	         System.out.printf( "%d >= %d\n", number1, number2 );

	   } 

	}

