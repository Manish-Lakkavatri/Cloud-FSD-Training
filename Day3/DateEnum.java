package Day3;

import java.util.Scanner;

enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class DateEnum {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter Day : ");
    Day day = Day.valueOf(sc.next().toUpperCase());

    int newIndex = (day.ordinal() + 30) % 7;

    Day result = Day.values()[newIndex];

    if(result == Day.SATURDAY) {
        result = Day.MONDAY;
    }
    else if(result == Day.SUNDAY)
    {
        result = Day.MONDAY;
    }

    System.out.println("After 30 days : " + result);
}

}
