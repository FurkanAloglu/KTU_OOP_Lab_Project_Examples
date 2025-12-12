public class YariZamanliCalisan extends Calisan implements PrimAlabilir{
    Double saatUcreti;
    Integer calismaSaati;

    @Override
    public Double maasHesapla(){
        return (calismaSaati*saatUcreti+primHesapla());
    }
    @Override
    public Double primHesapla(){
        if(calismaSaati>160){
            return 0.0;
        }
        return calismaSaati*saatUcreti*0.2;
    }
    public YariZamanliCalisan(Double saatUcreti,Integer calismaSaati,String ad,String kimlikNo,Double temelMaas){
        super(ad,kimlikNo,temelMaas);
        this.saatUcreti=saatUcreti;
        this.calismaSaati=calismaSaati;
        this.ad=ad;
        this.kimlikNo=kimlikNo;
        this.temelMaas=temelMaas;
    }
    @Override
    public String calisanTipi(){
        return "Part-Time";
    }
    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
    }
}
