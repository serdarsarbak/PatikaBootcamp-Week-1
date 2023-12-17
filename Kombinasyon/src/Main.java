import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların
        // sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r)
        // şeklinde gösterilir.
        //Java ile kombinasyon hesaplayan program yazınız.
        // Kombinasyon formülü : C(n,r) = n! / (r! * (n-r)!)

        int n, r;
        int totalN=1, totalR=1, totalNR=1;


        Scanner input  = new Scanner(System.in);

        System.out.println("Kombinasyon hesabı için n ve r değerlerini giriniz C(n,r)");
        System.out.print("n değeri: ");

        n = input.nextInt();

        System.out.print("r değeri: ");

        r = input.nextInt();

        // n faktöriyel hesaplama:
        for (int i = 1; i<=n; i++) {
            totalN *= i;
        }

        // r faktöriyel hesaplama:
        for (int i = 1; i<=r; i++) {
            totalR *= i;
        }

        // n-r faktöriyel hesaplama:

        for (int i = 1; i<=(n-r); i++) {
            totalNR *= i;
        }


        int total = totalN / (totalR * totalNR);

        System.out.println("C("+n+","+r+") = " +total);
    }
}
