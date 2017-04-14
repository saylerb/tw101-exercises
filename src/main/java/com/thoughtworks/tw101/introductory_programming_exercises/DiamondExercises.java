package com.thoughtworks.tw101.introductory_programming_exercises;

import static java.lang.Math.abs;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8, null);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for (int i = 0; i < n; i++) {

            Integer paddingTotal = n - i;
            Integer starTotal = 2 * i + 1;

            for (int padIndex = 0; padIndex < paddingTotal; padIndex++) {
                System.out.print(" ");
            }

            for (int starIndex = 0; starIndex < starTotal; starIndex++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n, String name) {

        Integer totalLines = (n * 2) - 1;
        Integer middleRowIndex = (totalLines - 1) / 2;

        for (int rowIndex = 0; rowIndex < totalLines; rowIndex++) {

            Integer paddingTotal = abs(middleRowIndex - rowIndex);
            Integer starTotal = totalLines - (paddingTotal * 2);

            for (int padIndex = 0; padIndex < paddingTotal; padIndex++) {
                System.out.print(" ");
            }

            if (rowIndex == middleRowIndex && !isBlank(name)) {

                Integer namePadding = (starTotal / 2) - (name.length() / 2);

                for (int namePadIndex = 0; namePadIndex < namePadding; namePadIndex++) {
                    System.out.print(" ");
                }

                System.out.print("Brian");
            } else {
                for (int starIndex = 0; starIndex < starTotal; starIndex++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }

    private static boolean isBlank(String string) {
        return string == null || "".equals(string);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        drawADiamond(n, "Brian");
    }
}
