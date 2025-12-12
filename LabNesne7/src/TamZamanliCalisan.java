public class TamZamanliCalisan extends Calisan implements PrimAlabilir,TerfiAlabilir{
    private Double performansPuani;
    private Integer hizmetYili;
    private String duzey;
    public TamZamanliCalisan(Double performansPuani,Integer hizmetYili,String duzey,String ad,String kimlikNo,Double temelMaas){
        super(ad,kimlikNo,temelMaas);
        if(performansPuani==null || performansPuani < 0) throw new IllegalArgumentException("performansPuani gecersiz");
        if(hizmetYili==null || hizmetYili < 0) throw new IllegalArgumentException("hizmetYili gecersiz");
        this.hizmetYili=hizmetYili;
        this.performansPuani=performansPuani;
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
        System.out.println("Duzey: "+duzey+" Performans: "+performansPuani+" Hizmet Yili: "+hizmetYili);
    }
}
