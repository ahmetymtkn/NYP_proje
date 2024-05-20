package ahmetyumutkan;

public class TEST {

	public static void main(String[] args) {
		
		Restoran restoran = new Restoran();//restoran nesnesi oluşturulur.
		
		Yemek mantı = new Yemek("Mantı",120.0,"Ara sıcak");
		restoran.menuyeUrunEkle(mantı);
		Yemek doner = new Yemek("Doner",85.0,"Izgara");
		restoran.menuyeUrunEkle(doner);
		Yemek hamburger = new Yemek("Hamburger",150.0,"XL Sandwich");
		restoran.menuyeUrunEkle(hamburger);
		Icecek kola = new Icecek("kola",30.0,"küçük");
		restoran.menuyeUrunEkle(kola);
		Icecek ayran = new Icecek("ayran",22.5,"büyük");
		restoran.menuyeUrunEkle(ayran);
		Icecek su = new Icecek("su",10.0,"küçük");
		restoran.menuyeUrunEkle(su);
		//icecek ve yemek nesneleri oluşturulup restoran nesnesinin menu listesine eklenir
		
		Musteri ali = new Musteri("Ali");
		restoran.musteriEkle(ali);
		Musteri ulas = new Musteri("Ulaş");
		restoran.musteriEkle(ulas);
		Musteri ahmet = new Musteri("Ahmet");
		restoran.musteriEkle(ahmet);
		Garson emine = new Garson("Emine");
		restoran.garsonEkle(emine);
		Garson mert = new Garson("Mert");
		restoran.garsonEkle(mert);
		Garson muhammed = new Garson("Muhammed");
		restoran.garsonEkle(muhammed);
		//garson ve musteri nesneleri oluşturulup restoran nesnesinin garsonlar ve musteriler listelerine eklenir.
		
		restoran.menuyuGoster();//restoran nesnesine menuyuGoster() methodu çalıştırılır.
		
		restoran.rasgeleSiparislerOlustur(10);//rastgele 10 sipariş oluşturulur
	}

}
