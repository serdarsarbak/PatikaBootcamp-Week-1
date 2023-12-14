import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // kullanıcıdan alınacak meyve kilolarına göre toplam maliyet hesaplanır.
        
        double armPrice=2.14, elmPrice=3.67, domatPrice= 1.11, muzPrice=0.95, patPrice=5;
        double arm, elm, domat, muz, pat, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut alındı? : ");
        arm = input.nextDouble();

        System.out.print("Kaç kilo elma alındı? : ");
        elm = input.nextDouble();

        System.out.print("Kaç kilo domates alındı? : ");
        domat = input.nextDouble();

        System.out.print("Kaç kilo muz alındı? : ");
        muz = input.nextDouble();

        System.out.print("Kaç kilo patlıcan alındı? : ");
        pat = input.nextDouble();

        total = (arm*armPrice)+(elm*elmPrice)+(domat*domatPrice)+(muz*muzPrice)+(pat*patPrice);

        System.out.println("Toplam tutar: " + total);

    }

}
