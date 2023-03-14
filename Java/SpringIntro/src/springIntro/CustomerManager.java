package springIntro;

public class CustomerManager implements ICustomerService {

	private ICustomerDal customerDal;

	// Constructor Injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	@Override
	public void add() {
		customerDal.add();
	}

	
	//Setter Injection
//	public void setCustomerDal(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}

}
