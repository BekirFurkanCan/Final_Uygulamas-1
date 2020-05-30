// Bu örnekte, public (herkes erişebilir) erişim belirleyici kullanarak dikdötgenin
// alanını hesaplayan programı oluşturdum
package final1;
public class Final1 {
    public static void main(String[] args) {
Dikdortgen sekil = new Dikdortgen();
            sekil.uzunluk = 4;  //public olduğu için sınıf dışından ulaşılabilir durumda
            sekil.genislik = 5; //public olduğu için sınıf dışından ulaşılabilir durumda
            sekil.Yazdir();     //public olduğu için sınıf dışından ulaşılabilir durumda
           
    }
    
}
