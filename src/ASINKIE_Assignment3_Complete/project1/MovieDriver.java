package project1;

import java.util.Scanner;

public class MovieDriver {
	public static Scanner sc = new Scanner(System.in);

	public static void method1() {
		Movie mv = new Movie();

		System.out.println("Enter the name of a movie");
		String name = sc.nextLine();
		mv.setTitle(name);
		System.out.println("Enter the rating of the movie");
		String rating = sc.nextLine();
		mv.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie");
		int tickets = sc.nextInt();
		sc.nextLine();
		mv.setSoldTickets(tickets);
		System.out.println(mv.toString());
	}

	public static void main(String[] args) {
		while (true) {
			MovieDriver.method1();
			System.out.println("Do you want to enter another? (Yes or No)");
			String imp = sc.nextLine();
			if (imp.equals("Yes")) {
				continue;
			}
			else if (imp.equals("No")) {
				System.out.println("Goodbye");
				break;
		}
			else{
				System.out.println("Do you want to enter another? (Yes or No)");
				imp = sc.nextLine();
				continue;
			}
	}
}
}