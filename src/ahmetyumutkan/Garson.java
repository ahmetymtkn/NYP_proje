package ahmetyumutkan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;//ArrayList'i kullanabilmek için import ettim.

public class Garson extends Kisi{
	public Garson(String ad) {
		super(ad); //ad degerini üst sınıfa gönderip değeri atasınıftaki ad değerine değer ataması yapıyorum.
	}
	public void siparisAl(Siparis s, ArrayList<Siparis> siparisler) {
		siparisler.add(s);//gönderilen sipariş listeye eklenir.
		
		PrintWriter yazici;	// dosya içinde bilgi yazmak için yazici nesnesi oluşturulur.
		
			
		try {
	        
	        // Klasör oluşturma işlemi
	        File klasor = new File(System.getProperty("user.dir") + "/siparisler/");//user.dir kodların bulunduğu konumu göstermektedir.
	        
	        if (!klasor.exists()) {
	            klasor.mkdirs(); // Dizin yoksa oluşturulur.
	        }
	        
			yazici = new PrintWriter(new File(System.getProperty("user.dir") + "/siparisler/"+"siparis_"+Long.toString(s.siparisNo) + ".txt"));
			//sipariş numarasına göre isimlendirilerek daha önce açılan dosyanın içerisine txt doyası oluşturulur.
			
			s.siparisYazdir(yazici);
			//siparis nesnesinin siparisYazdir methodu çalıştırılır ve sipariş bilgileri açılan txt dosyasının içine yazdırılır.
			
			s.siparisBilgisi();
			//siparis nesnesinin siparisBilgisi methodu çalıştırılır ve sipariş bilgileri ekrana yazdırılır.
			
		} catch (FileNotFoundException e) {
			System.out.println("dosya oluşturulamadı."+e);
			//dosylama konusunda bir hata oluşursa ekrana hata çıktısını verir bu sayede kod çalışmaya devam eder.
		}
			
	}
}
