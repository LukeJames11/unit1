package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter color");
        String   color = input.nextLine();

        System.out.println("please enter a number");
        int number = input.nextInt();

        int count = 0;

        while(count < number) {
            System.out.println(color);
            count = count + 1;
        }
    
    }
    }
}