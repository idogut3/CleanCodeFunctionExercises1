//
//  NumberGuessGame.java
//
//  Created by Apollo Zhu on 7/21/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//
package Happy_birthday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        System.out.println("When is your birthday? Enter dd/MM/yyyy");
        Date BirthdayDate = new SimpleDateFormat("dd/MM/yyyy").parse(console.nextLine());
        Calendar birthday_cal = Calendar.getInstance();
        birthday_cal.setTime(BirthdayDate);
        if ((birthday_cal.get(Calendar.DAY_OF_MONTH) == Calendar.getInstance().get((Calendar.DAY_OF_MONTH)) &&
                birthday_cal.get(Calendar.MONTH) == Calendar.getInstance().get((Calendar.MONTH)))) {
            System.out.print("Happy Birthday! “Birthdays are a new start, a fresh beginning and a time to pursue new endeavors with new goals. Move forward with confidence and courage. You are a very special person. May today and all of your days be amazing!”");
        } else {
            System.out.print("It's not your birthday...");
        }
    }
}