public class Main {
    public static void main(String[] args) {
        TamZamanliCalisan t1 = new TamZamanliCalisan(1.5,5,"Orta","Ali","11111111111",5000.0);
        YariZamanliCalisan p1 = new YariZamanliCalisan(25.0,120,"Ayse","22222222222",2000.0);
        Stajyer s1 = new Stajyer("Mehmet","33333333333",1000.0);
        Yonetici y1 = new Yonetici("Yazilim",10,2.0,4,"Yetkili","Veli","44444444444",8000.0);

        Calisan[] tum = new Calisan[]{t1,p1,s1,y1};

        for(Calisan c: tum){
            System.out.println(c);
            c.bilgiGoster();
            System.out.println("Hesaplanan Maas: "+c.maasHesapla());
            System.out.println("----");
        }

        System.out.println("Toplam Maas: "+IKDepartmani.toplamMaas(tum));

        // Promote full-time employees
        IKDepartmani.promoteIfEligible(t1);
        System.out.println("TamZamanli terfi durumu: "+t1.terfiDurumunuGetir());

        // Show Yonetici bonus
        System.out.println("Yonetici maasi: "+y1.maasHesapla());
    }
}

