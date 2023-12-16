import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
        // sayıların ortalamasını hesaplayan programı yazınız.

        int num, total=0, count=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        num=input.nextInt();

        if (num<1) {
            System.out.println("Lütfen 0'dan büyük bir sayı giriniz.");
        } else {
            for (int i=1; i<=num; i++) {
                if (i%12==0) {
                    System.out.print(i + ", ");
                    total += i;
                    count ++;
                }
            }

            if (count==0) {
                System.out.println("12'ye bölünebilen sayı bulunmamaktadır.");
            } else {
                System.out.println();
                System.out.println("12'ye bölünebilen sayıların toplamı: " + total);
                System.out.println("Toplanan sayıların ortalaması: " + (total/count));
            }
        }



    }
}
