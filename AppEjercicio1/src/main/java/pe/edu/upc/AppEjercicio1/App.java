package pe.edu.upc.AppEjercicio1;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
    	
    	int numero;
    	
    	double Numero;
    	
    	//Wrapper (Clases envolventes)
    	Double valores = new Double(13);
    	
    	String[] ArrNombres = new String[3];
    	
    	for (int i = 0; i < ArrNombres.length; i++) {
    		System.out.println("Nombre"+(i+1));
    		ArrNombres[i]=s.nextLine();
    	}
    	System.out.println( "Hello World!" );
    }
}
