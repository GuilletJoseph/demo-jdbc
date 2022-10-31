package fr.diginamic.xml;

import java.util.List;

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
		String nomHost = config.getString("database.host");
		String nomPort = config.getString("database.port");
		String nomUser = config.getString("database.user");
		String nomPsw = config.getString("database.pwd");
		System.out.println(nomBase+" "+nomHost+ " "+nomPort+ " "+nomUser+" "+nomPsw);
	
	
		} catch (ConfigurationException e) {
		e.printStackTrace();
		}
	}

}
