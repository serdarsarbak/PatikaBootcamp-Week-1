import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Ondalık sayının girilmesi
        System.out.print("Lütfen ondalık bir sayı giriniz: ");
        double myDouble = input.nextDouble();
        int doubleInt = (int) myDouble; // double'ın integara dönüşümü explicit casting

        //Tam sayının girilmesi:
        System.out.print("Lütfen tam bir sayı giriniz: ");
        int myInt = input.nextInt();
        double intDouble = myInt; //integarın double'a dönüşümü otamatik implicit casting

        //Sonuçların yazıdırılması:

        System.out.println(myDouble + " ondalık sayısının tam sayı hali: " + doubleInt );
        System.out.println(myInt + " tam sayısının ondalık hali: " + intDouble);
    }
}
