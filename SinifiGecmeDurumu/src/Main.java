import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

        //Geçme Notu : 55

        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

        //count değişkeni oluşturularak ortalama alınırken yalnızca kullanıcının 100 ve 100'den küçük veya 0 ve 0'dan
        // büyük değer girdiği dersler dikkate alınmıştır.

        int mat, fizik, turk, kim, muz;
        double average, count=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Lütfen fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Lütfen türkçe notunuzu giriniz: ");
        turk = input.nextInt();

        System.out.print("Lütfen kimya notunuzu giriniz: ");
        kim = input.nextInt();

        System.out.print("Lütfen müzik notunuzu giriniz: ");
        muz = input.nextInt();

        //notların kontrol edilmesi:
        if (mat>100 || mat <0) {
            mat = 0;
            System.out.println("Matematik notunuzun girişi 0'dan küçük veya 100'den büyük olduğu için ortalamaya katılmamıştır.");
        } else {
            count++;
        }

        if (fizik>100 || fizik <0) {
            fizik = 0;
            System.out.println("Fizik notunuzun girişi 0'dan küçük veya 100'den büyük olduğu için ortalamaya katılmamıştır.");
        } else {
            count++;

        }
        if (turk>100 || turk <0) {
            turk = 0;
            System.out.println("Türkçe notunuzun girişi 0'dan küçük veya 100'den büyük olduğu için ortalamaya katılmamıştır.");
        } else {
            count++;
        }

        if (kim>100 || kim <0) {
            kim = 0;
            System.out.println("Kimya notunuzun girişi 0'dan küçük veya 100'den büyük olduğu için ortalamaya katılmamıştır.");
        } else {
            count++;
        }

        if (muz>100 || muz <0) {
            muz = 0;
            System.out.println("Müzik notunuzun girişi 0'dan küçük veya 100'den büyük olduğu için ortalamaya katılmamıştır.");
        } else {
            count++;
        }

        //ortalamanın bunulması
        average = (mat+fizik+turk+kim+muz) / count;

        //sonucun yazdırılması
        if (average<55) {
            System.out.println("Sınıfta kaldınız :(");
        } else {
            System.out.println("Sınıfı geçtiniz");
        }

        System.out.println("Ortalama notunuz: " + average);
    }
}
