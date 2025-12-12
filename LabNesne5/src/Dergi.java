import java.util.Objects;

public class Dergi implements OduncAlinabilir, Yazdirilabilir{
    private final String ad;
    private final String yazar;
    private int sayi;
    private String oduncAlan;

    public Dergi(){
        this("Bilinmeyen Dergi","Bilinmeyen Yazar",1);
    }

    public Dergi(String ad, String yazar, int sayi){
        if(ad == null || ad.isBlank()) throw new IllegalArgumentException("Dergi adı boş olamaz");
        if(yazar == null || yazar.isBlank()) throw new IllegalArgumentException("Yazar adı boş olamaz");
        if(sayi < 0) throw new IllegalArgumentException("Sayı negatif olamaz");
        this.ad = ad;
        this.yazar = yazar;
        this.sayi = sayi;
        this.oduncAlan = null;
    }

    public String getAd(){
        return ad;
    }

    public String getYazar(){
        return yazar;
    }
    public int getSayi(){
        return sayi;
    }
    public void setSayi(int sayi){
        if(sayi < 0) throw new IllegalArgumentException("Sayı negatif olamaz");
        this.sayi = sayi;
    }

    @Override
    public void oduncAl(String kime){
        if(kime == null || kime.isBlank()) throw new IllegalArgumentException("Ödünç alan kişi adı boş olamaz");
        if(this.sayi <= 0) throw new IllegalStateException("Kütüphanede mevcut dergi kalmadı");
        this.sayi--;
        this.oduncAlan = kime;
    }
    @Override
    public void iadeEt(){
        this.sayi++;
        this.oduncAlan = null;
    }
    @Override
    public boolean musaitMi(){
        return this.sayi > 0;
    }
    @Override
    public String bilgi(){
        return "Dergi adı: " + ad + " | Yazar: " + yazar + " | Adet: " + sayi + (oduncAlan != null ? (" | Ödünç alan: "+oduncAlan) : "");
    }
    @Override
    public void yazdir(){
        System.out.println(bilgi());
    }

    @Override
    public String toString(){
        return bilgi();
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Dergi dergi = (Dergi) o;
        return Objects.equals(ad, dergi.ad) && Objects.equals(yazar, dergi.yazar);
    }

    @Override
    public int hashCode(){
        return Objects.hash(ad, yazar);
    }
}
