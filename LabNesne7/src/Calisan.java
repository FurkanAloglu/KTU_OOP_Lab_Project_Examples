public class Calisan {
    String ad;
    String kimlikNo;
    Double temelMaas;

    public Calisan(String ad,String kimlikNo,Double temelMaas){

    }
    public Double maasHesapla(){
        return temelMaas;
    }
    public String calisanTipi(){
        return "Calisan";
    }
    public void bilgiGoster(){
        System.out.println("Ad"+ad+"Tc No: "+kimlikNo+"Maaş: "+ maasHesapla());
    }
}
