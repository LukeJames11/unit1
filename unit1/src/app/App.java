package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

 Scanner input = new Scanner(System.in);

        System.out.println("please enter a number");

            int answer1 = input.nextInt();

              System.out.println("please enter a number");

            int answer2 = input.nextInt();
            
            for (int i = answer1; i < answer2; i += 2) {
        System.out.println(i);        
     }
  }
}