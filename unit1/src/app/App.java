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
                     System.out.println("if you want to bet again say bet if you would like to withdraw say withdraw");
                     String answer3 = input.nextLine();
                     if(answer3.equals("bet")){
                         System.out.println("here we go"); 
                     }
                     else{
                         System.out.println("goobye");
                     }
                    }
                 else{
                     System.out.println("your wrong");
                      System.out.println("if you want to bet again say bet if you would like to withdraw say withdraw");
                     String answer4 = input.nextLine();
                     if(answer4.equals("bet")){
                         System.out.println("here we go");
                         }

                         }
                         
                     }
                     
           
                else{
                System.out.println("black or red?");
                 String answer5 = input.nextLine();

             int Black[]={2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
                }
        }
    }
