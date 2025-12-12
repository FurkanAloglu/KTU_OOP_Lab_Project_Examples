public class Kitap implements OduncAlinabilir, Yazdirilabilir,Etiketli{
    String ad;
    String yazar;
    boolean oduncte;
    String kime;

    public Kitap(String ad, String yazar) {
        this.ad = ad;
        this.yazar = yazar;
        this.oduncte = false;
        this.kime = null;
    }

    @Override
    public void oduncAl(String kime) {
        if (!oduncte) {
            oduncte = true;
            this.kime = kime;
            System.out.println(ad + " ödünç alındı: " + kime);
        } else {
            System.out.println(ad + " şu anda ödünçte: " + this.kime);
        }
    }

    @Override
    public void iadeEt(){
        if (oduncte) {
            oduncte = false;
            System.out.println(ad + " iade edildi.");
            this.kime = null;
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
        return "Kitap - Başlık: " + ad + ", Yazar: " + yazar + ", Durum: " + durum;
    }

    @Override
    public void yazdir(){
        System.out.println(bilgi());
    }

    @Override
    public String etiket(){
        return "Genel";
    }

}
