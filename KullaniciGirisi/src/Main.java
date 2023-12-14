import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // kullanıcı adı ve şifrenin kontrol edilmesi.

        // doğru kullanıcı adının patika, şifrenin java olduğu varsayılmıştır.

        /*  Amaç; eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak
        isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
        ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
        */

        String password, userName, passRenew, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Lütfen şifrenizi giriniz: ");
        password=input.nextLine();

        if (userName.equals("patika")) {

            if (password.equals("java")) {
                System.out.println("Başarılı şekilde giriş yapıldı.");

            } else {
                System.out.println("Şifreniz yanlış girilmiştir.");
                System.out.println("Şifrenizi değiştirmek ister misiniz?");
                System.out.println(("E - Evet // H - Hayır"));
                passRenew = input.nextLine();

                if (passRenew.equals("E")) {
                    System.out.println("Yeni şifrenizi giriniz: ");
                    newPassword = input.nextLine();

                    if (newPassword.equals("java")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                    } else {
                        System.out.println("Şifreniz başarılı bir şekilde değiştirilmiştir.");
                        System.out.println("Yeni şifreniz " + newPassword);
                    }
                } else {
                    System.out.println("Lütfen tekrar deneyiniz.");
                }
            }
        } else {
            System.out.println("Kullanıcı adınız bulunamadı, lütfen tekrar deneyiniz.");
        }
    }
}
