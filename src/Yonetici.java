public class Yonetici extends Calısan{
    private int sorumlu_kisi_sayısı;
    public Yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayısı) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayısı=sorumlu_kisi_sayısı;
    }

    @Override
    public void bilgilerigoster() {
        System.out.println("-----------------------------------");
        super.bilgilerigoster();
        System.out.println("Sorumlu Kişi Sayısı : "+sorumlu_kisi_sayısı);
        System.out.println("-----------------------------------");
    }
    public void zamyap(int miktar){
        System.out.println(getAd()+" kisi"+miktar+" TL zam yapmıştır.");
    }
}
