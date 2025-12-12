public class Main{
    public static void main(String[] args){

        Kitap k1 = new Kitap("Sefiller", "Victor Hugo");
        Dergi d1 = new Dergi("Bilim ve Teknik", "Tubitak", 42);

        k1.yazdir();
        d1.yazdir();

        k1.oduncAl("Ali");
        System.out.println("k1 müsait mi? " + k1.musaitMi());
        k1.oduncAl("Veli");

        k1.iadeEt();
        k1.oduncAl("Veli");

        d1.oduncAl("Ayse");
        d1.oduncAl("Mehmet");
        d1.iadeEt();
        d1.oduncAl("Mehmet");

        k1.yazdir();
        d1.yazdir();

    }
}