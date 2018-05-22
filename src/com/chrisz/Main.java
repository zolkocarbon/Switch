package com.chrisz;

public class Main {

    public static void main(String[] args) {
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break; // come out of code block
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was " + switchValue);
                break;
            default:
                System.out.println("Was not 1-5");
                break; // optional since it's the last one but recommended to leave here
        }

        // ********* Challenge
        System.out.println(testString('f'));

        // ********* Challenge 2
        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("not Jan or Feb");
                break;
        }

        // ************* Challenge 3
        printDayOfTheWeek(9);

        // ************* Challenge 4
        printNumberInWord(4);

        // ************* Challenge 5
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(12,2000));

    }

    public static String testString(char testCharacter) {
        String result = "";
        switch (testCharacter) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                result = "Input character is A, B, C, D or E";
                break;
            default:
                result = "Input character not matched";
                break;
        }
        return result;
    }

    // ************ Challenge 3
    public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    // ************* Challenge 4
    public static void printNumberInWord(int number) {
        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    // ************* Challenge 5
    public static boolean isLeapYear(int year) {
       if(year >= 1 && year <= 9999) {
           if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
               return true;
           }
       }
       return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;
        }
    }

}
