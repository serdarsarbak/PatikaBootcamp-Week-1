import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen
        // değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program.

        Scanner input = new Scanner(System.in);

        int total=0, num;

        do {
            System.out.print("Sayı giriniz: ");
            num = input.nextInt();
            if (num%4==0) {
                total += num;
            }

        } while (num%2==0);

        System.out.println("Toplam: " + total);
    }
}
