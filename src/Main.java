import java.net.StandardSocketOptions;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sec = new Scanner(System.in);
    static Random sayi = new Random();
    static int k_secim, b_secim;
    static int k_skor = 0, b_skor = 0;
    public static void main(String[] args) {

    oyun();

    }
    public static void oyun() {
        System.out.println("Bir seçim yapınız /n 1- Tas /n 2-Kagit /n 3-Makas");
        k_secim = sec.nextInt();
        b_secim = sayi.nextInt(3) + 1;

        switch (k_secim) {
            case 1: {
                System.out.println("Kullanicinin secimi tas");
                if (b_secim == 1) {
                    System.out.println("bilgisayarin secimi tas");
                    System.out.println("Skor berabere");
                    System.out.println("Kullanıcı skor = " + k_skor + " bilgisayar skor " + b_skor);
                } else if (b_secim == 2) {
                    System.out.println("bilgisayarin secimi kagit");
                    System.out.println("bilgisayar kazandi");
                    b_skor = b_skor + 1;
                    System.out.println("Kullanıcı skor = " + k_skor + " bilgisayar skor " + b_skor);
                } else if (b_secim == 3) {
                    System.out.println("Bilgisayarın secimi makas");
                    System.out.println("kullanici kazandi");
                    k_skor = k_skor + 1;
                    System.out.println("Kullanıcı skor = " + k_skor + " bilgisayar skor " + b_skor);
                }
                oyun();
                break;
            }
            case 2: {
                System.out.println("Kullanicinin secimi kagit");
                if (b_secim == 1) {
                    System.out.println("bilgisayarin secimi tas");
                    System.out.println("kullanici kazandi");
                    k_skor = k_skor + 1;
                    System.out.println("Kullanıcı skor = " + k_skor + " bilgisayar skor " + b_skor);
                } else if (b_secim == 2) {
                    System.out.println("bilgisayarin secimi kagit");
                    System.out.println("Skor berabere");
                    System.out.println("Kullanıcı skor = " + k_skor + " bilgisayar skor " + b_skor);

                } else if (b_secim == 3) {
                    System.out.println("Bilgisayarın secimi makas");
                    System.out.println("bilgisayar kazandi");
                    b_skor = b_skor + 1;
                    System.out.println("Kullanıcı skor = " + k_skor + " bilgisayar skor " + b_skor);
                }
oyun();
                break;
            }
            case 3: {
                System.out.println("Kullanicinin secimi makas");
                if (b_secim == 1) {
                    System.out.println("bilgisayarin secimi tas");
                    System.out.println("Bilgisayar kazandi");
                    b_skor = b_skor + 1;
                    System.out.println("Kullanıcı skor = " + k_skor + " bilgisayar skor " + b_skor);
                } else if (b_secim == 2) {
                    System.out.println("bilgisayarin secimi kagit");
                    System.out.println("Kullanici kazandi");
                    k_skor = k_skor + 1;
                    System.out.println("Kullanıcı skor = " + k_skor + " bilgisayar skor " + b_skor);

                } else if (b_secim == 3) {
                    System.out.println("Bilgisayarın secimi makas");
                    System.out.println("skor berabere");
                    System.out.println("Kullanıcı skor = " + k_skor + " bilgisayar skor " + b_skor);
                }
                oyun();
                break;
            }
            default:
                System.out.println("Hatali bir secim yaptiniz");
                oyun();
        }
    }
}