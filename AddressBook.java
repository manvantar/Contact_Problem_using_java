package Day6;

public class AddressBook {
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	int zip;
	String phoneNumber;
	String email;
	
	public AddressBook(String fn,String ln,String a,String c,String s,int z,String pNumber,String email ) {

	this.firstname=fn;
	this.lastname=ln;
	this.address=a;
	this.city=c;
	this.state=s;
	this.zip=z;
	this.phoneNumber=pNumber;
	this.email=email;
	}
	public static void main(String[] args) {
		AddressBook a1=new AddressBook("Manu","K V","Areker","Bengaluru","Karnataka",560076,"9663393660","manukvshetty@gmail.com");
	
	}

}
