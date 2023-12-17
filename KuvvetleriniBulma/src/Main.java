import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program.

        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz: ");

        n = input.nextInt();

        System.out.println("4'ün kuvvetleri: ");
        for (int i=1; i<=n; i=i*4) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("5'ün kuvvetleri: ");
        for (int i=1; i<=n; i=i*5) {
            System.out.print(i + ", ");
        }
    }
}
