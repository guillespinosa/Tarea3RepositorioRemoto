package tarea1git;

import java.util.ArrayList;

public class Receta {

	private String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ingredientes> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public ArrayList<String> getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}

<<<<<<< HEAD
	private String ingredientes;
	private ArrayList<String> preparacion;
=======
	private ArrayList<Ingredientes> ingredientes;
	private String preparacion;
>>>>>>> 52395bea7d106d497964cf178fc3a4987b983760
	
	public Receta(String nombre){
		this.nombre=nombre;
	}
	
<<<<<<< HEAD
	public Receta(String nombre, String ingredientes, ArrayList<String> preparacion){
=======
	public Receta(String nombre, ArrayList<Ingredientes> ingredientes, String preparacion){
>>>>>>> 52395bea7d106d497964cf178fc3a4987b983760
		this.nombre=nombre;
		this.ingredientes=ingredientes;
		this.preparacion=preparacion;
	}
	
}
