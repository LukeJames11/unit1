package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("what is 10/2");
        String answer1 = input.nextLine();
        if (answer1.equals("5")){
            System.out.println("you have the right answer");
        }
        else{
        System.out.println("you have the wrong answer");
        }

         System.out.println("what is 5 * 5");
        String answer2 = input.nextLine();
        if (answer2.equals("25")){
            System.out.println("you have the right answer");
        }
        else{
        System.out.println("you have the wrong answer");
        }

        System.out.println("what is 100/5");
        String answer3 = input.nextLine();
        if (answer3.equals("20")){
            System.out.println("you have the right answer");
        }
        else{
        System.out.println("you have the wrong answer");
        }

                 System.out.println("what is 6 * 7");
        String answer4 = input.nextLine();
        if (answer4.equals("42")){
            System.out.println("you have the right answer");
        }
        else{
        System.out.println("you have the wrong answer");
        }

                 System.out.println("what is 400 + 267000");
        String answer5 = input.nextLine();
        if (answer5.equals("267400")){
            System.out.println("you have the right answer");
        }
        else{
        System.out.println("you have the wrong answer");
        }




        System.out.println("all finished");
    }
}