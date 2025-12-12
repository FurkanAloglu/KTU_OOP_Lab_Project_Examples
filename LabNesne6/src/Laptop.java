public class Laptop extends Cihaz implements SarjEdilebilir,Baglanabilir,Tasinabilir{
    Integer ram;
    Integer bataryaSeviyesi;
    Boolean bagli;
    String agAdi;
    Double agirlik;
    String boyut;
    static Integer toplamLaptopSatisi=0;

    public Laptop(Integer ram,Integer bataryaSeviyesi,Boolean bagli,String agAdi,Double agirlik,String boyut,String marka,String model,Double fiyat,Boolean acikMi){
        super(marka,model,fiyat,acikMi);
        this.ram=ram;
        this.bataryaSeviyesi=bataryaSeviyesi;
        this.bagli=bagli;
        this.agAdi=agAdi;
        this.agirlik=agirlik;
        this.boyut=boyut;
        this.marka=marka;
        this.model=model;
        this.fiyat=fiyat;
        this.acikMi=acikMi;
        toplamLaptopSatisi++;
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
    @Override
    public Double getAgirlik(){
        return agirlik;
    }
    @Override
    public String getBoyut(){
        return boyut;
    }
}
