package MicrowaveProblem;
	//Eric Fomichev
	//CS176L
public class MicrowaveTester {

	public static void main(String[] args) {
		
		Microwave myMicrowave = new Microwave();
		
		myMicrowave.increaseTime();
		myMicrowave.increaseTime();
		myMicrowave.switchPower();
		myMicrowave.start();
		myMicrowave.reset();

	}

}
