import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Java ile girilen sayıya kadar olan asal sayıları ekrana yazdıran programı yazınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();

        if (num<1) {
            System.out.println("Birden büyük bir sayı girilmeli.");
            System. exit(0);
        }

        System.out.print(num + " sayısına kadar olan asal sayılar: ");

        for (int i = 2; i<num; i++) {
            boolean primeNumber = true;

            for (int k = 2; k<i; k++) {
                if (i % k == 0) {
                    primeNumber = false;
                }
            }

            if (primeNumber) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
