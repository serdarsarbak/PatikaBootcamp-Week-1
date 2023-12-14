import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //basit hesap makinesi
        //kullanıcıdan alınan iki sayı ve işleme göre sonuç bulunur.


        int number1, number2, operator;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        number1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        number2 = input.nextInt();

        System.out.print("Toplama işlemi için 1'i; \nÇıkarma işlemi için 2'yi;\nÇarpma işlemi için 3'ü;\nBölme işlemi için 4'ü seçiniz. ");
        System.out.print("\nSeçiminiz: ");
        operator = input.nextInt();

        switch (operator) {

            case 1:
                System.out.println("Toplam işlemi: " + (number1+number2));
                break;

            case 2:
                System.out.println("Çıkarma işlemi: " + (number1-number2));
                break;

            case 3:
                System.out.println("Çarpma işlemi: " + (number1*number2));
                break;

            case 4:
                switch (number2) {
                    case 0:
                        System.out.println("0 ile bölme yapılamaz, tekrar deneyiniz.");
                        break;

                    default:
                        System.out.println("Bölme işlemi: " + (number1/number2));
                }
                break;

            default:
                System.out.println("Yanlış seçim yaptınız, lütfen tekrar deneyiniz.");
        }


    }
}
