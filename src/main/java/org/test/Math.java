package org.test;

import java.util.Scanner;

public class Math implements Questionist{
    @Override
    public void test() {
        int result = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is your Math test");
        System.out.println("First question:");
        System.out.println("2+5");
        System.out.println("Answer: " + "\n" + "1. 6" + "\n" + "2. 7" + "\n" + "3. 10");
        result = scanner.nextInt();
        if (result == 2) {
            counter++;
        }
        System.out.println("Second question:");
        System.out.println("10/10");
        System.out.println("Answer: " + "\n" + "1. 0" + "\n" + "2. 2" + "\n" + "3. 1");
        result = scanner.nextInt();
        if (result == 3) {
            counter++;
        }
        System.out.println("Third question:");
        System.out.println("5x5");
        System.out.println("Answer: " + "\n" + "1. 25" + "\n" + "2. 10" + "\n" + "3. 1");
        result = scanner.nextInt();
        if (result == 1) {
            counter++;
        }
        System.out.println("You have " + counter + " right answer(s) by the Math test!");
    }
}

