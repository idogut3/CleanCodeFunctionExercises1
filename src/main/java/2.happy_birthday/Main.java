package happy_birthday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static Date generateDateByUser(String userInput) throws ParseException {
        return new SimpleDateFormat("dd/MM/yyyy").parse(userInput);
    }
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("When is your birthday? Enter dd/MM/yyyy");

        Date BirthdayDate = generateDateByUser(scanner.nextLine());

        Calendar birthdayCal = Calendar.getInstance();
        birthdayCal.setTime(BirthdayDate);

        if ((birthdayCal.get(Calendar.DAY_OF_MONTH) == Calendar.getInstance().get((Calendar.DAY_OF_MONTH)) &&
                birthdayCal.get(Calendar.MONTH) == Calendar.getInstance().get((Calendar.MONTH)))) {
            System.out.print("Happy Birthday! “Birthdays are a new start, a fresh beginning and a time to pursue new endeavors with new goals. Move forward with confidence and courage. You are a very special person. May today and all of your days be amazing!”");
        } else {
            System.out.print("It's not your birthday...");
        }
    }
}