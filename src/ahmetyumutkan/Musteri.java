package ahmetyumutkan;

import java.util.Date;

public class Musteri extends Kisi{
	public Musteri(String ad) {
		super(ad);//ad degerini üst sınıfa gönderip değeri atasınıftaki ad değerine değer ataması yapıyorum.
	}
	public Siparis siparisver(Yemek yemek,Icecek icecek) {
		return (new Siparis(yemek,icecek,null,this,new Date()));
		//gönderilen değerler ile sipariş oluşturulur. Garson değeri olmadığı için null değeri atanır. Musteri değeri girdisi olarakta kullanılan nesneyi atamak için this kullanılır.
	}
}
