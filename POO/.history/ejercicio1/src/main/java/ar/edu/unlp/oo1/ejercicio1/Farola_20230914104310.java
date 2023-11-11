package ar.edu.unlp.oo1.ejercicio1;
import java.util.List;
import java.util.ArrayList;
public class Farola {
    private boolean on=false;
    private ArrayList<Farola> neighborList;

    /*
     * Crear una farola. Debe inicializarla como apagada
     */
public Farola (){}
/*
* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
*/
public void pairWithNeighbor( Farola otraFarola ){
    this.neighborList.add(otraFarola);
}
/*
* Retorna sus farolas vecinas
*/
public List<Farola> getNeighbors (){
    return this.neighborList;
}


/*
* Si la farola no está encendida, la enciende y propaga la acción.
*/
public void turnOn(){
    if (!this.isOn()){
        this.on=true;
        for (Farola f: neighborList){
            f.turnOn();
        }
    }
}

/*
* Si la farola no está apagada, la apaga y propaga la acción.
*/
public void turnOff(){
    if (this.isOn()){
        this.on=false;
        for (Farola f: neighborList){
            f.turnOn();
        }
    }
}

/*
* Retorna true si la farola está encendida.
*/
public boolean isOn(){
    return this.on;
}


}
