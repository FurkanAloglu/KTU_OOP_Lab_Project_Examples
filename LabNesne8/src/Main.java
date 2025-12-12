public class Main{
    public static void main(String[] args) {
        Adres adres1 = new Adres("İzmir","9043");
        Calisan calisan1 = new Calisan("Emirhan",21,adres1);
        Adres adres2 = new Adres("İzmir","Adalet");
        Calisan calisan2 = new Calisan("Furkan",19,adres2);

        Yazilimci y = new Yazilimci("Ahmet",30,new Adres("Ankara","Atatürk Cad."),"Java");
        Mudur m = new Mudur("Mehmet",40,new Adres("İzmir","Cumhuriyet"),5,true);

        System.out.println(calisan1);
        System.out.println(calisan2);
        System.out.println(y);
        System.out.println(m);

        System.out.println(y.getAd() + " prim: " + y.primHesapla());
        System.out.println(m.getAd() + " prim: " + m.primHesapla());
        m.terfiEt();

        System.out.println("Toplam calisan sayisi: " + Calisan.getCalisanSayisi());
    }
}