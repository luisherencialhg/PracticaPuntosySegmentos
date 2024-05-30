package app;
import Clases.Punto;
import Clases.Segmento;
import java.util.Random;
public class Principal {

	public static void main(String[] args) {
	
		
		/*
		 * Es la clase principal donde se calcularan las distancias de los puntos generados
		 */
			Random random =new Random();

		    Punto punto1 = new Punto(random.nextInt(11), random.nextInt(11));
		    Punto punto2 = new Punto(random.nextInt(11), random.nextInt(11));
		    Punto punto3 = new Punto(random.nextInt(11), random.nextInt(11));
		    Punto punto4 = new Punto(random.nextInt(11), random.nextInt(11));
		    Segmento seg1 = new Segmento (punto1,punto2);
		    Segmento seg2 = new Segmento (punto3,punto4);
		    
		    double distanciaseg1 = seg1.distancia(punto1,punto2);
		    double distanciaseg2 = seg2.distancia(punto3,punto4);

		}

	}


