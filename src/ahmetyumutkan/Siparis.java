package ahmetyumutkan;

import java.io.PrintWriter;
import java.util.Date;// Date ve PrintWriter classlarını kullanabilmek için import ettim.

public class Siparis {
	
	private Yemek yemek;
	private Icecek icecek;
	public Garson garson;
	private Musteri musteri;
	public Date date;
	public static long siparisNo;
	
	public Siparis(Yemek yemek, Icecek icecek, Garson garson, Musteri musteri, Date tarih) {
		this.yemek = yemek;
		this.icecek = icecek;
		this.garson = garson;
		this.musteri = musteri;
		this.date = tarih;
		siparisNo++;
		//Daha önce oluşturulan değerlere değer ataması yaptım. Değerlerin karışmaması için "this" kullandım.
	}
	
	public void siparisBilgisi() {
		String varYemek = yemek != null ? (yemek.ad+" - "+yemek.fiyat): " Bos - 0.0";
		//ternary yapısı ile oluşturulan sipariş nesnesinin yemek değeri olup olmadığı kontrol edilir. Varsa varYemek değerine yemek adı + fiyat ataması yapılır, yoksa " Bos - 0.0" ataması yapılır.
		
		String varIcecek = icecek != null ? (icecek.ad+" - "+icecek.fiyat):" Bos - 0.0";
		//ternary yapısı ile, oluşturulan sipariş nesnesinin icecek değeri olup olmadığı kontrol edilir. Varsa varİcecek değerine icecek adı + fiyat ataması yapılır, yoksa " Bos - 0.0" ataması yapılır.
		
		System.out.println("Sipariş Bilgileri:"
				+ "\nYemek: " + varYemek
				+ "\nİçecek: " + varIcecek
				+ "\nGarson: " + garson.ad
				+ "\nMüşteri: " + musteri.ad
				+ "\nZaman: " + date.toString()
				+ "\nSipariş alındı.\n");
	}
	//sipariş nesnesinin özellikleri ekrana yazdırılır
	
	public void siparisYazdir(PrintWriter yazici) {
		String varYemek = yemek != null ? (yemek.ad+" - "+yemek.fiyat): " Bos - 0.0";
		//ternary yapısı ile oluşturulan sipariş nesnesinin yemek değeri olup olmadığı kontrol edilir. Varsa varYemek değerine yemek adı + fiyat ataması yapılır, yoksa " Bos - 0.0" ataması yapılır.
		
		String varIcecek = icecek != null ? (icecek.ad+" - "+icecek.fiyat):" Bos - 0.0";
		//ternary yapısı ile, oluşturulan sipariş nesnesinin icecek değeri olup olmadığı kontrol edilir. Varsa varİcecek değerine icecek adı + fiyat ataması yapılır, yoksa " Bos - 0.0" ataması yapılır.
		
		yazici.println("Sipariş Bilgileri:"
				+ "\nYemek: " + varYemek
				+ "\nİçecek: " + varIcecek
				+ "\nGarson: " + garson.ad
				+ "\nMüşteri: " + musteri.ad
				+ "\nZaman: " + date.toString()
				+ "\nSipariş alındı.\n");
		// sipariş nesnesinin özellikleri PrintWriter sayesinde daha önceaçılan dosyanın içine yazdırılır.
		
		yazici.close();//daha önce oluşturulan yazici nesnesi kapatılır.
	}
}
