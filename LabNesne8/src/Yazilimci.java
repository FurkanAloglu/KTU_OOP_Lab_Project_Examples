public class Yazilimci extends Calisan implements PrimAlabilir{
    private String yazilimDili;

    public Yazilimci(String ad,Integer yas,Adres adres, String yazilmiDili){
        super(ad,yas,adres);
    }
    public String getYazilimDili(){
        return yazilimDili;
    }
    @Override
    public Double primHesapla(){
        return 500.0;
    }

}
