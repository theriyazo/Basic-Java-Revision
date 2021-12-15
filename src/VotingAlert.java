import java.util.Scanner;

public class VotingAlert {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int yourAge = in.nextInt();

        if (yourAge>=18){
            System.out.println("Congratulations! your Eligible to vote");
        }
        else if (yourAge<18){
            int waitFor;
            waitFor = 18 - yourAge;
            System.out.println("Sorry! Your not eligible to vote this year");
            System.out.println("You'll be eligible after: "+(waitFor+2021));
        }
    }
}
