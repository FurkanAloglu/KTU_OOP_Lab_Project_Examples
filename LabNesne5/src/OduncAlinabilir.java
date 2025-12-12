public interface OduncAlinabilir {

    void oduncAl(String kime);
    void iadeEt();
    boolean musaitMi();

    // Hesaplama parametreleri kullanılarak gecikme ucreti hesaplanır
    public static double gecikmeUcreti(int gecikenGun, double gunlukUcret){
        if(gecikenGun <= 0) return 0.0;
        if(gunlukUcret < 0) throw new IllegalArgumentException("Günlük ücret negatif olamaz");
        return gecikenGun * gunlukUcret;
    }
}
