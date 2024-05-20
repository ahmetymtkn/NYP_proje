package ahmetyumutkan;

public class Kisi {
	String ad;
	public Kisi(String ad) {
		this.ad=ad;
		//Nesne oluşumu sırasında kullanılacak değerin ataması yapıldı. Atama sırasında karışıklıktan kurtulmak için "this" kullanıldı.
	}
	public String getAd() {
		return ad;//oluşturulan kisinin ad değerini döndürmeyi sağlar.
	}
}
