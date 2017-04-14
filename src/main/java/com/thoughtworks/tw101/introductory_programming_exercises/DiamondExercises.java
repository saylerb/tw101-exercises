package com.thoughtworks.tw101.introductory_programming_exercises;

import static java.lang.Math.abs;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int num = n - i; num > 0; num--) {
                System.out.print(" ");
            }

            for (int asterisks = 0; asterisks < i + (i + 1); asterisks++) {
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
    private static void drawADiamond(int n) {
        Integer totalLines = (n * 2) - 1;
        Integer middleRowIndex = (totalLines - 1) / 2;

        for (int i = 0; i < totalLines; i++) {

            Integer padding = abs(middleRowIndex - i);

            for (int num = 0; num < padding; num++) {
                System.out.print(" ");
            }

            for (int asterisks = 0; asterisks < totalLines - (padding * 2); asterisks++) {
                System.out.print("*");
            }

            System.out.println();
        }

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

    }
}
