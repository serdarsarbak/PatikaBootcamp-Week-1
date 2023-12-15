import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun
         */

        int birthYear, remainder;
        String zodyak = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        birthYear = input.nextInt();
        remainder = birthYear % 12;

        if (birthYear>2023 || birthYear<1900) {
            isError = true;
        }

        switch (remainder) {
            case 0:
                zodyak = "Maymun";
            case 1:
                zodyak = "Horoz";
            case 2:
                zodyak = "Köpek";
            case 3:
                zodyak = "Domuz";
            case 4:
                zodyak = "Fare";
            case 5:
                zodyak = "Öküz";
            case 6:
                zodyak = "Kaplan";
            case 7:
                zodyak = "Tavşan";
            case 8:
                zodyak = "Ejderha";
            case 9:
                zodyak = "Yılan";
            case 10:
                zodyak = "At";
            case 11:
                zodyak = "Koyun";
        }

        if (isError) {
            System.out.println("Hatalı doğum yılı girdiniz, lütfen tekrar deneyiniz.");
        } else {
            System.out.println("Çin zodyağı burcunuz: " + zodyak);
        }

    }
}
