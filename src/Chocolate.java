/**
 * @class: Speed Light
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 26, 2023
 * @description: In this software, I'll use the quantity of bags to calculate how many additional bags you'll need to
  fill each bag with three chocolates instead of two.
 */

public class Chocolate {
    public static void main(String[] args){
        // original amount of chocolates in a bag
        int originalBags = 9;
        // Chocolates in each bag
        int chocolatesPerBag = 2;
        // Amount of chocolates you can add to bag
        int chocolatesToAdd = 3;

        int totalChocolatesToAdd = originalBags * (chocolatesPerBag + chocolatesToAdd);
        int numberOfBagsToAdd = totalChocolatesToAdd / 3;
        System.out.println("Number of bags to add: " + numberOfBagsToAdd);



    }
}
//Dr. Park's feedback: your code is not correctly written. It has the logic error. 9 bags * 2 chocolates = 18 chocolates. Then, you will need to divide 18 by 3. 
//so you only need 6 bags. 
