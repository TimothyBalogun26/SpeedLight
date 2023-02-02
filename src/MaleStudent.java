/**
 * @class: Speed Light
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 26, 2023
 * @description: In this project I will be using subtraction to depict how many male students are in the middle school
   using number of females at the school and the total number of students.
 *
 */

public class MaleStudent {
    public static void main(String[] args){
        // Total number of students in the middle school
            int totalNumberOfStudents = 389;
        // Total number of female students in the middle school
            int totalNumberOfFemaleStudents = 175;
        // How to calculate the total number of male students in the school
            int maleStudents = totalNumberOfStudents - totalNumberOfFemaleStudents;

            System.out.println("The number of male students is " + maleStudents + " in the middle school." );



    }
}
