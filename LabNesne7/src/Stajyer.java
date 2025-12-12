public class Stajyer extends Calisan{
    public Stajyer(String ad,String kimlikNo,Double temelMaas){
        super(ad,kimlikNo,temelMaas);
    }
    @Override
    public Double maasHesapla(){
        return temelMaas*0.3;
    }
    @Override
    public String calisanTipi(){
        return "Stajyer";
    }
    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
    }
}
