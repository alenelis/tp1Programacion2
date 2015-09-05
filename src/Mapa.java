package tp1c2;

import java.util.ArrayList;

public class Mapa {
private Ciudad [] ciudades;
private int [][] ady;

private int n;

public Mapa(int tamano){
	n= tamano;
	ciudades = new Ciudad [n];	
	ady = new int [n][n];

	for (int i=0; i<n; i++){
		ciudades [i] = new Ciudad(i,"Ciudad" + i);
		for (int j=0; j<n; j++){
			ady[i][j] = 0;	//distancias default en 0
		}
	}
	
}


public int tamano(){
	return n;
}

public void asignarNombre(Integer ciudadID, String nombre){
	ciudades[ciudadID].Nombre = nombre;
}

public void agDist(int i, int j, int dist, boolean simetrico){ 
	ady[i][j] = dist;
	
	if (simetrico){
		ady[j][i] = dist;
				
	}
}

// distancia en tiempos nominales
public int dist(int i, int j){ // si es adyacente tomamos ady[i][j]

return ady[i][j];
}

ArrayList<Ciudad> caminoMinimoProbable(Integer ciudadOrigen, Integer ciudadDestino){
	ArrayList<Ciudad> ret = new ArrayList<Ciudad>();
	
	ret.add(ciudades[0]);
	
	//implementar!
	
	return ret;
}

}
