/**
 * This program takes user input in time format hh:mm.
 * Then, imagining an analogue clock, it calculates the
 * angle from the hour to minute hand, in an anti-clockwise
 * direction. This is done by calculating the difference 
 * of the angles for each of the clock hands.
 * @version 2016-09-30
 * @author Thomas Brereton
 */


public class ExerciseFive{
    public static void main(String[] args){
        // We split the input into separate variables
        // to perform calculations later
        String[] totalTimeParts = args[0].split(":");

        // We keep the hours and minutes within their max value
        // (12 and 60 respectively)
        // @param hours is hour hand
        // @param minutes is minute hand
        int hours = Integer.parseInt(totalTimeParts[0]) % 12;
        int minutes = Integer.parseInt(totalTimeParts[1]) % 60;
        
        System.out.println("Time is: " + hours + ":" + minutes);

        // We find the angles of the clock hands 
        int hoursToDegrees = (hours * 30);
        int minutesToDegrees = (minutes * 6);

        // We find how much the hour hand moves for each minute
        int hoursPlusMinutes = minutes / 2 + hoursToDegrees;
        int TimeDiff;

        System.out.println("Hours degrees and minute degrees: " + hoursPlusMinutes + ":" + minutesToDegrees);

        // We calculate the angle between the clock hands
        if (minutesToDegrees > hoursToDegrees){
            TimeDiff = 360 - (minutesToDegrees - hoursPlusMinutes);
        } else {
            TimeDiff = hoursPlusMinutes - minutesToDegrees;
        }

        // We print the angle to the terminal
        System.out.println("Difference between hours and mintutes: " + TimeDiff);
    }
}
