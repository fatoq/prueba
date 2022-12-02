/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author david
 */
public class asig {
        private int[] parciales = new int[3];
	private String nombre;
	/*
	public Asignatura(String nombre) {
		this.nombre = nombre;
	}
*/
	
	public String getNombre() {
		return nombre;
	}
     public void registrarNotaParcial(int nota, int posicion) {
		parciales[posicion] = nota;
	}

	public int getNotaDefinitiva() {
		int sumaNotas = parciales[0] + parciales[1] + parciales[2];
		return sumaNotas / 3;
	}
}
