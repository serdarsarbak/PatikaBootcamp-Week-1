import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height, weight, vki;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        height = input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        weight = input.nextDouble();

        vki = (weight / (height * height));

        System.out.print("Vücut Kütle İndeksiniz: " + vki);


    }
}

