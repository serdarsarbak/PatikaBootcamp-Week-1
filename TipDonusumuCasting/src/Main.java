import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ondalık bir sayı giriniz: ");
        double myDouble = input.nextDouble();
        int doubleInt = (int) myDouble;

        System.out.print("Lütfen tam bir sayı giriniz: ");
        int myInt = input.nextInt();
        double intDouble = myInt;

        System.out.println(myDouble + " ondalık sayısının tam sayı hali: " + doubleInt );
        System.out.println(myInt + " tam sayısının ondalık hali: " + intDouble);
    }
}
