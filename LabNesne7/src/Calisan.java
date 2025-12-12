public class Calisan {
    protected String ad;
    protected String kimlikNo;
    protected Double temelMaas;

    public Calisan(String ad,String kimlikNo,Double temelMaas){
        if(ad==null || ad.isBlank()) throw new IllegalArgumentException("ad gecersiz");
        if(kimlikNo==null || kimlikNo.isBlank()) throw new IllegalArgumentException("kimlikNo gecersiz");
        if(temelMaas==null || temelMaas < 0) throw new IllegalArgumentException("temelMaas gecersiz");
        this.ad=ad;
        this.kimlikNo=kimlikNo;
        this.temelMaas=temelMaas;
    }
    public Double maasHesapla(){
        return temelMaas;
    }
    public String calisanTipi(){
        return "Calisan";
    }
    public void bilgiGoster(){
        System.out.println("Ad: "+ad+" Tc No: "+kimlikNo+" Maas: "+ maasHesapla());
    }

    @Override
    public String toString(){
        return calisanTipi()+"{"+"ad='"+ad+"', kimlikNo='"+kimlikNo+"', maas="+maasHesapla()+"}";
    }
}
