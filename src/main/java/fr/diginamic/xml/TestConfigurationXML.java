package fr.diginamic.xml;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class TestConfigurationXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configurations configs = new Configurations();
		try {
		XMLConfiguration config = configs.xml("config.xml");
		String nomBase = config.getString("database[@nom]");
		String host = config.getString("database.host");
		System.out.println(nomBase+" "+host);
		} catch (ConfigurationException e) {
		e.printStackTrace();
		}
	}

}
