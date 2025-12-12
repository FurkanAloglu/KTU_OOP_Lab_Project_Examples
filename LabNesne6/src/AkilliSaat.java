public class AkilliSaat extends Cihaz implements SarjEdilebilir,Tasinabilir{
    Boolean gpsVarMi;
    Integer bataryaSeviyesi;
    Double agirlik;
    String agAdi;
    String boyut;
    Boolean bagli;
    static Integer toplamAkilliSaatSayisi=0;

    public AkilliSaat(Boolean gpsVarMi,Integer bataryaSeviyesi, Double agirlik,String marka,String model,Double fiyat,Boolean acikMi){
        super(marka,model,fiyat,acikMi);
        this.gpsVarMi=gpsVarMi;
        this.bataryaSeviyesi=bataryaSeviyesi;
        this.agirlik=agirlik;
        this.marka=marka;
        this.model=model;
        this.fiyat=fiyat;
        this.acikMi=acikMi;
        toplamAkilliSaatSayisi++;
    }
    @Override
    public void sarjEt(Integer dakika){
        if(dusukBataryaMi()){
            dakika=50;
        }
        else{
            dakika=10;
        }
        bataryaSeviyesi=100;
    }
    @Override
    public Integer getBataryaSeviyesi(){
        return bataryaSeviyesi;
    }
    @Override
    public Double getAgirlik(){
        return agirlik;
    }
    @Override
    public String getBoyut(){
        return boyut;
    }
}
