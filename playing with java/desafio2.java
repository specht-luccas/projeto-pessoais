package ABAP_desafios;

import java.util.*;
public class Desafio2 {

		public static void main(String args[]) {
			Scanner tc = new Scanner(System.in);
			
			String c="| | | | | | | | | |"; 
		
			System.out.println(c);
			int cont=0;
			 	
			for(int i=0;i<19;i++) {
				cont++;
				c = c.substring(0,c.length()-1);
				
			if(cont==1||cont==3||cont==5||cont==7||cont==9||cont==11||cont==13||cont==15||cont==17) {
				
				System.out.println(c);
			   }
     		}
			tc.close();
		}
	}
