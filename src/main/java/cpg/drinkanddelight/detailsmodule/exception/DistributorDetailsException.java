package cpg.drinkanddelight.detailsmodule.exception;

@SuppressWarnings("serial")
public class DistributorDetailsException  extends Exception{

	String exceptionMessage;
	public  DistributorDetailsException(String message) {
		exceptionMessage=message;
	}
	
	public String getMessage() {
		return exceptionMessage;
	}
}
