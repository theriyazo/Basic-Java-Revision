import java.util.Scanner;

public class stringArray {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter How many subjects you have");
        int n = in.nextInt();
//        after using nextInt() the
        in.nextLine();

        String sub[] = new String[n];
        System.out.println("Enter your subjects names");
        for (int i=0; i<sub.length; i++){
            sub[i] = in.nextLine();
        }
        for (int j=0; j<sub.length; j++){
            System.out.println("Your "+(j)+" is :"+sub[j]);
        }
    }
}
