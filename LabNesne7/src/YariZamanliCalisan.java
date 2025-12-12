public class YariZamanliCalisan extends Calisan implements PrimAlabilir{
    private Double saatUcreti;
    private Integer calismaSaati;

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
        if(saatUcreti==null || saatUcreti<0) throw new IllegalArgumentException("saatUcreti gecersiz");
        if(calismaSaati==null || calismaSaati<0) throw new IllegalArgumentException("calismaSaati gecersiz");
        this.saatUcreti=saatUcreti;
        this.calismaSaati=calismaSaati;
    }
    @Override
    public String calisanTipi(){
        return "Part-Time";
    }
    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Saat ucreti: "+saatUcreti+" Calisma saati: "+calismaSaati);
    }
}
