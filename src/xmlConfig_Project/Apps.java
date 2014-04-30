package xmlConfig_Project;

public class Apps {
	private static final String CONFIG_FILENAME = "/xmlConfig.xml";
	private static String driverName=null;
	private static String uID=null;
	private static String pWd=null;
	
	


	private static String uRl=null;

	public static void main(String[] args) {
		
		Configuration config=new Configuration(CONFIG_FILENAME);
		
		setDriverName(config.getDriverName());
		setuID(config.getuId());
		setpWd(config.getpWd());
		setuRl(config.getUri());
		
		
		
		
		

	}

	public static String getDriverName() {
		return driverName;
	}

	public static void setDriverName(String driverName) {
		Apps.driverName = driverName;
	}
	
	public static String getuID() {
		return uID;
	}

	public static void setuID(String uID) {
		Apps.uID = uID;
	}

	public static String getpWd() {
		return pWd;
	}

	public static void setpWd(String pWd) {
		Apps.pWd = pWd;
	}

	public static String getuRl() {
		return uRl;
	}

	public static void setuRl(String uRl) {
		Apps.uRl = uRl;
	}

	
}
