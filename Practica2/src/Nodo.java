
public class Nodo {
	
	public String dato;
	public Nodo siguiente;
	
	//constructor para insertar al final
	public Nodo (String d){
		this.dato = d;
		this.siguiente = null; //para que apunte el nodo creado a nulo
	}
	//constructor para insertar al incio
	public Nodo (String d, Nodo n){
		dato = d;
		siguiente=n;
	}
}
