import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Burç bulma:

        //Koç Burcu : 21 Mart - 20 Nisan
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //Yay Burcu : 22 Kasım - 21 Aralık
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //Kova Burcu : 22 Ocak - 19 Şubat
        //Balık Burcu : 20 Şubat - 20 Mart

        int month, day;
        boolean isError=false;
        String sign="";

        Scanner input = new Scanner (System.in);

        System.out.print("Doğduğunuz ay (rakam olarak): ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();
        if (month>12 || month<1) {
            isError=true;
        }

        if (month==1) {
            if (day>=1 && day<=31) {
                if (day<22) {
                    sign = "Oğlak";
                } else {
                    sign = "Kova";
                }
            } else {
                isError=true;
            }

        } else if (month==2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    sign = "Kova";
                } else {
                    sign = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (month==3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    sign = "Balık";
                } else {
                    sign = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (month==4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    sign = "Koç";
                } else {
                    sign = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (month==5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    sign = "Boğa";
                } else {
                    sign = "İkizler";
                }
            } else {
                isError = true;
            }
        } else if (month==6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    sign = "İkizler";
                } else {
                    sign = "Yengeç";
                }
            } else {
                isError = true;
            }
        }else if (month==7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    sign = "Yengeç";
                } else {
                    sign = "Aslan";
                }
            } else {
                isError = true;
            }
        }else if (month==8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    sign = "Aslan";
                } else {
                    sign = "Başak";
                }
            } else {
                isError = true;
            }
        }else if (month==9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    sign = "Başak";
                } else {
                    sign = "Terazi";
                }
            } else {
                isError = true;
            }
        }else if (month==10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    sign = "Terazi";
                } else {
                    sign = "Akrep";
                }
            } else {
                isError = true;
            }
        }else if (month==11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    sign = "Akrep";
                } else {
                    sign = "Yay";
                }
            } else {
                isError = true;
            }
        }else if (month==12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    sign = "Yay";
                } else {
                    sign = "Oğlak";
                }
            } else {
                isError = true;
            }
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız, lütfen tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz: " + sign);
        }

    }
}
