import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        int distance, age, condition;
        double totalCost, costPerKm=0.1;
        boolean isError=false;

        Scanner input = new Scanner (System.in);

        System.out.print("Lütfen mesafeyi KM cinsinde giriniz: ");
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        condition = input.nextInt();

        if (distance<0 || age<0 || condition>2 || condition<1) {
            isError=true;
        }

        if (isError) {
            System.out.println("Hatalı veri girişi yapıldı!");
        } else {
            if (condition == 1) {
                if (age<12) {
                    totalCost = (distance*costPerKm)*0.5;
                } else if (age <= 25) {
                    totalCost = (distance*costPerKm)*0.9;
                } else if (age > 65) {
                    totalCost = (distance*costPerKm)*0.7;
                } else {
                    totalCost = (distance*costPerKm);
                }
            } else {
                //condition 2 indirimi yapılır:
                if (age<12) {
                    totalCost = (((distance*costPerKm)*0.5)*0.8)*2;
                } else if (age <= 25) {
                    totalCost = (((distance*costPerKm)*0.9)*0.8)*2;
                } else if (age > 65) {
                    totalCost = (((distance*costPerKm)*0.7)*0.8)*2;
                } else {
                    totalCost = ((distance*costPerKm)*0.8)*2;
                }
            }

            System.out.println("Toplam Tutar: " + totalCost);
        }
    }
}
