import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ATM projesi, switch case ile yapımı
        // Doğru kullanıcı adı:patika, şifre: 123
        String userName, password;
        Scanner input = new Scanner(System.in);
        int remainder = 3;
        int balance = 1000;
        int choice, price;
        while (remainder > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("123")) {
                System.out.println("Merhaba, Dünya Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para çekme\n" +
                            "3-Bakiye sorgula\n" +
                            "4-Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Hesabınıza yatırmak istediğiniz para miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println(price + " TL hesabınıza yatırılmıştır. \nYeni bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Hesabınızdan çekmek istediğiniz para miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println(price + " TL hesabınızdan çekilmişti. \nYeni bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                        System.out.println("Bakiyeniz : " + balance + " TL");
                        break;
                    }

                } while (choice != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                remainder--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (remainder == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan Hakkınız : " + remainder);
                }
            }
        }
    }
}