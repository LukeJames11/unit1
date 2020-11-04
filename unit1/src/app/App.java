package app;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

 Scanner input = new Scanner(System.in);
 Random rnd = new Random();
 var bank = 100;
 
 while(bank > 0){

        System.out.println("would you like to make a inside or outside bet");
            String answer1 = input.nextLine();

             if (answer1.equals("inside")){
                 System.out.println("what number would you like to bet on");
                 int answer2 = input.nextInt();
                 int n1 = rnd.nextInt(37);
                 System.out.println("genrated number is " + n1);

                 if(n1 == answer2){
                     System.out.println("your right!");
                     System.out.println("if you want to bet again say bet if you would like to withdraw say withdraw");
                     String answer3 = input.nextLine();
                     if(answer3.equals("bet")){
                         System.out.println("here we go"); 
                     }
                     else{
                         System.out.println("goobye");
                         break;
                     }
                    }
                 else{
                     System.out.println("your wrong");
                      System.out.println("if you want to bet again say bet if you would like to withdraw say withdraw");
                     String answer4 = input.nextLine();
                     if(answer4.equals("bet")){
                         System.out.println("here we go");
                         }
                         if(answer4.equals("withdraw")){
                             System.out.println("goodbye");
                             break;
                         }

                         }
                         
                     }
                     
           
                else{
                System.out.println("if you want to bet on black pick 0 and if you want to bet on red pick 1");
                 int answer5 = input.nextInt();
                 System.out.println("how much would you like to bet?");
                 int answer6 = input.nextInt();
                 int n2 = rnd.nextInt(2);
                 System.out.println("genrated number is " + n2);

                 if(n2 == answer5){
                     System.out.println("correct!");
                 }
                 else{
                     System.out.println("wrong");
                     System.out.println("if you want to bet again say bet if you would like to withdraw say withdraw");
                     String answer7 = input.nextLine();
                     if(answer7.equals("bet")){
                     }
                     else{
                         System.out.println("goobye");
                         break;
                     }
                 }
                }
        }
    }
}
