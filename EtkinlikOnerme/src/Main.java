import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Koşullar :
        //Sıcaklık 5'ten küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        int degree;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        degree = input.nextInt();

        if (degree<-5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (degree < 10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (degree <15) {
            System.out.println("Sinemaya veya pikniğe gidebilirsiniz");
        } else if (degree < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
