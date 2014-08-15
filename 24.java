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
		int[][] numbersToTry = new int[][]{
			{ a, b, c, d },
			{ a, b, d, c },
			{ a, c, b, d },
			{ a, c, d, b },
			{ a, d, c, b },
			{ a, d, b, c },
			{ b, a, c, d },
			{ b, a, d, c },
			{ b, c, a, b },
			{ b, c, d, a },
			{ b, d, a, c },
			{ b, d, c, a },
			{ c, a, b, d },
			{ c, a, d, b },
			{ c, b, a, d },
			{ c, b, d, a },
			{ c, d, a, b },
			{ c, d, b, a },
			{ d, a, b, c },
			{ d, a, c, b },
			{ d, b, a, c },
			{ d, b, c, a },
			{ d, c, a, b },
			{ d, c, b, a },
			
		};
	for(numbersToTry[i], )
			
				
	}		
}
