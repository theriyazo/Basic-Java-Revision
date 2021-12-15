import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one character from 'Riyaz', we'll tell you remaining characters of it ");
        char yourChar = in.next().charAt(0);

        switch (yourChar){
            case 'r' : System.out.println("iyaz");
            break;
            case 'i' : System.out.println("yaz");
            break;
            case 'y' : System.out.println("az");
            break;
            case 'a' : System.out.println("z");
            break;
            case 'z' : System.out.println(" No characters remaining in your name");
            break;

            default:
                System.out.println("not a valid input");


        }
    }
}
