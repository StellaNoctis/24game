import java.util.*;
class Untitled {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input four numbers: ");
		int a = keyboard.nextInt();
		while( a >9){
			System.out.println("Try Again");
			a = keyboard.nextInt();
		}
		int b = keyboard.nextInt();
		while( b >9){
			System.out.println("Try Again");
			b = keyboard.nextInt();
					
		}
		int c = keyboard.nextInt();
		while( c >9){
			System.out.println("Try Again");
			c = keyboard.nextInt();
					
		}
		int d = keyboard.nextInt();
		while( d >9){
			System.out.println("Try Again");
			d= keyboard.nextInt();
					
		}
		System.out.println("Your inputted numbers are " + a +" " +  b + " " + c + " " + d + ".");
		double answer = 0;
		double[][] numbersToTry = new double[][]{
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
	for(int i =0 ;i<24; i++ ){
		for(int j = 0; j< 1; j++){
			
			double answer0 = (numbersToTry[i][0] + numbersToTry[i][1] + numbersToTry[i][2] + numbersToTry[i][3]);			double answer1 = (numbersToTry[i][0] + numbersToTry[i][1] + numbersToTry[i][2] - numbersToTry[i][3]);			double answer2 = (numbersToTry[i][0] + numbersToTry[i][1] + (numbersToTry[i][2] * numbersToTry[i][3]));			double answer3 = (numbersToTry[i][0] + numbersToTry[i][1] + (numbersToTry[i][2] / numbersToTry[i][3]));			double answer4 = (numbersToTry[i][0] + numbersToTry[i][1] - numbersToTry[i][2] + numbersToTry[i][3]);			double answer5 = (numbersToTry[i][0] + numbersToTry[i][1] - numbersToTry[i][2] - numbersToTry[i][3]);			double answer6 = (numbersToTry[i][0] + numbersToTry[i][1] - (numbersToTry[i][2] * numbersToTry[i][3]));			double answer7 = (numbersToTry[i][0] + numbersToTry[i][1] - numbersToTry[i][2] / numbersToTry[i][3]);			double answer8 = (numbersToTry[i][0] + (numbersToTry[i][1] * numbersToTry[i][2]) + numbersToTry[i][3]);			double answer9 = (numbersToTry[i][0] + (numbersToTry[i][1] * numbersToTry[i][2]) - numbersToTry[i][3]);			double answer10 = (numbersToTry[i][0] + (numbersToTry[i][1] * numbersToTry[i][2] * numbersToTry[i][3]));			double answer11 = (numbersToTry[i][0] + ((numbersToTry[i][1] * numbersToTry[i][2]) / numbersToTry[i][3]));			double answer12 = (numbersToTry[i][0] + (numbersToTry[i][1] / numbersToTry[i][2]) + numbersToTry[i][3]);			double answer13 = (numbersToTry[i][0] + (numbersToTry[i][1] / numbersToTry[i][2]) - numbersToTry[i][3]);			double answer14 = (numbersToTry[i][0] + ((numbersToTry[i][1] / numbersToTry[i][2]) * numbersToTry[i][3]));			double answer15 = (numbersToTry[i][0] + ((numbersToTry[i][1] / numbersToTry[i][2]) / numbersToTry[i][3]));
			double answer16 = (numbersToTry[i][0] - numbersToTry[i][1] + numbersToTry[i][2] + numbersToTry[i][3]);			double answer17 = (numbersToTry[i][0] - numbersToTry[i][1] + numbersToTry[i][2] - numbersToTry[i][3]);			double answer18 = (numbersToTry[i][0] - numbersToTry[i][1] + (numbersToTry[i][2] * numbersToTry[i][3]));			double answer19 = (numbersToTry[i][0] - numbersToTry[i][1] + (numbersToTry[i][2] / numbersToTry[i][3]));			double answer20 = (numbersToTry[i][0] - numbersToTry[i][1] - (numbersToTry[i][2] + numbersToTry[i][3]));
			double answer21 = (numbersToTry[i][0] - numbersToTry[i][1] - numbersToTry[i][2] - numbersToTry[i][3]);			double answer22 = (numbersToTry[i][0] - numbersToTry[i][1] - (numbersToTry[i][2] * numbersToTry[i][3]));
			double answer23 = (numbersToTry[i][0] - numbersToTry[i][1] - (numbersToTry[i][2] / numbersToTry[i][3]));
			double answer24 = (numbersToTry[i][0] - (numbersToTry[i][1] * numbersToTry[i][2]) + numbersToTry[i][3]);
			double answer25 = (numbersToTry[i][0] - (numbersToTry[i][1] * numbersToTry[i][2]) - numbersToTry[i][3]);
			double answer26 = (numbersToTry[i][0] - numbersToTry[i][1] * numbersToTry[i][2] * numbersToTry[i][3]);
			double answer27 = (numbersToTry[i][0] - ((numbersToTry[i][1] * numbersToTry[i][2]) / numbersToTry[i][3]));
			double answer28 = (numbersToTry[i][0] - (numbersToTry[i][1] / numbersToTry[i][2]) + numbersToTry[i][3]);
			double answer29 = (numbersToTry[i][0] - (numbersToTry[i][1] / numbersToTry[i][2]) - numbersToTry[i][3]);
			double answer30 = (numbersToTry[i][0] - ((numbersToTry[i][1] / numbersToTry[i][2]) * numbersToTry[i][3]));
			double answer31 = (numbersToTry[i][0] - ((numbersToTry[i][1] / numbersToTry[i][2]) / numbersToTry[i][3]));
			double answer32 = (numbersToTry[i][0] * numbersToTry[i][1] + numbersToTry[i][2] + numbersToTry[i][3]);			double answer33 = (numbersToTry[i][0] * numbersToTry[i][1] + numbersToTry[i][2] - numbersToTry[i][3]);			double answer34 = ((numbersToTry[i][0] * numbersToTry[i][1]) + (numbersToTry[i][2] * numbersToTry[i][3]));			double answer35 = ((numbersToTry[i][0] * numbersToTry[i][1]) + (numbersToTry[i][2] / numbersToTry[i][3]));			double answer36 = ((numbersToTry[i][0] * numbersToTry[i][1]) - numbersToTry[i][2] + numbersToTry[i][3]);			double answer37 = ((numbersToTry[i][0] * numbersToTry[i][1]) - numbersToTry[i][2] - numbersToTry[i][3]);			double answer38 = ((numbersToTry[i][0] * numbersToTry[i][1]) - (numbersToTry[i][2] * numbersToTry[i][3]));			double answer39 = ((numbersToTry[i][0] * numbersToTry[i][1]) - (numbersToTry[i][2] / numbersToTry[i][3]));			double answer40 = ((numbersToTry[i][0] * numbersToTry[i][1]) * numbersToTry[i][2] + numbersToTry[i][3]);			double answer41 = ((numbersToTry[i][0] * numbersToTry[i][1]) * numbersToTry[i][2] - numbersToTry[i][3]);			double answer42 = ((numbersToTry[i][0] * numbersToTry[i][1]) * numbersToTry[i][2] * numbersToTry[i][3]);			double answer43 = (((numbersToTry[i][0] * numbersToTry[i][1]) * numbersToTry[i][2]) / numbersToTry[i][3]);			double answer44 = (((numbersToTry[i][0] * numbersToTry[i][1]) / numbersToTry[i][2]) + numbersToTry[i][3]);			double answer45 = (((numbersToTry[i][0] * numbersToTry[i][1]) / numbersToTry[i][2]) - numbersToTry[i][3]);			double answer46 = (((numbersToTry[i][0] * numbersToTry[i][1]) / numbersToTry[i][2]) * numbersToTry[i][3]);			double answer47 = (((numbersToTry[i][0] * numbersToTry[i][1]) / numbersToTry[i][2]) / numbersToTry[i][3]);
			double answer48 = ((numbersToTry[i][0] / numbersToTry[i][1]) + numbersToTry[i][2] + numbersToTry[i][3]);			double answer49 = ((numbersToTry[i][0] / numbersToTry[i][1]) + numbersToTry[i][2] - numbersToTry[i][3]);			double answer50 = ((numbersToTry[i][0] / numbersToTry[i][1]) + (numbersToTry[i][2] * numbersToTry[i][3]));			double answer51 = ((numbersToTry[i][0] / numbersToTry[i][1]) + (numbersToTry[i][2] / numbersToTry[i][3]));			double answer52 = ((numbersToTry[i][0] / numbersToTry[i][1]) - numbersToTry[i][2] + numbersToTry[i][3]);			double answer53 = ((numbersToTry[i][0] / numbersToTry[i][1]) - numbersToTry[i][2] - numbersToTry[i][3]);			double answer54 = ((numbersToTry[i][0] / numbersToTry[i][1]) - (numbersToTry[i][2] * numbersToTry[i][3]));			double answer55 = ((numbersToTry[i][0] / numbersToTry[i][1]) - (numbersToTry[i][2] / numbersToTry[i][3]));			double answer56 = (((numbersToTry[i][0] / numbersToTry[i][1]) * numbersToTry[i][2]) + numbersToTry[i][3]);			double answer57 = (((numbersToTry[i][0] / numbersToTry[i][1]) * numbersToTry[i][2]) - numbersToTry[i][3]);			double answer58 = (((numbersToTry[i][0] / numbersToTry[i][1]) * numbersToTry[i][2]) * numbersToTry[i][3]);			double answer59 = (((numbersToTry[i][0] / numbersToTry[i][1]) * numbersToTry[i][2]) / numbersToTry[i][3]);			double answer60 = (((numbersToTry[i][0] / numbersToTry[i][1]) / numbersToTry[i][2]) + numbersToTry[i][3]);			double answer61 = (((numbersToTry[i][0] / numbersToTry[i][1]) / numbersToTry[i][2]) - numbersToTry[i][3]);			double answer62 = (((numbersToTry[i][0] / numbersToTry[i][1]) / numbersToTry[i][2]) * numbersToTry[i][3]);			double answer63 = (((numbersToTry[i][0] / numbersToTry[i][1]) / numbersToTry[i][2]) / numbersToTry[i][3]); 
			
			if(answer0 == 24)
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);
			else if(answer1 == 24)
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);
			else if(answer2 == 24)
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);
			else if(answer3 == 24)
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);
			else if(answer4 == 24)
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);
			else if(answer5 == 24)
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);
			else if(answer6 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer7 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);			else if(answer8 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer9 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer10 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer11 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);			else if(answer12 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer13 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer14 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer15 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " + " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);
			else if(answer16 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer17 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer18 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer19 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);			else if(answer20 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer21 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer22 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer23 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);			else if(answer24 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer25 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer26 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer27 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);			else if(answer28 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer29 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer30 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer31 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " - " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);
			else if(answer32 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer33 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer34 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer35 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);			else if(answer36 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer37 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer38 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer39 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);			else if(answer40 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer41 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer42 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer43 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);			else if(answer44 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer45 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer46 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer47 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " * " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);
			else if(answer48 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer49 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer50 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer51 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " + " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);			else if(answer52 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer53 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer54 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer55 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " - " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);			else if(answer56 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer57 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer58 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer59 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " * " + numbersToTry[i][2] + " / " + numbersToTry[i][3]);			else if(answer60 ==24) 	
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " + " + numbersToTry[i][3]);			else if(answer61 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " - " + numbersToTry[i][3]);			else if(answer62 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " * " + numbersToTry[i][3]);			else if(answer63 ==24) 
				System.out.println("It is possible to get 24 by using " + numbersToTry[i][0] + " / " + numbersToTry[i][1] + " / " + numbersToTry[i][2] + " / " + numbersToTry[i][3]); 
			else {
				System.out.println(" It is impossible to achieve 24 with the following numbers " + a + " " +  b + " " + c + " " + d + ".");
			}
		
	
			
				
	}		
}
}
}