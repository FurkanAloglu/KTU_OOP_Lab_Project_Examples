public class TamZamanliCalisan extends Calisan implements PrimAlabilir,TerfiAlabilir{
    Double performansPuani;
    Integer hizmetYili;
    String duzey;
    public TamZamanliCalisan(Double performansPuani,Integer hizmetYili,String duzey,String ad,String kimlikNo,Double temelMaas){
        super(ad,kimlikNo,temelMaas);
        this.hizmetYili=hizmetYili;
        this.performansPuani=performansPuani;
        this.ad=ad;
        this.kimlikNo=kimlikNo;
        this.temelMaas=temelMaas;
        this.duzey=duzey;
    }
    @Override
    public Double maasHesapla(){
        return (temelMaas+primHesapla());
    }
    @Override
    public Double primHesapla(){
        return (performansPuani*hizmetYili);
    }
    @Override
    public void terfiEt(){
        duzey="Terfi edildi.";
    }
    @Override
    public String terfiDurumunuGetir(){
        return duzey;
    }
    @Override
    public String calisanTipi(){
        return "Full-Time";
    }
    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
    }
}
