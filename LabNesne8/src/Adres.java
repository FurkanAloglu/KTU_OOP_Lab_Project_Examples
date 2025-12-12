public class Adres {
    private String sehirAdi;
    private String sokakAdi;

    public String getSehirAdi(){
        return sehirAdi;
    }
    public String getSokakAdi(){
        return sokakAdi;
    }
    public Adres(String sehirAdi, String sokakAdi) {
        this.sehirAdi = sehirAdi;
        this.sokakAdi = sokakAdi;
    }
}
