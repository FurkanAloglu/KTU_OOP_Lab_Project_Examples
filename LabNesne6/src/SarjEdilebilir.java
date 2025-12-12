public interface SarjEdilebilir {
    void sarjEt(Integer dakika);
    Integer getBataryaSeviyesi();
    default Boolean tamSarjMi(){
        if(getBataryaSeviyesi()==100){
            return true;
        }
        else
            return false;
    }
    default Boolean dusukBataryaMi(){
        if(getBataryaSeviyesi()<20){
            return true;
        }
        else
            return false;
    }
}
