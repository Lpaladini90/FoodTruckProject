####                         :truck:              **FoodTruckProject**                 :truck:                              ####


##                                              **Description Overview**                                                      ##


Users will input and rate a list of food trucks, then view the average rating and the highest-rated truck.


##                                                    **Structure**                                                           ##  

- The app starts with a message from the app, welcoming the user to the first annual food truck challenger. Another print
    out explains what the user is about to do in the app and the rules that apply.


- I started by creating a food truck array, that could only carry a max of 5 trucks. :truck:

- I then created a for loop to allow the questions being asked to the user regarding the name, type and rating.

  - I set the for loop length to equal the length of the truck array so it could not run more times than allowed.

  - As each question is prompted inside the for loop, the user's input is store in values created to represent the field
      it should resemble.

  - However I gave the user the option to quit after they entered at least one truck's info and continue the app.

  -  I then created and instance of a food truck after all the user's inputs had been entered, in order to store the
      information correctly to one truck. This is inside the loop so each time the user puts in new info it will assign
      that info to a new truck as the for loop increments by 1.


- I wanted to try my hands at some basic ascii art so I drew a simple picture representing the 1st time this challenge has
    been created.

- After the ascii art, the program enters a while loop.

  - The while loop is needed to continue printing the menu screen until the user decides to quit the app program
      completely.

  - The menu displays a total of 4 options to the user.

        - The first option will display a list of all the food trucks in the challenge and all of its properties
            associated with the trucks, but only pertaining to the amount of food trucks entered above. :truck:

            - This includes the following: Name, Type, Rating (given by the user) and the
                special numeric Id that the program as automatically assigned to each food truck.
                ( This ID was not a user input but instead a behind the scene piece of code that is assigned
                as each truck is created.)

        - The second option in the menu will display the average rating of all the food trucks entered.:truck:

        - The third option will display the food truck that has the highest rating of all, therefor being crowned as the
            winner of the challenge, :trophy: and will display all of the properties of that specific food truck and non of
            the other contestants.

        - The fourth option is a simple quit button, allowing the user to leave the app completely.:truck:

- In order to have the user enter the appropriate menu option they are wanting displayed, I created a switch.

- If the user inputs a number corresponding to the menu, the switch will take in a valid number and allow the user to
    see which information they want displayed. If not then the screen will prompt and statement letting them know
    they have chosen and invalid number and to pick  a valid number 1-4.

  - If option 1 on the menu was chosen, it will enter case 1 on the switch.

        - In case 1, The app will display a message saying: here is a list of the food trucks that they have entered.

          - In order to display this information, I ran a for loop inside the case to first account for the correct
              amount of trucks the user entered, to make sure it did not have an error if the user did not enter the full
              amount of trucks that they could enter, in this case being 5. If I did not account for this, and the user
              only entered 2 trucks, the program would scream a null error because there would be no values in the
              third, fourth and fifth slots in the truck array.

          - After I got passed this issue, I used a sysout to display the truck array and the current position in it,
              based on my for loop, and called the toString method that was coming out of FoodTruck class, which would
              inherently  display all of the trucks information that I put into the method. In this case, it will display
              the trucks ID, Name, Type of food, and the Rating. As the array continued in the for loop, incrementing
              as it runs, each truck that was entered is what will be displayed along with the corresponding info.

  - If option 2 on the menu was chosen, it will enter case 2 on the switch.

      - In case 2, the app will display a message stating: The average rating of all food trucks in the challenge are:

        - To display this information, I used another for loop, identical to to case 1, also accounting for the same
            null error that could arise.

        - Like the last two cases, I first accounted for any null issues that may come up.

        - The object of this case is to display the average rating of all food trucks combined. To do this I created a
            formula that collected the sum of the first truck in the array, added it to the second truck, which in
            turn created a new sum and continued until it went through all of the food trucks that were entered.

              - Once the sum was calculated, I need to divide the sum by the number of food trucks that were entered. To
                  do this I added a counter to keep track of how many food trucks were in the array.

              - To now find the average, I divided the sum by the count(amount of food trucks in the array). This gave
                  me the total average of all the ratings and I was able to display that number to the user.

  - If option 3 on the menu was chosen, it will enter case 3 on the switch.

        - In case 3 the goal was to display all the information of the highest rated food truck; including name, type,
            rating, and the numeric ID that was automatically generated to the truck

            - In order to display this information, I first had to figure out which truck had the highest rating.

              - I created a for loop for this problem, again accounting for the same null error issue in the
                  previous cases.

                  - After checking for null errors, I created an if condition/statement to determine the highest rating.

                  - I had to create a variable called highestRating and have that equal the first position in the array,
                      but not just the object in the array but the rating that was assigned to the object. To do this
                      I called my getRating method from my Food Truck class

                  - I then compared that number to the other trucks(if any) in the array. If the first number was less
                      than the number it was comparing, it would not enter the if statement, and instead the for loop
                      would continue and check the next object's rating in the array.
                  - Once the condition was true, meaning there was an arrays object's rating that was higher than them
                      compared rating, it would enter the if statement and reassign the highest rating to the specific
                      food truck.

                  - I used a counter to keep track of the position in the array= equalling it to the current index.

                  - Then outside my for loop I printed out the truckArray and the count that equal its position in the
                      in the formula to print out that specific truck in the array. I then called my .toString method
                      which was setup to print all the information that the user had inputted earlier, along with the
                      automatically assigned numeric ID.

                      - This food truck with the highest truck rating was the winner of the challenge.
                          They get a :trophy:


  - If option 4 was chosen from the menu, it will enter case 4 in the switch.

          - In this case, the app printed a statement saying thanks for participating.
              The while loop was now reassigned to false, breaking the loop and ending the program.


        - I did account for the possibility that user may enter a number outside of the menu.

          - In this case a statement was presented notifying them to choose another number in the menu.








































## What the program must do ##



## What I learned ##
