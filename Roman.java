package manoharproblems;

import java.util.Scanner;

public class RomanToInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a roman number: ");
        String roman = sc.nextLine();

        int result = romanToInteger(roman);

        System.out.println(roman + " = " + result);

    }

    public static int romanToInteger(String roman) {

        int result = 0;
        for(int i=0; i<roman.length(); i++) {

            char ch = roman.charAt(i);

            if(ch == 'I') {
                result += 1;
            }
            else if(ch == 'V') {
                result += 5;
            }
            else if(ch == 'X') {
                result += 10;
            }
            else if(ch == 'L') {
                result += 50;
            }
            else if(ch == 'C') {
                result += 100;
            }
            else if(ch == 'D') {
                result += 500;
            }
            else if(ch == 'M') {
                result += 1000;
            }
        }

        return result;
    }

}