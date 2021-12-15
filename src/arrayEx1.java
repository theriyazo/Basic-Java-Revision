import java.util.Scanner;

public class arrayEx1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("enter how many subjects you have");
        n = in.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter "+n+" subject marks");
//        System.out.println(marks.length);

        for (int i=0; i<marks.length; i++){
            marks[i] = in.nextInt();
        }
        System.out.println("Your entered numbers are :");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
