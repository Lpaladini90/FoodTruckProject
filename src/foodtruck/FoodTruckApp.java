package foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello and welcome to the first annual Food Truck Challenge");

		FoodTruck truckArray[] = new FoodTruck[5];

		for (int i = 0; i < truckArray.length; i++) {

			System.out.println("Enter the name of a food truck you sampled at.");
			String foodName = scanner.nextLine();
			if (foodName.equalsIgnoreCase("quit")) {
				break;

			} else {

				System.out.println("Enter the food type for the named food truck");
				String foodType = scanner.nextLine();

				System.out.println("Enter your rating 1.0 - 5.0 for the named food truck.");
				double rating = scanner.nextDouble();
				scanner.nextLine();

				truckArray[i] = new FoodTruck(foodName, rating, foodType);
			}
		}
		boolean keepLooping = true;
		while (keepLooping) {

			System.out.println("-------------------------------------------------");
			System.out.println("-             1. List all Food Trucks           -");
			System.out.println("-     2. List the avg rating of Food Trucks     -");
			System.out.println("-          3. Display the highest rating        -");
			System.out.println("-                  4. Quit                      -");
			System.out.println("-------------------------------------------------\n");

			String menuInput = scanner.next();

			if (menuInput.equals("1") || menuInput.equals("2") || menuInput.equals("3") || menuInput.equals("4")) {

				switch (menuInput) {

				case "1":
					System.out.println("Here is a list of food trucks challengers:");

					for (int i = 0; i < truckArray.length; i++) {
						if (truckArray[i] == null) {
							break;
						}
						System.out.println(truckArray[i].toString());

					}
					break;

				case "2":
					System.out.println("The average rating of food trucks in the challenge are:");
					double sum = 0;
					int count = 0;
					for (int i = 0; i < truckArray.length; i++) {
						if (truckArray[i] == null) {
							break;
						}
						sum += truckArray[i].getRating();
						count++;
					}
					double avg = sum / count;
					System.out.println(avg);

					break;

				case "3":
					System.out.println("The highest rated food truck, and winner of the challenge is:");

					double highestRating = truckArray[0].getRating();
					int counter = 0;
					for (int i = 0; i < truckArray.length; i++) {
						if (truckArray[i] == null) {
							break;
						}

						if (truckArray[i].getRating() > highestRating) {
							highestRating = truckArray[i].getRating();
							counter = i;

						}

					}
					System.out.println(truckArray[counter].toString());

					break;

				case "4":
					System.out.println("Thank you for participating in the food truck challenge!");
					keepLooping = false;
					return;

				default:
					System.out.println("This is an invalid option please enter a correct one; 1-4");
					break;
				}

			}

		}

	}

}
