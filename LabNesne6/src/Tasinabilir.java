public interface Tasinabilir {
    Double getAgirlik();
    String getBoyut();
    default Boolean hafifMi(){
        if(getAgirlik()<1.0){
            return true;
        }
        else{
            return false;
        }
    }
    default void tasinabilirlikBilgisiGoster(){
        System.out.println("Ağırlık: "+getAgirlik()+"Boyut: "+getBoyut());
    }
}
