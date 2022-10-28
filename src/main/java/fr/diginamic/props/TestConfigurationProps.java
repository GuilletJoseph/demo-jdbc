package fr.diginamic.props;

import java.util.ResourceBundle;

public class TestConfigurationProps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ResourceBundle config = ResourceBundle.getBundle("config");
		String driverName = config.getString("database.driver");
		String databaseurl = config.getString("database.url");
		String databaseuser = config.getString("database.user");
		String databasepas = config.getString("database.password");
		
		System.out.println(driverName+" "+databaseurl+" "+ databaseuser+" "+databasepas);	}

}
