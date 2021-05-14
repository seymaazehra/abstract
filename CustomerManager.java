
public class CustomerManager {
	
	
	DatabaseManager databaseManager;  //ikisininde extend ettiği sınıf bu referans bu tutar ve onda veri tutulur
	
       public void getCustomers() {
    	   databaseManager.getData();//databasem., abstract oldugundan tek çalıştırılmaz, new
       }
}
