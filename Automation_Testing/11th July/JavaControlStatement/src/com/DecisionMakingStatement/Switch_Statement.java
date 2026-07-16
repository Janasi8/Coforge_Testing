package com.DecisionMakingStatement;

public class Switch_Statement{
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName;
        // The switch statement evaluates the variable 'dayOfWeek'
        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break; // Exits the switch block immediately
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default: // Runs only if none of the above cases match
                dayName = "Invalid day";
                break;
        }
        System.out.println("The day is: " + dayName);
    }
}
