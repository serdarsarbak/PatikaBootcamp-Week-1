import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
        // değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
        //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

        boolean isCorrect = false;
        Scanner input = new Scanner(System.in);

        // mükemmel sayı girilene kadar sayı sormaya devam etmek için while döngüsüne alınmıştır.
        while (isCorrect == false) {

            System.out.print("Bir sayı giriniz: ");
            int num = input.nextInt();
            int tempNum=0;

            for (int i = 1; i<num-1; i++) {
                if (num % i ==0) {
                    tempNum += i;
                }
            }

            if (tempNum == num ) {
                System.out.println(num + " bir mükemmel sayıdır.");
                isCorrect = true;

            } else {
                System.out.println(num + " mükemmel bir sayı değildir.");
            }

        }
    }
}
