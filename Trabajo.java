package biblioteca;

public class matematicas {

    
  /**
  * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
    falso en caso contrario.
  * 
  * @param x número del que se quiere saber si es capicúa
  * @return  verdadero si el número que se pasa como parámetro es capicúa y
  *          falso en caso contrario
  */
  public static boolean esCapicua(long x) {   
    long aux = 0;
    long g = 0;
    long aux2 = x;
    
   do{
     aux = aux2 % 10;
     aux2 = aux2 / 10;
     g = g * 10 + aux;
   }while (aux2 > 0);
  
    if (x == g){
     return true; 
    }
    else{
      return false;
    }
}    
  /**
  * Devuelve verdadero si el número que se pasa como parámetro es primo
  * 
  * @param x número del que se quiere saber si es primo
  * @return  verdadero si el número que se pasa como parámetro es primo y
  *          falso en caso contrario
  */
    
   public static boolean esPrimo(long n) {   
    long aux = 1;
    long aux2 = 0;
    
   do{
      if (n % aux == 0){
        aux2 ++;
      }
      aux ++;
   }while (aux <= n);
  
    if (aux2 == 2){
     return true; 
    }
    else{
      return false;
    }
}
  /**
  /* Devuelve el menor primo que es mayor al número que se pasa como parámetro.
  *
  * @param n un número entero
  * @return  el menor primo que es mayor al número que se pasa como parámetro
  */
	public static int siguientePrimo(int n) {
		while (!esPrimo (++n));
		return n;
	}
	
  /**
  /* Devuelve la potencia a partir de la base y del exponente
  *
  * @param n un número entero
  * @return la potencia
  */
	public static double potencia(int base, int exponente) {
		return base * exponente;
		
		
		}
	



}
