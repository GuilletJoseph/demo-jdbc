package fr.diginamic.jvm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestLocale {

	public static void main(String[] args) {
		
		
		
		SimpleDateFormat formateur = new SimpleDateFormat("EEEEE dd MMMMM yyyy");
		Date date1 = new Date();
		System.out.println(formateur.format(date1));
		
		
		
		
		
	}

}
