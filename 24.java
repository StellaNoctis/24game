import java.util.*;
class Untitled {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input four numbers: ");
		int a = keyboard.nextInt();
		if( a >9){
			System.out.println("Try Again");
			a = keyboard.nextInt();
		}
		int b = keyboard.nextInt();
		if( b >9){
			System.out.println("Try Again");
			b = keyboard.nextInt();
					
		}
		int c = keyboard.nextInt();
		if( c >9){
			System.out.println("Try Again");
			c = keyboard.nextInt();
					
		}
		int d = keyboard.nextInt();
		if( d >9){
			System.out.println("Try Again");
			d= keyboard.nextInt();
					
		}
		System.out.print("Your inputted numbers are " + a +" " +  b + " " + c + " " + d + ".");
		
		
		}
}