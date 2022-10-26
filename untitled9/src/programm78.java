import java.util.Scanner;
public class programm78 {
    public static void main(String[] args) {
        int n;
        System.out.print("Write n more then 3 ");
        Scanner sc = new Scanner(System.in);

        if ( sc.hasNextInt() ) {
            do {
                n = sc.nextInt ();
                if (n <= 3)
                {System.out.println("Try again!");}
            }
            while (n <= 3);

            int[] ar1 = new int[n];
            for(int i = 0; i < n; i++)
            {ar1[i] = (int)(Math.round(Math.random() * n));
                System.out.print(ar1[i] + " ");}

            System.out.println(" ");

            for(int j = 0; j < n; j++)
            {if (ar1[j]%2<1)
            {System.out.print(ar1[j] + " ");}}

        }}}
