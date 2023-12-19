import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen
        // çizen program.

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int num = input.nextInt();

        for (int i = 1; i<=num ; i++) {

            for (int j = 1; j<=i-1; j++) {
                System.out.print(" ");
            }

            for (int k = num*2-(2*i-1); k>0; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
