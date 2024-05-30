package Clases;
/*
 * Esta clase es la generadora de Puntos
 */
public class Punto {

	int coordX;
	int coordY;
	  /**
     * Constructor de puntos
     * @param Las coordenadas de cada punto
     * 
     */
	public Punto(int coordX, int coordY) {
		// TODO Auto-generated constructor stub
		this.coordX=coordX;
		this.coordY=coordY;
		
	}
	public Punto() {
		// TODO Auto-generated constructor stub
		coordX=0;
		coordY=0;
	}
	public int getCoordX() {
		return coordX;
	}
	public int getCoordY() {
		return coordY;
	}
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "(" + coordX + "," + coordY + ")";
		}
	
}
