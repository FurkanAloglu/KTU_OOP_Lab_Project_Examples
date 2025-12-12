public class Mudur extends Calisan implements PrimAlabilir,TerfiAlabilir{
    private Integer ekipBuyuklugu;
    private Boolean terfiyeUygun;

    public Mudur(String ad,Integer yas,Adres adres,Integer ekipBuyuklugu,Boolean terfiyeUygun){
        super(ad,yas,adres);
        this.ekipBuyuklugu = (ekipBuyuklugu == null ? 0 : ekipBuyuklugu);
        this.terfiyeUygun = (terfiyeUygun == null ? false : terfiyeUygun);
    }
    @Override
    public void terfiEt(){
        if(Boolean.TRUE.equals(this.terfiyeUygun)){
            System.out.println(getAd() + " terfi edildi.");
            this.terfiyeUygun = false;
        } else {
            System.out.println(getAd() + " terfiye uygun değil.");
        }
    }
    @Override
    public Double primHesapla(){
        return (ekipBuyuklugu * 1000.0);
    }

    @Override
    public String toString(){
        return "Mudur{" + getAd() + ", ekip=" + ekipBuyuklugu + ", terfiyeUygun=" + terfiyeUygun + "}";
    }
}
