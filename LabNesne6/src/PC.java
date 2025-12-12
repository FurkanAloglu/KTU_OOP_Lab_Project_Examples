public class PC extends Cihaz implements Baglanabilir{
    String islemci;
    Boolean bagli;
    String agAdi;
    static Integer toplamPCSayisi=0;

    @Override
    public void baglan(String agAdi){
        this.agAdi = agAdi;
        this.bagli=true;
    }
    @Override
    public void baglantiKes(){
        this.agAdi=null;
        this.bagli=false;
    }
    @Override
    public Boolean bagliMi(){
        return Boolean.TRUE.equals(bagli);
    }
    @Override
    public String getBaglantiAg(){
        if(bagliMi()==true){
            return agAdi;
        }
        else{
            System.out.println("Bağlantı Mevcut Değil.");
            return null;
        }
    }
    public PC(String islemci,Boolean bagli,String agAdi,String marka,String model,Double fiyat,Boolean acikMi){
        super(marka,model,fiyat,acikMi);
        this.islemci=islemci;
        this.bagli=bagli;
        this.agAdi=agAdi;
        this.marka=marka;
        this.model=model;
        this.fiyat=fiyat;
        this.acikMi=acikMi;
        toplamPCSayisi++;
    }
}
