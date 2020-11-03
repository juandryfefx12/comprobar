import java.util.Arrays;

public class FIFO {

	public static void main(String[] args) {
		
		//VARIABLES
		int[] tiempoLlegada = new int[]{ 16 , 4 , 18 ,12 ,1,6};
		int[] rafagaCpu = new int[]{ 6 , 14 , 8 ,2,11 ,66}; 
		int tmp = 0, contadorLlegada, contadorCPU;
		
		//EMPIEZA EL PROGRAMA
		for (contadorLlegada = 1; contadorLlegada < tiempoLlegada.length; contadorLlegada++) {
		   for (contadorCPU = 0; contadorCPU < tiempoLlegada.length-1; contadorCPU++) {
			   
		       if(tiempoLlegada[contadorCPU]>tiempoLlegada[contadorCPU+1]){
		          
		    	  tmp = tiempoLlegada[contadorCPU];
		          tiempoLlegada[contadorCPU] = tiempoLlegada[contadorCPU+1];
		          tiempoLlegada[contadorCPU+1]= tmp;
		          tmp = rafagaCpu[contadorCPU];
		          rafagaCpu[contadorCPU] = rafagaCpu[contadorCPU+1];
		          rafagaCpu[contadorCPU+1]= tmp;
		       }
		    }
		}
		
		System.out.println(Arrays.toString(tiempoLlegada));
		System.out.println(Arrays.toString(rafagaCpu));

	}

}
