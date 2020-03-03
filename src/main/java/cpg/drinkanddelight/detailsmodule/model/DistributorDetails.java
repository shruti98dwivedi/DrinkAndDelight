package cpg.drinkanddelight.detailsmodule.model;

public class DistributorDetails {

	long distributorId;
	long phoneNumber;
	String address;
	String name;
	public  DistributorDetails() {}
	
	public  DistributorDetails(long d,long p,String a,String n) {
		setDistirbutor_ID(d);
		setPhone_number(p);
		setAddress(a);
		setName(n);
	}

	public long getDistirbutor_ID() {
		return distributorId;
	}

	public void setDistirbutor_ID(long distirbutor_ID) {
		distributorId = distirbutor_ID;
	}

	public long getPhone_number() {
		return phoneNumber;
	}

	public void setPhone_number(long phone_number) {
		this.phoneNumber = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
