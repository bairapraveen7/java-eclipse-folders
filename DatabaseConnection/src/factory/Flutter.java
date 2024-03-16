package factory;

public class Flutter {
	
	public SupportedPlatforms platform;
	
	public Flutter(SupportedPlatforms p) {
		this.platform = p;
	}
	
	public void setTheme() {
		System.out.print("Setting Theme");	
	}
	
	public void setRefreshRate() {
		System.out.print("Setting Refresh Rate to 10Hz");
	}
	
	public UIFactory createFactory() {
		 return UiFactoryFactory.getUiFactoryFactory(platform);
	}
	
}
