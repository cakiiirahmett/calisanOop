public class Yazılımcı extends Calısan{
    private String bildigi_diller;
    public Yazılımcı(String ad, String soyad, int id,String bildigi_diller) {
        super(ad, soyad, id);
        this.bildigi_diller=bildigi_diller;
    }
    public void format_at(String isletim_sistemi){
        System.out.println(getAd()+" adlı kişi "+isletim_sistemi+" işletim sistemini yüklemekte...");
    }

    @Override
    public void bilgilerigoster() {
        System.out.println("-----------------------------------");
        super.bilgilerigoster();
        System.out.println("Bildiği Diller : "+bildigi_diller);
        System.out.println("-----------------------------------");
    }
}
