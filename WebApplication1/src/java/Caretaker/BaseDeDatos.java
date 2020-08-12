/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caretaker;
import Originator.*;
import Memento.*;
import static java.lang.System.out;
import java.util.ArrayList;
/**
 *
 * @author Cristian
 */
public class BaseDeDatos {
    private ArrayList<Registro> listado;
	private Memento memento;
        private String text = "";
        private int entrada = 0;

	public BaseDeDatos(){
                if(entrada == 0){
                    listado = new ArrayList<Registro>();
                    memento = new Memento();
                    entrada = 1;
                }	
	}

	public void agregarRegistro(String n, int e, String a){
		Registro temp = new Registro(n,e,a);
		listado.add(temp);
	}

	public void limpiarBD(){
		listado = null;
	}

	public String mostrarListado(){
            if(listado!=null){
                    for(Registro temp: listado){
                        text = text + temp.getInfo();
                    }
            } else {
                text = "<tr>\n" +
                    "       <td>Base de Datos vasia</td><td></td><td></td>\n" +
                    "	 </tr>\n";;
            }
            return text;
	}

	public void generarBackup(){
		memento.setBackup(listado);
	}

	public void getBackup(int i){
		listado = new ArrayList<Registro>();
		for(Registro temp: memento.getBackup(i)){
			listado.add(temp);
		}
	}

	public int getTamanioBackup(){
		return memento.getSize();
	}
}
