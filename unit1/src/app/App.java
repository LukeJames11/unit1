package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       Scanner input = new Scanner(System.in);

        System.out.println("welcome to luke facts pick a number  1-5");

        String answer1 = input.nextLine();

        if (answer1.equals("1")){
            System.out.println("lukes fav color is green");
        }
        if (answer1.equals("2")){
            System.out.println("luke has 1  dog its a red lab");
        }
        if (answer1.equals("3")){
            System.out.println("luke is 16 years old");
        }
        if (answer1.equals("4")){
            System.out.println("luke has 1 older sister and one younger sister");
        }
        if (answer1.equals("5")){
            System.out.println("luke is in grade 10 proggraming class");
        }
        
        else{
        System.out.println("ERROR!!!!!!!!!!!!!!!! dont you ever click this number");
        }

        }
    }