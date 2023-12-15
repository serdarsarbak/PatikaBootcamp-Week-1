import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*Artık Yıl Nasıl Hesaplanır?
Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır
         */

        int year;
        boolean isLeapYear = false, isError=false;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");

        year = input.nextInt();

        if (year<0) {
            isError = true;
        }

        if (year % 4 ==0) {
            if (year % 100 ==0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (year<0) {
            System.out.println("Hatalı yıl girişi yapılmıştır.");
        } else {
            if (isLeapYear) {
                System.out.println(year + " bir artık yıldır!");
            } else {
                System.out.println(year + " bir artık yıl değildir!");
            }
        }
    }
}
