public class Yonetici extends TamZamanliCalisan {
    String departman;
    Integer ekipBoyutu;

    public Yonetici(String departman, Integer ekipBoyutu, Double performansPuani, Integer hizmetYili, String duzey, String kimlikNo, Double temelMaas) {
        super(performansPuani, hizmetYili, duzey, kimlikNo, temelMaas);
        this.departman = departman;
        this.ekipBoyutu = ekipBoyutu;
    }
    public Double yoneticiPrimi() {
        return ekipBoyutu * temelMaas * 0.01;
    }
    @Override
    public Double maasHesapla() {
        return temelMaas + primHesapla() + yoneticiPrimi();
    }
    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Departman: " + departman);
        System.out.println("Ekip boyutu: " + ekipBoyutu);
    }
}
