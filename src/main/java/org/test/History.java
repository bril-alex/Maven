package org.test;

import java.util.Scanner;

public class History implements Questionist{
    @Override
    public void test() {
        int result = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is your History test");
        System.out.println("First question:");
        System.out.println("In what year did Ukraine get independence?");
        System.out.println("Answer: " + "\n" + "1. 1989" + "\n" + "2. 1991" + "\n" + "3. 2001");
        result = scanner.nextInt();
        if (result == 2) {
            counter++;
        }
        System.out.println("Second question:");
        System.out.println("In what year Ukraine adopted a constitution?");
        System.out.println("Answer: " + "\n" + "1. 1996" + "\n" + "2. 1991" + "\n" + "3. 1994");
        result = scanner.nextInt();
        if (result == 1) {
            counter++;
        }
        System.out.println("Third question:");
        System.out.println("Whose was the first president of Ukraine?");
        System.out.println("Answer: " + "\n" + "1. Zelenskiy" + "\n" + "2. Yanukovich" + "\n" + "3. Kravchuk");
        result = scanner.nextInt();
        if (result == 3) {
            counter++;
        }
        System.out.println("You have " + counter + " right answer(s) by the Historic test!");
    }
}
