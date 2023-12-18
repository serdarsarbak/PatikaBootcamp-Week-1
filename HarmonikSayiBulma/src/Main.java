import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double result =0;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int num = input.nextInt();

        for (int i=1; i<=num; i++) {
            result += 1.0/i;
        }

        System.out.println(num + "sayısının harmonik ortalaması: " + result);
    }
}
