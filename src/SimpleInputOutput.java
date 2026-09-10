import java.util.Scanner;
public class SimpleInputOutput {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("My name is Ayo Odusanya.");
        System.out.println("I am a Computer Science major at Bowie State University.");
        System.out.println("My favorite movie is between \"Inglorious Bast*rds\" and \"Mudbound\".");
        System.out.println("The quote of the day is from St. Thomas Aquinas: \"There is nothing on this earth more to be prized than true friendship.\"");
        
        Scanner input_listener = new Scanner(System.in);
        System.out.println("What is your name?");

        String user_name = input_listener.nextLine();
        System.out.println("Hello, " + user_name + "! Nice to meet you.");
        
        double numA, numB, numC, sum;
        System.out.println("Enter first number:");

        numA = input_listener.nextDouble();
        System.out.println("Enter second number:");

        numB = input_listener.nextDouble();
        System.out.println("Enter third number:"); 

        numC = input_listener.nextDouble(); 
        sum = numA + numB + numC;
        
        System.out.println(numA + " + " + numB + " + " + numC + " = " + (int)sum);
        input_listener.close();
    }
}
