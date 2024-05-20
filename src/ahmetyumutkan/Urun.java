package ahmetyumutkan;

public abstract class Urun {
	
	protected String ad;
	protected double fiyat;
	
	public Urun(String ad,double fiyat) {
		this.ad=ad;
		this.fiyat=fiyat;
		//Nesne oluşumu sırasında kullanılacak değerlerin ataması yapıldı. Atama sırasında karışıklıktan kurtulmak için "this" kullanıldı.
	}
	
	public String getAd() {
		return this.ad;
		//ad değerini döndürüyorum.
	}
	
	public double getFiyat() {
		return this.fiyat;
		//fiyat değerini döndürüyorum.
	}
	
	public abstract void urunBilgisi();//Urun adlı sınıftan oluşturulacak yavru sınıflarda da urunBilgisi adlı method oluşturmak zorunda.
}
