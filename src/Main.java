import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Çalışanlar Programına Hoşgeldin...");
        System.out.println("-----------------------------------");
        String islemler="1.Yazılım İşlemleri\n" +
                "2. Yönetici İşlemleri\n" +
                "Çıkmak için q'ya basınız.";
        System.out.println(islemler);
        System.out.println("-----------------------------------");

        while (true){
            System.out.print("İşlem Seçiniz : ");
            String islem=scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("İşlemlerden çıkış yapılıyor...");
                break;
            }
            else if (islem.equals("1")){
                Yazılımcı yazılımcı=new Yazılımcı("Reşat","Hacıosmanoğlu",152,"PHP,HTML,JavaScript");
                System.out.println("-----------------------------------");
                String secenek="1. Format At\n" +
                        "2. Bilgileri Göster\n" +
                        "Çıkmak için q'ya basınız";
                System.out.println(secenek);
                System.out.println("-----------------------------------");

                while (true){
                    System.out.print("İslem Seçiniz : ");
                    String sec=scanner.nextLine();

                    if (sec.equals("q")){
                        System.out.println("İşlemlerden çıkış yapılıyor...");
                        break;
                    }
                    else if (sec.equals("1")){
                        System.out.println("İşletim Sistemi Adı : ");
                        String isletim_sistemi=scanner.nextLine();
                        yazılımcı.format_at(isletim_sistemi);
                    }
                    else if (sec.equals("2")){
                        yazılımcı.bilgilerigoster();
                    }
                    else {
                        System.out.println("Yanlış İşlem Seçimi Yaptınız ....");
                    }

                }

            }
            else if (islem.equals("2")){
                Yonetici yonetici=new Yonetici("Ahmet","ÇAKIR",12,20);
                System.out.println("-----------------------------------");
                String yislem="Yönetici İşlemleri\n" +
                        "1.Zam Yapsın\n" +
                        "2. Bilgileri Göster\n" +
                        "Çıkmak için q'ya basınız...";
                System.out.println(yislem);
                System.out.println("-----------------------------------");
                while (true){
                    System.out.print("İşlem Seciniz : ");
                    String yislemsec=scanner.nextLine();

                    if (yislemsec.equals("q")){
                        System.out.println("Çıkış Yapılıyor...");
                        break;
                    }
                    else if (yislemsec.equals("1")){
                        System.out.println("Ne kadar yapılmasınız istiyorsunuz : ");
                        int zam =scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamyap(zam);
                    }
                    else if (yislemsec.equals("2")){
                        yonetici.bilgilerigoster();
                    }
                }

            }
            else {
                System.out.println("Yanlış işlem seçimi yaptınız .....");
            }
        }

    }
}
