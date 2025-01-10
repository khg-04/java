package sub8;

public class SmartTv extends Tv implements Computer {

	@Override
	public void boot() {
		System.out.println("SmartTv bood");
		
	}

	@Override
	public void internet() {
		System.out.println("SmartTv internet");
		
	}

}
