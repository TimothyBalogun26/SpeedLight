/**
 * @class: Speed Light
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 26, 2023
 * @description: In this program I will be using the formula for area and perimeter to calculate the area and perimeter of the circle
 */


public class Circle {
    public static void main(String[] args){
        //The radius of the circle
        double radius = 9.5;
        // How to calculate the area of the circle
        double area = radius * radius * Math.PI;
        // How to calculate the perimeter of the circle
        double perimeter = 2 * radius * Math.PI;

        System.out.println("The area of the circle is " + area );
        System.out.println("The perimeter of the circle is " + perimeter);

    }
}
