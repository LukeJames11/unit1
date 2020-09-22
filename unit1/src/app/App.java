package app;

public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String  color = "green";

        while(count < 100000) {
            System.out.println("the count is" + count);
            count = count + 1;
        }
        while (color == "green"){
            System.out.println("the color is " + color);
            color = "green";
        }

        System.out.println("color finished");
    
    }
}