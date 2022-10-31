package fr.diginamic.jvm;

import java.util.ArrayList;
import java.util.List;

public class TestMemoire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List <Integer> lst =new ArrayList();
		
		int f = 1, k=0;
		for (; ; ) {
			
			for (int i=0; i<10; i++) {				
				lst.add(i);
				k++;
			}
			
			
			if (k==10000) {				
				System.out.println(" boucle de "+ f + " liste="+lst.size());
				f++;
				k=0;
			}
			
		}
	}

}
