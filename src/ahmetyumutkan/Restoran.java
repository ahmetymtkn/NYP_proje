package ahmetyumutkan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

public class Restoran {
	
	private ArrayList<Urun> menu;
	private ArrayList<Siparis> siparisler;
	private ArrayList<Musteri> musteriler;
	private ArrayList<Garson> garsonlar;
	
	public Restoran() {
		menu = new ArrayList<Urun>();
		siparisler = new ArrayList<Siparis>();
		musteriler = new ArrayList<Musteri>();
		garsonlar = new ArrayList<Garson>();
		//listeler oluşturuluyor.
	}
	
	public void menuyeUrunEkle(Urun urun) {
		menu.add(urun);//methoda gönderilen ürün listeye eklendi;
	}
	
	public void musteriEkle(Musteri musteri) {
		musteriler.add(musteri);//methoda gönderilen musteri listeye eklendi;
	}
	
	public void garsonEkle(Garson garson) {
		garsonlar.add(garson);	//methoda gönderilen garson listeye eklendi;
	}
	
	public void menuyuGoster() {
		System.out.println("----- MENÜ -----");
		for(Urun x : menu) {//bu döngü ile menu çerisndeki urunlerde sırasıyla gezip ekrana menu listesini yazdırıyorum.
			x.urunBilgisi();
			System.out.println("----------------");
		}
	}
	
	public void rasgeleSiparislerOlustur(int sayi) {
		for(int i = 0;i<sayi;i++) {
			Yemek yemek = null;
			Icecek icecek = null;
			Garson garson = garsonlar.get((int) (Math.random()*(garsonlar.size())));//garsonlar listesinden rastgele garson seçilip garson nesnesine atanıyor.
			Musteri musteri = musteriler.get((int) (Math.random()*(musteriler.size())));// musteriler listesinden rastgele musteri seçilip musteri nesnesine atanır.
			
			
			int secimYemek = (int) (Math.random()*(menu.size()));//random sayı oluşturuluyor ama listenin boyutu içerisinde kalınmasına dikkat ediliyor.
				
			if(menu.get(secimYemek)instanceof Yemek) {//seçilen urun yemek olup olmadığı kontrol ediliyor
				yemek = (Yemek)menu.get(secimYemek);//eğer yemekse atama yapılıp döngü kırılıyor
			}
			
			int secimIcecek = (int) (Math.random()*(menu.size()));//random sayı oluşturuluyor ama listenin boyutu içerisinde kalınmasına dikkat ediliyor.
				
			if(menu.get(secimIcecek)instanceof Icecek) {//seçilen urun içecek olup olmadığı kontrol ediliyor
				icecek = (Icecek)menu.get(secimIcecek);	//eğer içecekse atama yapılıyor
			}
				
			if (yemek == null && icecek == null) {//hem icecek hem de yemek nesnelerinin oluşup oluşmadığı kontrol ediliyor. 
				sayi++;
				continue;//her iki değerde boşsa ("null") döngü arttırıl bu döngü atlanır bu sayede sipariş oluşturulmamış olur.
			}
			
			Siparis siparis = musteri.siparisver(yemek, icecek); // musteri nesnesindeki siparisver metoduyla sipariş oluşturulur.
			siparis.garson = garson;//oluşturulan siparişin garsonu olmaıdğı için ,daha önce seçilen garson atanır
			
			garson.siparisAl(siparis,siparisler);//garsona sipariş ve ve siparişler listesi verilir
			
		}
		
	}
	
}
