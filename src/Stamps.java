/**
 * @class: Speed Light
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 26, 2023
 * @description: I'm calculating how many more stamps Jean has than Susan in this software. By calculating the difference
  between Jean's and Susan's stamp collections, I can determine the solution.
 *
 */


public class Stamps {
    public static void main(String[] args){
        // Total number of stamps Susan has collected
        int susanStamps = 8;
        // Total number of stamps Jean has collected
        int jeanStamps = 40;
        // I am subtracting Susan's stamps from Jean's stamps to calculate the difference
        int difference = (jeanStamps - susanStamps);

        System.out.println("Jean has " + difference + " more stamps than Susan");


    }
}
