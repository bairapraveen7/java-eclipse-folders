package factory;

public class UiFactoryFactory {
	
	
	public static UIFactory getUiFactoryFactory(SupportedPlatforms platform) {
		return switch(platform) {
		case IOS -> new IosUIFactory();
		case ANDROID -> new AndroidUIFactory();
		};
	}

}
