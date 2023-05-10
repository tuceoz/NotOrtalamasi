import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // değişkenleri oluştur

        int mat, fizik, kimya, turkce, muzik, tarih;


        testing


        // scanner sınıfımızı tanımladık
        Scanner input = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("turkce notunuz: ");
        turkce = input.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();

        System.out.print("tarih notunuz: ");
        tarih = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + muzik + tarih);
        double sonuc = (toplam / 6.0);
        System.out.println("Ortalamanız: " + sonuc);

        boolean kosul = sonuc >= 60;


        String sonucCiktisi = (kosul) ? "Sınıfı geçti" : "Sınıfta Kaldı";

        System.out.println(sonucCiktisi);

    }
}