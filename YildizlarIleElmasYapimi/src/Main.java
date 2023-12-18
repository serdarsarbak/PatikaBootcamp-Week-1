import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Java'da döngüler kullanarak yıldızlar ile elmas yapma.

        Scanner input = new Scanner(System.in);

        System.out.print("Elmas oluşumu için satır sayısı giriniz: ");

        //girilen satır sayısı en fazla yıldızın olduğu satır sayısı olur.
        int num = input.nextInt();

        while (num<0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
            System.out.print("Elmas oluşumu için satır sayısı giriniz: ");
            num = input.nextInt();
        }

        //first half of the diamond shape


        for (int i = 1; i<=num; i++) {

            for (int j =1; j <= (num-i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i -1); k++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

        //second half of the diamond shape

        for (int m = num - 1; m > 0; m--) {

            for (int n = 1; n <= num - m; n++) {
                System.out.print(" ");
            }

            for (int n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

    }
}
