/*
 * Ad Soyad: Fırat SEÇKİN
 * Ogrenci No: 250541042
 * Tarih: 13.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometrikAlanHesaplayıcıMethod{
    
    public static double KareAlanHesapla(double kenar)//Kare Alan Hesaplayıcı Method
    {
        return kenar*kenar;
    }

    public  static double KareÇevreHesapla(double kenar)//Kare Çevre Hesaplayıcı Method
    {
        return kenar*4;
    }

    public static double DikdörtgenAlanHesapla(double KisaKenar,double UzunKenar)//Dikdörtgen Alan Hesaplayıcı Method
    {
        return KisaKenar*UzunKenar;
    }

    public static double DikdörtgenÇevreHesapla(double UzunKenar,double KisaKenar)//Dikdörtgen Çevre Hesaplayıcı Method
    {
        return (KisaKenar+UzunKenar)*2;
    }
    
    public static double DaireAlanHesapla(double YariÇap)//Daire Alan Hesaplayıcı Method
    {
        float PI=3.14159f;
        return PI*YariÇap*YariÇap;
    }

    public static double DaireÇevreHesapla(double YariÇap)//Daire Çevre Hesaplayıcı Method
    {
        float PI=3.14159f;
        return 2*PI*YariÇap; 
    }

    public static double ÜçgenAlanHesapla(double Taban,double Yükseklik)//Üçgen Alan Hesaplayıcı Method
    {
        return (Taban*Yükseklik)/2;
    }

    public static double ÜçgenÇevreHesapla(double kenar1,double kenar2,double kenar3)//Üçgen Çevre Hesaplayıcı Method
    {
        return kenar1+kenar2+kenar3;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double KareKenar,DikdörtgenKisaKenar,DikdörtgenUzunKenar,DaireYariÇap,ÜçgenTaban,ÜçgenYükseklik,ÜçgenKenar1,ÜçgenKenar2,ÜçgenKenar3;
        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");

        System.out.println("\nKARE:");
        System.out.print("Kenar Uzunluğu (cm): ");
        KareKenar = input.nextInt();

        System.out.println("\nDIKDORTGEN:");
        System.out.print("Kisa Kenar (cm): ");
        DikdörtgenKisaKenar=input.nextInt();
        System.out.print("Uzun Kenar (cm): ");
        DikdörtgenUzunKenar=input.nextInt();

        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm): ");
        DaireYariÇap=input.nextInt();

        System.out.println("\nUCGEN:");
        System.out.print("Taban (cm): ");
        ÜçgenTaban=input.nextInt();
        System.out.print("Yükseklik (cm): ");
        ÜçgenYükseklik=input.nextInt();
        System.out.print("1. Kenar (cm): ");
        ÜçgenKenar1=input.nextInt();
        System.out.print("2. Kenar (cm): ");
        ÜçgenKenar2=input.nextInt();
        System.out.print("3. Kenar (cm): ");
        ÜçgenKenar3=input.nextInt();

        System.out.println("\n========================================");
        System.out.println("          HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.printf("\nKARE (kenar: %.1f cm):", KareKenar);
        System.out.printf("\n  Alan      : %.2f cm²",KareAlanHesapla(KareKenar));
        System.out.printf("\n  Çevre     : %.2f cm", KareÇevreHesapla(KareKenar));

        System.out.printf("\n\nDIKDORTGEN (%.1f x %.1f cm):", DikdörtgenKisaKenar,DikdörtgenUzunKenar);
        System.out.printf("\n  Alan      : %.2f cm²", DikdörtgenAlanHesapla(DikdörtgenKisaKenar, DikdörtgenUzunKenar));
        System.out.printf("\n  Çevre     : %.2f cm", DikdörtgenÇevreHesapla(DikdörtgenUzunKenar, DikdörtgenKisaKenar));

        System.out.printf("\n\nDAIRE (Yaricap: %.1f cm):", DaireYariÇap);
        System.out.printf("\n  Alan      : %.2f cm²", DaireAlanHesapla(DaireYariÇap));
        System.out.printf("\n  Çevre     : %.2f cm", DaireÇevreHesapla(DaireYariÇap));

        System.out.printf("\n\nUÇGEN (Taban: %.1f , yukseklik: %.1f):", ÜçgenTaban,ÜçgenYükseklik);
        System.out.printf("\n  Alan      : %.2f cm²", ÜçgenAlanHesapla(ÜçgenTaban, ÜçgenYükseklik));
        System.out.printf("\n  Çevre     : %.2f cm", ÜçgenÇevreHesapla(ÜçgenKenar1, ÜçgenKenar2, ÜçgenKenar3));
        System.out.print("\n\n========================================");

        input.close();
    }
    
}
