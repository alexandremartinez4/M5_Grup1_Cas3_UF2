import java.io.*;
import java.util.Scanner;

class programa2{

	public static int factorial (int numero){
		 
		if(numero==0)
		return 1;
		
		else{
			int resultat = numero * factorial(numero-1);
			return resultat;
		}
	}
	
    public static void main (String[] args )throws IOException{
    	
    	System.out.print("Benvinguts al programa de Grup1!!! ");
       	System.out.print("\n----------------------------------\n\n");
        do{
        	System.out.println("\t MENU");
        	               	        	           	
        	System.out.print("Tria una opció. Factorial o Potencies:  ");
        	Scanner opt=new Scanner(System.in);
        	int opcio = opt.nextInt();
        	switch(opcio) {

		        case 1:
		        	int numero = 0;
		    		boolean bandera;
		    		do{
		    			
		    				System.out.println("\nÉs l'opció factorial");		
		 		    		System.out.print("\n");
		 		    	try{	 
		    				System.out.print("Introduex un numero: ");
		    				Scanner escriu_numero=new Scanner(System.in);
		    				numero = escriu_numero.nextInt();
		    				bandera=true;
		    						 		    		
		 		    		while(numero != '*'){
		 		    			System.out.print("Introduex un numero: ");
		 		    			numero = escriu_numero.nextInt();
		 		    			
			 		    	    while(numero < 0){
			 		    	    	if(numero < 0){
			 			   	     		System.out.println("Error");
			 			   	     		System.out.print("Escriu un número enter i positiu: ");
			 			   	     	}
			 		    	    	numero = escriu_numero.nextInt();
			 		    	    }
		 		    		}
		    			}
		    			catch(NumberFormatException e){
		    				System.out.print("Sols es permeten numeros");
		    				bandera=false;
		    				}
		    		}while(!bandera);
		    				    	    
		   	    	System.out.println(factorial(numero));         		 
		   
		    	break;

		        case 2:
		        	Scanner in = new Scanner(System.in);
		            int numero1=0, exponent;
		            int potencia;
		           
		            System.out.println("\nÉs l'opció potencia ");
		            System.out.print("\n");
		            
		            while(numero1 != '*'){
			            
		            	System.out.print("Introduex un numero: ");
		            	numero1 = in.nextInt();
			           
			            System.out.print("Introduex un exponent: ");
			            exponent = in.nextInt();
			
			            potencia= (int) Math.pow(numero1,exponent);
			            System.out.println("Valor de potencia: " + potencia);
			            System.out.print("\n");
		            }
		        break;
       
		        default:
		        	System.out.println("Error" );
		        break;
            

            
        	}
        }while(true);
    }
}
      
        
      