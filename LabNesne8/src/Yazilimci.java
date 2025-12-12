public class Yazilimci extends Calisan implements PrimAlabilir{
    private String yazilimDili;

    public Yazilimci(String ad,Integer yas,Adres adres, String yazilimDili){
        super(ad,yas,adres);
        this.yazilimDili = yazilimDili;
    }
    public String getYazilimDili(){
        return yazilimDili;
    }
    @Override
    public Double primHesapla(){
        return 500.0;
    }

    @Override
    public String toString(){
        return "Yazilimci{ad=" + getAd() + ", yas=" + getYas() + ", dil=" + yazilimDili + "}";
    }

}
