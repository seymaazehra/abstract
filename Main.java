
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager(); 
		customerManager.databaseManager=new SQLServerDatabaseManager();  //sadece sağ taraftaki değiştirilir,istenildiği zaman
        customerManager.getCustomers();  //abstract sınıflar tek çalıştırılmaz,stratejini belirlemen gerek bi üst satır
	}

}
