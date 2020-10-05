package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

                System.out.println("whats the pasword");

                        Scanner input = new Scanner(System.in);

        String answer1 = input.nextLine();

        if (answer1.equals("0000")){
            System.out.println("that is the right pasword");
            System.out.println("i like to run cc");
        }

        else{
        System.out.println("ERROR!");
                System.out.println("please enter password");
                String answer2 = input.nextLine();
                if (answer2.equals("0000")){
            System.out.println("that is the right pasword");
            System.out.println("i like to run cc");
                }

            else{
        System.out.println("ERROR LAST CHANCE!");
                System.out.println("please enter password");
                String answer3 = input.nextLine();
                if (answer3.equals("0000")){
            System.out.println("that is the right pasword");
            System.out.println("i like to run cc");
                }
                else{
                System.out.println("ERROR! BYE!!!");
                }
        }
    }
}
}