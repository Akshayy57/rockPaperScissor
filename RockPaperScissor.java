import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissor");
		System.out.println("-----------------");
		System.out.println("Make your Choice");
		int userChoice = sc.nextInt();

		int randChoice = (int) (Math.random() * 3) + 1;

		switch (userChoice){
			case 1 -> System.out.println("Your Choice : Rock");
			case 2 -> System.out.println("Your Choice : Paper");
			case 3 -> System.out.println("Your Choice : Scissor");
		}

		switch (randChoice){
			case 1 -> System.out.println("Opponent's Choice : Rock");
			case 2 -> System.out.println("Opponent's Choice : Paper");
			case 3 -> System.out.println("Opponent's Choice : Scissor");
		}


		if((userChoice == 1 && randChoice == 2) || (userChoice == 2 && randChoice == 3) || (userChoice == 3 && randChoice == 1)){
			System.out.println("You Lose");
		} else if((userChoice == 2 && randChoice == 1) || (userChoice == 3 && randChoice == 2) || (userChoice == 1 && randChoice == 3)){
			System.out.println("You Win");
		} else {
			System.out.println("Tie");
		}

	}

}
