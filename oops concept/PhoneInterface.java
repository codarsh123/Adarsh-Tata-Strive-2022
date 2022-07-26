package interface1;

public class PhoneInterface implements CameraInterface,ClockInterface {

 

	@Override
	public void time() {
    System.out.println("the time is 6:56");		
	}

	@Override
	public Void photo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void video() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
