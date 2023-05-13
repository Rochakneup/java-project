package modelshotel;

public class RegisterGetterSetter {
    public static  int cid;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String number;
    private String country;
    private String age;
    private String creditCard;
    
    // Constructors
    public RegisterGetterSetter() {
        this.cid = 0;
        this.name = "";
        this.email = "";
        this.password = "";
        this.gender = "";
        this.number = "";
        this.country = "";
        this.age = "";
        this.creditCard = "";
    }
    
    public RegisterGetterSetter(int cid, String name, String email, String password, String gender, String number, String country, String age, String creditCard) {
        this.cid = cid;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.number = number;
        this.country = country;
        this.age = age;
        this.creditCard = creditCard;
    }
    
    // Getters
    public int getCid() {
        return this.cid;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public String getNumber() {
        return this.number;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public String getAge() {
        return this.age;
    }
    
    public String getCreditCard() {
        return this.creditCard;
    }
    
    // Setters
    public void setCid(int cid) {
        this.cid = cid;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public void setAge(String string) {
        this.age = string;
    }
    
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
    
    // toString
    public String toString() {
        return this.cid + ", " + this.name + ", " + this.email + ", " + this.password + ", " + this.gender + ", " + this.number + ", " + this.country + ", " + this.age + ", " + this.creditCard;
    }

	public boolean insert(RegisterGetterSetter user) {
		// TODO Auto-generated method stub
		return false;
	}
}
