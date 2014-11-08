package net.armacode.util;

public class Util {
	public static int evaluarRespuesta(String respuesta){
		int resultado=0;
		if(respuesta.compareTo("Si")==0){
			resultado=3;
		}else if(respuesta.compareTo("A veces")==0){
			resultado=2;
		}else if(respuesta.compareTo("Rara vez")==0){
			resultado=1;
		}else if(respuesta.compareTo("No")==0){
			resultado=0;
		}else{
			resultado=0;
		}
		return resultado;
	}
}
