public class Yonetici extends TamZamanliCalisan {
    private String departman;
    private Integer ekipBoyutu;

    public Yonetici(String departman, Integer ekipBoyutu, Double performansPuani, Integer hizmetYili, String duzey, String ad, String kimlikNo, Double temelMaas) {
        super(performansPuani, hizmetYili, duzey, ad, kimlikNo, temelMaas);
        if(departman==null || departman.isBlank()) throw new IllegalArgumentException("departman gecersiz");
        if(ekipBoyutu==null || ekipBoyutu<0) throw new IllegalArgumentException("ekipBoyutu gecersiz");
        this.departman = departman;
        this.ekipBoyutu = ekipBoyutu;
    }
    public Double yoneticiPrimi() {
        return ekipBoyutu * maasHesapla() * 0.01; // small bonus based on current salary
    }
    @Override
    public Double maasHesapla() {
        return super.maasHesapla() + ekipBoyutu * 0.01 * super.maasHesapla();
    }
    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Departman: " + departman);
        System.out.println("Ekip boyutu: " + ekipBoyutu);
    }
}
