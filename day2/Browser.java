package week1.day2;

public class Browser {
	String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
	return browserName;
	}
	void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser = new Browser();
		browser.launchBrowser("edge");
		browser.loadUrl();
				
		}
	}


