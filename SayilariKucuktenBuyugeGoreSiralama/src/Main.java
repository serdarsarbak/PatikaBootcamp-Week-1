import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Girilen 3 sayıyı "küçükten büyüğe" sıralayan program

        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayı olan a'yı giriniz: ");
        a = input.nextInt();

        System.out.print("İkinci sayı olan b'yi giriniz: ");
        b = input.nextInt();

        System.out.print("Üçüncü sayı olan c'yi giriniz: ");
        c = input.nextInt();

        System.out.println("Sayıların küçükten büyüğe göre sıralaması");

        if ((a==b) && (b==c)) {
            System.out.println("Üç sayı birbirine eşittir. a=b=c");
        } else if ((a==b) && (b>c)) {
            System.out.println("c<a=b");
        } else if ((a==b) && (b<c)) {
            System.out.println("a=b<c");
        } else if ((a==c) && (b<c)) {
            System.out.println("b<a=c");
        } else if ((a==c) && (b>c)) {
            System.out.println("a=c<b");
        } else if ((b==c) && (b>a)) {
            System.out.println("a<b==c");
        } else if ((b==c) && (b<a)) {
            System.out.println("b==c<a");
        } else if ((a>b) && (a>c)) {
            if (b>c) {
                System.out.println("c<b<a");
            } else {
                System.out.println("b<c<a");
            }

        } else if ((b>a) && (b>c)) {
            if (a>c) {
                System.out.println("c<a<b");
            } else {
                System.out.println("a<c<b");
            }
        } else {
            if (a>b) {
                System.out.println("b<a<c");
            } else {
                System.out.println("a<b<c");
            }

        }
    }
}
