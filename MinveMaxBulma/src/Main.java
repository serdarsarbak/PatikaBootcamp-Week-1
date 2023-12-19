import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve
        // bu sayıları ekrana yazan program.


        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int num = input.nextInt();

        // girilen ilk sayının hem en büyük hem de en küçük sayı olarak atanması:
        System.out.print("1. sayıyı giriniz: ");
        int lowestNum = input.nextInt();
        int biggestNum = lowestNum;

        //diğer girilen sayıların en küçük ve en büyük sayı ile karşılaştırılması:
        for (int i=2; i<=num; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int a = input.nextInt();
            if (a>biggestNum) {
                biggestNum = a;
            }
            if (a<lowestNum) {
                lowestNum = a;
            }
        }

        // sonucun yazdırılması:
        System.out.println("En küçük sayı: " + lowestNum);
        System.out.println("En büyük sayı: " + biggestNum);



    }
}
