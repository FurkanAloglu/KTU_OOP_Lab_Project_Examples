public class Main{
    public static void main(String[] args){
        AkilliTelefon t1 = new AkilliTelefon("Android",100,false,null,150.0,"Büyük","Samsung","A52",15000.0,false);
        AkilliTelefon t2 = new AkilliTelefon("iOS",10,true,"wifi",240.0,"Küçük","iPhone","17ProMax",100000.0,true);
        Laptop l1= new Laptop(16,59,true,null,600.0,"Büyük","Asus","Tuf A15",40000.0,true);
        PC p1=new PC("Amd",true,"Wi-fi","MSI","V10",40000.0,true);

        System.out.println("Akıllı saat sayısı: "+ AkilliSaat.toplamAkilliSaatSayisi);
        System.out.println("Akıllı telefon sayısı: "+AkilliTelefon.toplamTelefonSayisi);

        t1.ac();
        t2.ac();
        l1.ac();
        p1.ac();

    }
}