import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        double km, yaş, ytip, toplam, nt, yaşind, it, gdi;
        double perkm = 0.10, yio = 0 ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = inp.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yaş = inp.nextInt();
        System.out.print("Yolculuk tipinizi giriniz :(1 => Tek Yön , 2 => Gidiş Dönüş )");
        ytip = inp.nextInt();
        if (km > 0) {
            if (ytip != 1 && ytip != 2) {
                System.out.println("LÜTFEN GEÇERLİ DEĞER GİRİNİZ !!");
            } else if (ytip == 1) {
                nt = km * perkm;
                System.out.println("TEK YÖN TUTARINIZ : " + nt);
            } else if (ytip == 2) {
                if (yaş < 12) {
                    yio = yio + 0.50;
                } else if (yaş >= 12 && yaş <= 24) {
                    yio = yio + 0.10;
                }else if (yaş >= 25 && yaş < 65) {
                    yio = 0;
                }else if (yaş >= 65) {
                    yio = yio + 0.30;
                }
                nt = km * perkm;
                toplam = ((nt-(nt*yio)) - ((nt-(nt*yio)))*0.20) * 2;
                System.out.println("GİDİŞ DÖNÜŞ FİYAT = " + toplam);
            }
        }else {
            System.out.println("HATALI DEĞER !!");
        }
    }
}
/* önce km verisinin doğruluğu kontrol edildi, sonra sırası ile yolculuk tipi seçeneği doğruluğu,
eğer doğru seçilmiş ise yaş indirimi için yaş kontrolü yapıldı ve daha sonra indirimli tutar hesaplandı.
 */