public class Mudur extends Calisan implements PrimAlabilir,TerfiAlabilir{
    private Integer ekipBuyuklugu;
    private Boolean terfiyeUygun;

    public Mudur(String ad,Integer yas,Adres adres,int calisanSayisi,Integer ekipBuyuklugu,Boolean terfiyeUygun){
        super(ad,yas,adres,calisanSayisi);
    }
    @Override
    public void terfiEt(){
        System.out.println("Terfi edildi.");
    }
    @Override
    public Double primHesapla(){
        return (ekipBuyuklugu*1000.0);
    }
}
