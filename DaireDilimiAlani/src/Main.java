import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double r, a, pi=3.14, area, area2;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();

        System.out.print("Açıyı giriniz: ");
        a = input.nextDouble();

        area = (pi * (r*r) * a) /360;



        System.out.println("Daire diliminin alanı: " + area);

    }
}



