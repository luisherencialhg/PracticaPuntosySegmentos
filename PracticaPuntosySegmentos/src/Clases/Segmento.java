package Clases;
/*
 * Esta es la clase generadora de Segmentos
 */
/**
 * Constructor por defecto
 * @param son los puntos del segmento
 */
public class Segmento {
Punto a;
Punto b;

public Segmento() {
	// TODO Auto-generated constructor stub
	this.a= new Punto (0,0);
	this.b= new Punto (1,1);
	
}
public Segmento(Punto a, Punto b) {
	// TODO Auto-generated constructor stub
	this.a= a;
	this.b= b;
	
}
public Punto getA() {
	return a;
}
public Punto getB() {
	return b;
}
public void setA(Punto a) {
	this.a = a;
}
public void setB(Punto b) {
	this.b = b;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+a.toString()+"," +b.toString()+"]";
	}

/**
 * Calcula la distancia del segmento
 * @param los parametros son los puntos y d es la distancia en unidades enteras
 * @return La distancia
 */
public double distancia(Punto a, Punto b) {
    double d;
    
    d= Math.sqrt(Math.pow(b.getCoordX() - a.getCoordX(), 2) + Math.pow(b.getCoordY() - a.getCoordY(), 2));
    return d;
}

}
