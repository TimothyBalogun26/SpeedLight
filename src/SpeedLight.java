/**
 * @class: Speed Light
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 26, 2023
 * @description: I used the interval between a lightning flash and the sound of thunder to determine the distance to a
  lightning strike in this SpeedLight.java software.
 */

public class SpeedLight {
    public static void main(String[] args){

        //Light travels at the speed of 340 m/s
        int SPEED_OF_LIGHT = 340;

        //time elapsed between lightning and thunder
        int timeElapsed = 5;

        //calculates the distance between the speed of light and the time elapsed
        int distance = SPEED_OF_LIGHT * timeElapsed;

        System.out.println("The distance to the lightning strike is " + distance + " meters");







    }
}