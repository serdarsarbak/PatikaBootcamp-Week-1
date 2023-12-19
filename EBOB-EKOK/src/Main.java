import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazma

        int EBOB = 1, EKOK=1;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();

        //n1 sayısını en küçük olarak belirleme.
        if (n1>n2) {
            int tempN1=n1;
            n1=n2;
            n2=tempN1;
        }
        //EBOB'un bulunması:
        int a = n1;
        while (a >= 1) {
            if (n1 % a == 0 && n2 % a == 0) {
                EBOB = a;
                break;
            }
            a--;
        }

        //EKOK'un bulunması:
        int b = n1;
        while (b < (n1*n2)) {
            if (b % n1 == 0 && b % n2 == 0) {
                EKOK = b;
                break;
            }
            b++;
        }
        System.out.println("İki sayının EBOB'u: " + EBOB);
        System.out.println("İki sayının EKOK'u: " + EKOK);
    }
}
