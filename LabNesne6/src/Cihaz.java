public class Cihaz {
    String marka;
    String model;
    Double fiyat;
    Boolean acikMi;

    public Cihaz(String marka,String model,Double fiyat,Boolean acikMi){
        this.marka=marka;
        this.model=model;
        this.fiyat=fiyat;
        this.acikMi=acikMi;
    }
    public void ac(){
        if(acikMi==false){
            acikMi=true;
        }
    }
    public void kapa(){
        if(acikMi==true){
            acikMi=false;
        }
    }
    public void bilgiGoster(){
        System.out.println("Marka Adı: "+marka+"Model Adı: "+model+"Fiyat: "+fiyat);
    }
}
