
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager(); 
		customerManager.databaseManager=new SQLServerDatabaseManager();  //sadece sa� taraftaki de�i�tirilir,istenildi�i zaman
        customerManager.getCustomers();  //abstract s�n�flar tek �al��t�r�lmaz,stratejini belirlemen gerek bi �st sat�r
	}

}
