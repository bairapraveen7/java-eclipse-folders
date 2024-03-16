package factory;

import factory.buttons.Button;

public class Client {
	
	public static void main(String[] args) {
		Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
		UIFactory uifactory = flutter.createFactory();
		
		Button button = uifactory.createButton();
		button.changeSize();
		
	}

}
