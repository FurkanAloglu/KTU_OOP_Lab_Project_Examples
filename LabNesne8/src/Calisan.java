public class Calisan {
    private String ad;
    private Integer yas;
    private Adres adres;
    private static int calisanSayisi = 0;

    public Calisan(String ad, Integer yas, Adres adres, int calisanSayisi) {
        if(ad.isEmpty()){
            throw new IllegalArgumentException("Ad bos olamaz");
        }
        this.ad = ad;
        if(adres==null){
            throw new IllegalArgumentException("Adres bos olamaz");
        }
        this.adres = adres;
        if(yas<0){
            throw new IllegalArgumentException("Yas 0'dan kucuk olamaz");
        }
        this.yas = yas;
        calisanSayisi++;
    }
    public String getAd() {
        return ad;
    }
    public Integer getYas() {
        return yas;
    }
    public Adres getAdres(){
        return adres;
    }

}
