package foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello and welcome to the first annual Food Truck Challenge");

		System.out.println(
				"As you sample from the variety of food trucks available, you will be asked to input their name,"
				+ " type of food offered and the rating you would give on a scale of 1-5");

		FoodTruck truckArray[] = new FoodTruck[5];

		for (int i = 0; i < truckArray.length; i++) {
			
			System.out.println("Please enter the name of a food truck you sampled at.");
			String foodName = scanner.nextLine();
			if (foodName.equalsIgnoreCase("quit")) {
				break;

			} else {

				System.out.println("Enter the food type that " + foodName + " offered.");
				String foodType = scanner.nextLine();

				System.out.println("Enter your rating for " + foodName + " on a scale of 1-5.");
				double rating = scanner.nextDouble();
				scanner.nextLine();
				truckArray[i] = new FoodTruck(foodName, rating, foodType);
				
			}
		}
				
				System.out.println("\n\n\n\n    **     ***   *******    ");
				System.out.println("   * *    *   *     *       ");
				System.out.println("  *  *    *         *       ");
				System.out.println("     *     * *      *       ");
				System.out.println("     *        *     *       ");
				System.out.println("     *    *  *      *       ");
				System.out.println("  *******  **       *       ");
				System.out.println("                            ");
				System.out.println("                                            	 ");
				System.out.println("   *********  *******    **    **     *******    ");
				System.out.println("       *         *     **  *  *  **   *			 ");
				System.out.println("       *         *     *    **    *   *****		 ");
				System.out.println("       *         *     *          *   *  	 	 ");
				System.out.println("       *      *******  *          *   *******    ");
				
				
				
				
			
		
		boolean keepLooping = true;
		while (keepLooping) {

			System.out.println("\n\n\n-------------------------------------------------");
			System.out.println("-             1. List all Food Trucks           -");
			System.out.println("-         2. Average rating of Food Trucks      -");
			System.out.println("-             3. Display the Winner!            -");
			System.out.println("-                  4. Quit                      -");
			System.out.println("-------------------------------------------------\n");

			int menuInput = scanner.nextInt();

			if (menuInput > 0 || menuInput < 5) {

				switch (menuInput) {

				case 1:
					System.out.println("Here is a list of the food trucks challengers:");

					for (int i = 0; i < truckArray.length; i++) {
						if (truckArray[i] == null) {
							break;
						}
						System.out.println(truckArray[i].toString());
						System.out.println();
					}
					break;

				case 2:
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

				case 3:
					System.out.println("The winner of the 2022 Food Truck Challenge is:");

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

				case 4:
					System.out.println("Thank you for participating in the food truck challenge!");
					keepLooping = false;
					return;

				default:
					System.out.println("This is an invalid option please enter a correct one; 1-4");
					break;
				}

			}

		}

		scanner.close();
	}

}
