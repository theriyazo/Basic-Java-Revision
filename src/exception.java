import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("How many subjects you have");
        n = in.nextInt();

        String[] sub = new String[n];
        in.nextLine();
        System.out.println("Enter your"+n+"subjects name");
        for(int i=0; i<sub.length; i++){
            sub[i]=in.nextLine();
        }
        System.out.println("Data Entry successful!");

        System.out.println("Choose what you want to do with your data");
        System.out.println("p : print all the data | o : output particular subject name");
        char choice = in.next().charAt(0);

        switch (choice){
            case 'p' : for(int i=0; i<sub.length; i++){
                System.out.println( sub[i]);
            } break;
            case 'o' : System.out.println("Enter subject number");
                int num = in.nextInt();
                try {
                    System.out.println(sub[num]);

                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry that number subject does not exist!");
                }
                break;
        }





    }
}
