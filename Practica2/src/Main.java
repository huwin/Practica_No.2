
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Lista list = new Lista();
		int opcion=0;
		String ele="", busca="";
		
		do{
			System.out.println("----------MENU----------\n1. Agregar.\n2. Mostrar Elementos."
					+ "\n3. Buscar.\n4. Eliminar.\n5. Modificar.\n6. Salir");
			Scanner o = new Scanner(System.in);
			opcion=o.nextInt();
			
			switch(opcion){
			case 1:
				System.out.print("Ingrese el elemento: ");
				Scanner e = new Scanner(System.in);
				ele=e.next();
				list.Agregar(ele);
				break;
			case 2:
				list.Imprimir();
				break;
			case 3:
				System.out.print("Ingrese la busqueda: ");
				Scanner abu = new Scanner(System.in);
				busca=abu.next();
				if(list.Buscar(busca)){
					System.out.println("El elemento "+busca+" fue encontrado.");
				}else{
					System.out.println("El elemento "+busca+" no fue encontrado.");
				}
				break;
			case 4:
				
				list.Eliminar();
				break;
			case 5:
				list.Modificar();
				break;
			}
		}while(opcion!=6);

	}

}
