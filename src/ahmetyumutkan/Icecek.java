package ahmetyumutkan;

public class Icecek extends Urun{
	
	private String boy;

	public Icecek(String ad, double fiyat, String boy) {
		super(ad, fiyat);//değer ataması için ata sınıfa gönderiliyor
		this.boy = boy;//boy değeri ataması yapılıyor. Atama sırasında karışıklılık olmamaması için "this" kullanıldı.
	}

	@Override
	public void urunBilgisi() {
		System.out.println("İçecek Adı:" + ad
						+"\nFiyat: "+fiyat
						+"\nBoyut: "+boy);
		//oluşturulan içecek nesnesi bilgilerini ekrana yazdırır.
	}
	

}
