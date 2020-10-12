package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

 Scanner input = new Scanner(System.in);

 while (true){

        System.out.println("please enter a number");

            String answer1 = input.nextLine();

            if (answer1.equals("38")){
            System.out.println("correct!");
            break;
        }

        else{
            System.out.println("wrong answer try again");
        }
        }

        }
}
  