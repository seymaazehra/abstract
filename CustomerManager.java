
public class CustomerManager {
	
	
	DatabaseManager databaseManager;  //ikisininde extend etti�i s�n�f bu referans bu tutar ve onda veri tutulur
	
       public void getCustomers() {
    	   databaseManager.getData();//databasem., abstract oldugundan tek �al��t�r�lmaz, new
       }
}
