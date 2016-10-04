/**
 * This program computes the area of a
 * circle and prints it to screen.
 * @author Tom Brereton
 * @
 */

public class ExerciseOne{
    public static void main(String[] args){

        // We define the radius, ignoring units
        int radius = 5;

        // We calculate the Area with the
        // formula A = pi*r^2
        double Area = Math.PI*radius*radius;

        // We print the computed area to screen
        System.out.println(Area);
    }
}
