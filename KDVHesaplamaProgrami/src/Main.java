import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ürün değerini giriniz: ");
        double inp = input.nextDouble();

        double kdvPercent = inp>1000 ? 0.08 : 0.18;
        double kdvAmount = inp*kdvPercent;
        double totalPrice = inp + kdvAmount;

        System.out.println("Kdv'siz fiyat: " + inp);
        System.out.println("Kdv oranı: " + kdvPercent);
        System.out.println("Kdv tutarı: " + kdvAmount);
        System.out.println("Kdv'li fiyat: " + totalPrice);



    }
}
