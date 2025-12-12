
public class Main{
    public static void main(String[] args){
        System.out.println("=== Kütüphane Demo Başlatılıyor ===");

        Kitap k1 = new Kitap("Devlet","Platon",2);
        Kitap k2 = new Kitap("Sefiller","Victor Hugo",1);

        Dergi d1 = new Dergi("Bilim ve Teknik","TUBITAK",3);

        System.out.println("-- Başlangıç Durumu --");
        k1.yazdir();
        k2.yazdir();
        d1.yazdir();

        System.out.println("\n-- Kitap ödünç alma testi --");
        System.out.println("k1 musaitMi: " + k1.musaitMi());
        k1.oduncAl("Ahmet");
        System.out.println("k1 ödünç alındı (Ahmet). Son durum:");
        k1.yazdir();

        System.out.println("\n-- iade testi --");
        k1.iadeEt();
        System.out.println("k1 iade edildi. Son durum:");
        k1.yazdir();

        System.out.println("\n-- Eşitlik ve hashCode testi --");
        Kitap k1kopya = new Kitap("Devlet","Platon",1);
        System.out.println("k1.equals(k1kopya): " + k1.equals(k1kopya));
        System.out.println("k1.hashCode(): " + k1.hashCode());
        System.out.println("k1kopya.hashCode(): " + k1kopya.hashCode());

        System.out.println("\n-- Gecikme ücreti örneği --");
        double ucret = OduncAlinabilir.gecikmeUcreti(3, 2.5);
        System.out.println("3 gün gecikme, günlük 2.5 TL => " + ucret + " TL");

        System.out.println("=== Demo Sonu ===");
    }
}