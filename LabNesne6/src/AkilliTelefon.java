public class AkilliTelefon extends Cihaz implements SarjEdilebilir,Baglanabilir,Tasinabilir{
    String isletimSistemi;
    Integer bataryaSeviyesi;
    Boolean bagli;
    String agAdi;
    Double agirlik;
    String boyut;
    static Integer toplamTelefonSayisi=0;

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
        // use provided network name
        this.agAdi = agAdi;
        this.bagli = true;
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
    @Override
    public Double getAgirlik(){
        return agirlik;
    }
    @Override
    public String getBoyut(){
        return boyut;
    }
    public AkilliTelefon(String isletimSistemi,Integer bataryaSeviyesi,Boolean bagli,String agAdi,Double agirlik,String boyut,String marka,String model,Double fiyat,Boolean acikMi){
        super(marka,model,fiyat,acikMi);
        this.marka=marka;
        this.model=model;
        this.fiyat=fiyat;
        this.acikMi=acikMi;
        this.isletimSistemi=isletimSistemi;
        this.bataryaSeviyesi=bataryaSeviyesi;
        this.bagli=bagli;
        this.agAdi=agAdi;
        this.agirlik=agirlik;
        this.boyut=boyut;
        toplamTelefonSayisi++;
    }
    public static AkilliTelefon fiyatiKarsilastir(AkilliTelefon t1, AkilliTelefon t2){
        if(t1.fiyat<t2.fiyat){
            return t1;
        }
        else if(t1.fiyat>t2.fiyat){
            return t2;
        }
        else {
            System.out.println("Fiyatlar Eşit.");
            return t1;
        }
    }
}
