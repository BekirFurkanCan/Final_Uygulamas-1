

package final1;

public class Dikdortgen {
     //üye değişkenler
        public double uzunluk;
        public double genislik;
 
        public double AlanGetir() //AlanGetir metotu
        {
            return uzunluk * genislik; //işlem yaptırıp değer döndürme
        }
 
        public void Yazdir()
        { 
            //Ekrana yazdırma
            System.out.println("Uzunluk: "+ uzunluk);
            System.out.println("Genişlik: "+ genislik);
            System.out.println("Dikdörtgen Alanı: "+ AlanGetir());
        }
    
}
