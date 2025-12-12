public class PC extends Cihaz implements Baglanabilir{
    String islemci;
    Boolean bagli;
    String agAdi;
    static Integer toplamPCSayisi=0;

    @Override
    public void baglan(String agAdi){
        agAdi="Wifi";
        bagli=true;
    }
    @Override
    public void baglantiKes(){
        agAdi=null;
        bagli=false;
    }
    @Override
    public Boolean bagliMi(){
        if(agAdi==null){
            return false;
        }
        return true;
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
