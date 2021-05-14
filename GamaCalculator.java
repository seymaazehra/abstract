
public abstract class GamaCalculator {
            public abstract void hesapla(); {//kim inherite ediyorsa hesapla yý override etmek zorunda 
            	System.out.println("puanýnýz: "); //abstract sýnýflar new lenemez
            }//new lenebilmesi için ezmek gerek ama kullanýlmaz gibi
            //abstract lar tek baþýna kullanýlmaz
            public final void gameOver() {  //override edilmez
            	System.out.println("oyun bitti");
            }
}
