
public abstract class GamaCalculator {
            public abstract void hesapla(); {//kim inherite ediyorsa hesapla y� override etmek zorunda 
            	System.out.println("puan�n�z: "); //abstract s�n�flar new lenemez
            }//new lenebilmesi i�in ezmek gerek ama kullan�lmaz gibi
            //abstract lar tek ba��na kullan�lmaz
            public final void gameOver() {  //override edilmez
            	System.out.println("oyun bitti");
            }
}
