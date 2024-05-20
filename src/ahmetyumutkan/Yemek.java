package ahmetyumutkan;

public class Yemek extends Urun {
	
	private String tur;

	public Yemek(String ad, double fiyat, String tur) {
		super(ad, fiyat);//değer ataması için atasınıfa gönderiliyor
		this.tur = tur;//tur değeri ataması yapılıyor.
	}

	@Override
	public void urunBilgisi() {
		System.out.println("Fiyat Adı:" + ad
				+"\nFiyat: "+fiyat
				+"\nTür: "+tur);
				//oluşturulan yemek nesnesi bilgilerini ekrana yazdırır.
		
	}
	

}
