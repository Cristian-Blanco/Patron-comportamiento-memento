/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Originator;

/**
 *
 * @author Cristian
 */
public class Registro {
    private String nombre;
	private int edad;
	private String correo;

	public Registro(String n, int e, String a){
		this.nombre = n;
		this.edad = e;
		this.correo = a;
	}
        
        public String getInfo(){
            String text = "<tr>\n" +
                    "       <td>"+this.nombre+"</td><td>"+this.edad+"</td><td>"+this.correo+"</td>\n" +
                    "	 </tr>\n";

            return text;
        }
        
        
}
