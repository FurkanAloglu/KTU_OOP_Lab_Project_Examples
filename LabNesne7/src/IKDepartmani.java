public class IKDepartmani{
    public static void promoteIfEligible(TerfiAlabilir t){
        if(t==null) return;
        t.terfiEt();
    }

    public static Double toplamMaas(Calisan[] calisanlar){
        double toplam=0.0;
        if(calisanlar==null) return 0.0;
        for(Calisan c: calisanlar){
            if(c!=null) toplam+=c.maasHesapla();
        }
        return toplam;
    }
}
