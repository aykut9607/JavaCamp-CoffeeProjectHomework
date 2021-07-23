import java.rmi.RemoteException;
import Adapters.MernisServiceAdapter;
import Abstract.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.save(new Customer(1,"Aykut","Aykut",1995,"30301886188"));
	}

}
