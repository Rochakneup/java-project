package controllerhotel;

import modelshotel.BookingGetterSetter;


public class BookingManager {
	public boolean insert(BookingGetterSetter user) {
		//Receive user info from UI
		//Validate user info
		//Send user info to DB
		//Receive user status from DB
		//Return Login status to UI
		BookingJDBC userJDBC = new BookingJDBC();
		boolean result = userJDBC.insert(user);
		return result;
	}

}
