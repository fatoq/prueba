/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author david
 */
public class est {
   private Asignatura[] asignaturas = new Asignatura[5];
	private String nombre;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
        public void registrarAsignatura(Asignatura asign, int posicion) {
		asignaturas[posicion] = asign;
	}
        public int getNotaDeAsignatura(int posicion) {
		return asignaturas[posicion].getNotaDefinitiva();
	}
        public int getPromedioGeneral() {
		//Sumamos las notas definitivas de sus asignaturas
	int sumaNotas = 0;
	for (Asignatura asig: asignaturas)
			sumaNotas += asig.getNotaDefinitiva();
		//Retornamos el promedio
		return sumaNotas / 5; 
}
