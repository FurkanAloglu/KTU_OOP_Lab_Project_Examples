public class Dergi implements OduncAlinabilir,Yazdirilabilir{
    String ad,yazar,kime;
    boolean oduncte;
    int sayi;

    public Dergi(String ad, String yazar, int sayi) {
        this.ad = ad;
        this.yazar = yazar;
        this.sayi = sayi;
        this.kime = null;
        this.oduncte = false;

    }
    @Override
    public void oduncAl(String kime) {
        if (!oduncte) {
            oduncte = true;
            this.kime = kime;
            System.out.println(ad + " (Sayı: " + sayi + ") ödünç alındı: " + kime);
        } else {
            System.out.println(ad + " şu anda ödünçte: " + this.kime);
        }
    }

    @Override
    public void iadeEt(){
        if (oduncte) {
            oduncte = false;
            this.kime = null;
            System.out.println(ad + " iade edildi.");
        } else {
            System.out.println(ad + " zaten müsait.");
        }

    }

    @Override
    public boolean musaitMi(){
        return !oduncte;
    }

    @Override
    public String bilgi(){
        String durum = musaitMi() ? "Müsait" : "Ödünçte: " + kime;
        String dergiBilgi = "Dergi - Başlık: " + ad + ", Yazar: " + yazar + ", Sayı: " + sayi + ", Durum: " + durum;
        return dergiBilgi;
    }

    @Override
    public void yazdir(){
        System.out.println(bilgi());
    }
}
