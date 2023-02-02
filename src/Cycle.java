/**
 * @class: Speed Light
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 26, 2023
 * @description: There are ten bicycles and an unknown number of tricycles in the cycle shop. Assume that when you count
  the wheels on bicycles and tricycles, you find that there are 47 of them. I'll be calculating the total number of tricycles at the shop in this code.
 */

public class Cycle {
    public static void main(String[] args){
        //The total number of bicycles
        int numberOfBicycles = 10;
        //The number of wheels on wheels calculated
        int totalNumber0fWheels = 47;
        //The equation to calculate the total number of tricycles located
        int number0fTricycles = totalNumber0fWheels - (numberOfBicycles * 2);
        System.out.println("The number of tricycles in the shop is: " + number0fTricycles);



    }
}
