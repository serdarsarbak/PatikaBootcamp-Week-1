import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //kullanıcıdan alınacak üç sayı ile işlem önceliğine göre toplam hesaplama

        double a, b, c, total;

        Scanner input = new Scanner(System.in);

        System.out.print("a sayısını giriniz: ");
        a = input.nextDouble();

        System.out.print("b sayısını giriniz: ");
        b = input.nextDouble();

        System.out.print("c sayısını giriniz: ");
        c = input.nextDouble();

        System.out.println("Yapılacak işlem: a+b*c-b ");

        total = a+b*c-b;

        System.out.println("Sonuç: " + total);




    }
}
