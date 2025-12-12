public interface OduncAlinabilir {
    void oduncAl(String kime);
    void iadeEt();
    boolean musaitMi();

    static double gecikmeUcreti(int gecikenGun, double gunlukUcret) {
        gunlukUcret = 0;
        double toplam = gecikenGun * (gunlukUcret + 10);
        return toplam;
    }
}
