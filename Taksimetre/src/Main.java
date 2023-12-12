import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, perKM=2.2, total, totalAdjusted;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz: ");
        km = input.nextDouble();

        total = km*perKM+ 10;

        totalAdjusted = total>20 ? total : 20;

        System.out.println("Taksimetre ücretiniz: " + totalAdjusted + " TL'dir.");


    }
}
