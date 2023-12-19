import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Java döngüler ile fibonacci serisi bulan program.

        int count =1;
        int total;
        int firstNum = 0;
        int secondNum = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int num = input.nextInt();

        System.out.print(num + " elemanlı Fibonacci serisi: ");

        //0 sayısının yazımı:
        System.out.print(firstNum + " ");

        //while döngüsü ile sayıların yazdırımı:
        while (count<num) {
            System.out.print(secondNum + " ");
            total = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = total;
            count ++;

        }
    }
}
