public class Main{
    public static void main(String[] args){
        AkilliTelefon t1 = new AkilliTelefon("Android",100,false,null,150.0,"Büyük","Samsung","A52",15000.0,false);
        AkilliTelefon t2 = new AkilliTelefon("iOS",10,true,"wifi",240.0,"Küçük","iPhone","17ProMax",100000.0,true);
        Laptop l1= new Laptop(16,59,true,null,600.0,"Büyük","Asus","Tuf A15",40000.0,true);
        PC p1=new PC("Amd",true,"Wi-fi","MSI","V10",40000.0,true);

        // Additional objects
        AkilliSaat s1 = new AkilliSaat(true,15,0.05,"Apple","WatchX",8000.0,false);
        AkilliSaat s2 = new AkilliSaat(false,80,0.03,"Samsung","GalaxyWatch",6000.0,true);
        Laptop l2 = new Laptop(8,10,false,null,2.5,"Küçük","Lenovo","Ideapad",25000.0,false);
        PC p2 = new PC("Intel",false,null,"HP","Pavilion",35000.0,true);

        System.out.println("Akıllı saat sayısı: "+ AkilliSaat.toplamAkilliSaatSayisi);
        System.out.println("Akıllı telefon sayısı: "+AkilliTelefon.toplamTelefonSayisi);
        System.out.println("Laptop sayısı: "+Laptop.toplamLaptopSatisi);
        System.out.println("PC sayısı: "+PC.toplamPCSayisi);

        // Turn devices on
        t1.ac();
        t2.ac();
        l1.ac();
        l2.ac();
        p1.ac();
        p2.ac();
        s1.ac();
        s2.ac();

        // Show info
        t1.bilgiGoster();
        t2.bilgiGoster();
        l1.bilgiGoster();
        l2.bilgiGoster();
        p1.bilgiGoster();
        p2.bilgiGoster();
        s1.bilgiGoster();
        s2.bilgiGoster();

        // Networking
        t2.baglantiDurumunuGoster();
        t2.baglan("Ev_Wifi");
        t2.baglantiDurumunuGoster();
        t2.baglantiKes();
        t2.baglantiDurumunuGoster();

        p1.baglan("Ofis_Ag");
        p1.baglantiDurumunuGoster();
        p1.baglantiKes();
        p1.baglantiDurumunuGoster();

        // Charging
        System.out.println("t2 batarya: "+t2.getBataryaSeviyesi()+" tam mı: "+t2.tamSarjMi());
        t2.sarjEt(5);
        System.out.println("t2 batarya (şarj sonrası): "+t2.getBataryaSeviyesi()+" tam mı: "+t2.tamSarjMi());

        System.out.println("l2 batarya: "+l2.getBataryaSeviyesi()+" düşük mü: "+l2.dusukBataryaMi());
        l2.sarjEt(3);
        System.out.println("l2 batarya (şarj sonrası): "+l2.getBataryaSeviyesi());

        // Portability
        System.out.println("t1 hafif mi: "+t1.hafifMi());
        System.out.println("l1 hafif mi: "+l1.hafifMi());
        System.out.println("s1 hafif mi: "+s1.hafifMi());

        t1.tasinabilirlikBilgisiGoster();
        l1.tasinabilirlikBilgisiGoster();
        s1.tasinabilirlikBilgisiGoster();

        // Compare prices
        AkilliTelefon ucuz = AkilliTelefon.fiyatiKarsilastir(t1,t2);
        System.out.println("Ucuz telefon: "+ucuz.marka+" "+ucuz.model+" Fiyat: "+ucuz.fiyat);

    }
}