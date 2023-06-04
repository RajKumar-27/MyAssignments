package week2day4.Assignment1;

public class Automation extends MultipleLanguages {


	public void java() {
		
		System.out.println("Java Method");
		
	}

	
	public void selenium() {
		
		System.out.println("Selenium Method");
		
	}


	public void ruby() {
		
		System.out.println("Ruby Method");
	}
	
	public static void main(String[] args) {
		Automation a1 = new Automation();
		a1.java();
		a1.selenium();
		a1.python();
		a1.ruby();
	}

}
