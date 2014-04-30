package xmlConfig_Project;

import java.io.IOException;
import java.io.InputStream;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class Configuration {
	private String driverName = null;
	private String uId = null;
	private String pWd = null;
	private String uri = null;

	public Configuration(String configFileName) {
		SAXBuilder builder = new SAXBuilder();
		InputStream is = this.getClass().getResourceAsStream(configFileName);
		Document doc;

		try {
			doc = builder.build(is);

			Element root = doc.getRootElement();
			/* Database properties */
			driverName = root.getChild("DatabaseConfig1").getChildTextTrim("dbDriverName");
			uId = root.getChild("DatabaseConfig1").getChildTextTrim("dbUser");
			pWd = root.getChild("DatabaseConfig1").getChildTextTrim("dbPassword");
			uri = root.getChild("DatabaseConfig1").getChildTextTrim("dbURI");
		} catch (JDOMException eJDom) {
			System.out.println("Error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getpWd() {
		return pWd;
	}

	public void setpWd(String pWd) {
		this.pWd = pWd;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
