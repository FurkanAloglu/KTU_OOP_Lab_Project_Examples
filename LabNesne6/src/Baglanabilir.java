public interface Baglanabilir {
    void baglan(String agAdi);
    void baglantiKes();
    Boolean bagliMi();
    String getBaglantiAg();
    default void baglantiDurumunuGoster(){
        if(bagliMi() == true){
            System.out.println("Bağlantı: " + getBaglantiAg());
        }
        else {
            System.out.println("Bağlantı Yok.");}
    }
}
