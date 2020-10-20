package app;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

 Scanner input = new Scanner(System.in);
 Random rnd = new Random();

        System.out.println("would you like to make a inside or outside bet");
            String answer1 = input.nextLine();

             if (answer1.equals("inside")){
                 System.out.println("what number would you like to bet on");
                 int answer2 = input.nextInt();
                 int n2 = rnd.nextInt(37);
                 System.out.println("genrated number is " + n2);

                 if(n2 == answer2){
                     System.out.println("your right!");
                 }
                 else{
                     // red and blackroll
                 }

             }
        

        
            else{
        }


  }
}