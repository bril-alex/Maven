package org.test;

import java.util.Scanner;

public class Chemistry implements Questionist{
    @Override
    public void test() {
        int result = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is your History test");
        System.out.println("First question:");
        System.out.println("What is the water formula?");
        System.out.println("Answer: " + "\n" + "1. H₂O" + "\n" + "2. ₂HO" + "\n" + "3. C₂H₆");
        result = scanner.nextInt();
        if (result == 1) {
            counter++;
        }
        System.out.println("Second question:");
        System.out.println("What is the alcohol formula?");
        System.out.println("Answer: " + "\n" + "1. С2Н6О" + "\n" + "2. С2Н5ОH" + "\n" + "3. HNO3");
        result = scanner.nextInt();
        if (result == 1 | result == 2) {
            counter++;
        }
        System.out.println("Third question:");
        System.out.println("What is the sulfuric acid formula?");
        System.out.println("Answer: " + "\n" + "1. HNO3" + "\n" + "2. O2" + "\n" + "3. H2SO4");
        result = scanner.nextInt();
        if (result == 3) {
            counter++;
        }
        System.out.println("You have " + counter + " right answer(s) by the Chemistry test!");
    }
}

