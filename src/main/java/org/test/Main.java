package org.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Questionist history = new History();
        Questionist math = new Math();
        Questionist chemistry = new Chemistry();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        int result = 0;
        while (isRunning){
            System.out.println("Choose your test: ");
            System.out.println("1. History test" + "\n" + "2. Math test" + "\n" + "3. Chemistry test" + "\n" + "4. Exit");
            result = scanner.nextInt();
            if (result == 1){
                history.test();
            }
            if (result == 2){
                math.test();
            }
            if (result == 3){
                chemistry.test();
            }
            if (result == 4){
                isRunning = false;
            }
        }
    }
}
