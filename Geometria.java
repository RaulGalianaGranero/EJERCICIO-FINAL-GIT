/**
 * Clase Geometria
 * La vamos a usar para calcular las areas de un circulo, un cuadrado y un rectangulo 
 * @author Raul Galiana
 * @version 1.0
 *  */
 
public class Geometria {

	public static final double pi= 3.1416;
	
		/**Metodo que nos calcula el area de un cuadrado
	 * @param lado del cuadrado que vamos a calcular
	 * @return devuelve el area del cuadrado */
	 
	public static double calcularAreaCuadrado (double lado){
		return lado*lado ;
		}
		
		/**Metodo que nos calcula el area de un rectangulo
	 * @param base y altura del rectangulo que vamos a calcular
	 * @return devuelve el area del rectangulo */
	 
	public static double calcularAreaRectangulo( double base, double altura){
		return base*altura;
		}
		
		/**Metodo que nos calcula el area de un circulo
	 * @param radio del circulo que vamos a calcular
	 * @return devuelve el area del circulo */
		
	public static double calcularAreaCirculo (double radio){
		return radio*radio*pi;
		}
}
