import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        int count = 0, result=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayılarının toplamı bulunacak sayıyı giriniz: ");

        int num = input.nextInt();

        int tempNum = num;


        //basamak sayısının hesaplanması

        while (tempNum!=0) {
            tempNum /= 10;
            count++;
    }
        tempNum = num;

        while (tempNum!=0) {
            result += tempNum % 10;
            tempNum /= 10;

        }

        System.out.println(num + "sayısının basamak sayılarının toplamı: " + result);

    }

}
