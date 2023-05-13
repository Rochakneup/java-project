package controllerhotel;
import modelshotel.RegisterGetterSetter ;

public class RegisterManager {
	public boolean insert(RegisterGetterSetter user) {
		//Receive user info from UI
		//Validate user info
		//Send user info to DB
		//Receive user status from DB
		//Return Login status to UI
		RegisterJDBC userJDBC = new RegisterJDBC();
		boolean result = userJDBC.insert(user);
		return result;
	}

}