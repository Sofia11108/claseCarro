package objetos;

import java.util.HashMap;
import javax.swing.JOptionPane;

import claseCoche.Coche;

public class Procesos {

	HashMap<String, Coche> mapaCoches = new HashMap<String, Coche>();
	
	public void iniciar() {
		
		int opcion;
		
		do { 
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu()));
			validarOpc(opcion);
			
		}while (opcion != 4);
		
	}

	public String menu() {
		
		String menu;

		menu = "---- MENU ---- \n";
		menu += "Ingrese una opcion: \n";
		menu += "1. Registrar coches. \n";
		menu += "2. Consultar lista de coches. \n";
		menu += "3. Consultar coche. \n";
		menu += "4. Salir.\n";

		return menu;
	}
	
	private void validarOpc(int opcion) {
		
		switch (opcion) {
		case 1:
			registrarCoches();
			break;
			
		case 2: 
			if (!mapaCoches.isEmpty()) {
				consultarLista();	
			} else {
				JOptionPane.showMessageDialog(null, "Ingrese almenos un registro");
			}		
			break;
			
		case 3: 
			if (!mapaCoches.isEmpty()) {
				consultarCoche();	
			} else {
				JOptionPane.showMessageDialog(null, "Ingrese almenos un registro");
			}		
			break;
			
		case 4: 
			JOptionPane.showMessageDialog(null, "Gracias por usar el programa. \n Vuelva pronto.", "Cerrando", JOptionPane.WARNING_MESSAGE);
			break;

		default: 
			JOptionPane.showMessageDialog(null, "opción incorrecta");
			break;
		} 
		
	}

	public void registrarCoches() {
		String placa, marca, color, cilindraje;
		int año, n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de coches a registrar"));
		
		for (int i = 0; i < n; i++) {
			Coche nuevoCoche = new Coche();
			
			placa = JOptionPane.showInputDialog("Ingrese la placa del coche # " + (i+1));
			marca = JOptionPane.showInputDialog("Ingrese la marca");
			color = JOptionPane.showInputDialog("Ingrese el color");
			cilindraje = JOptionPane.showInputDialog("Ingrese el cilindraje");
			año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo"));

			nuevoCoche.setPlaca(placa);
			nuevoCoche.setMarca(marca);
			nuevoCoche.setColor(color);
			nuevoCoche.setCilindraje(cilindraje);
			nuevoCoche.setAño(año);
		
			mapaCoches.put(nuevoCoche.getPlaca(), nuevoCoche);
		}
		
		JOptionPane.showMessageDialog(null, "Registro Exitoso");
	}
	
	
	public void consultarLista() {
		
		String resultado = "";
		
		resultado = "---- Lista de coches registrados ---- \n";
		for (Coche coche: mapaCoches.values()) {
			
			resultado += "Placa: " + coche.getPlaca() + "\n";
			resultado += "Marca: " + coche.getMarca() + "\n";
			resultado += "Color: " + coche.getColor() + "\n";
			resultado += "Cilindraje: " + coche.getCilindraje() + " Km \n";
			resultado += "Modelo: " + coche.getAño() + "\n";
			resultado += "Arrancar: " + coche.arrancar() + "\n";
			resultado += "Frenar: " + coche.frenar() + "\n";
			resultado += "Parquear: " + coche.parquear() + "\n \n";
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	
	private void consultarCoche() {
		
		String resultado, placa;
		
		placa = JOptionPane.showInputDialog("Ingrese la placa del carro a buscar");
		
		if (mapaCoches.containsKey(placa)) {
			Coche coche = mapaCoches.get(placa);
			
			resultado = "----Datos del carro por placa " +placa+ "---- \n";
			
			resultado += "Placa: " + coche.getPlaca() + "\n";
			resultado += "Marca: " + coche.getMarca() + "\n";
			resultado += "Color: " + coche.getColor() + "\n";
			resultado += "Cilindraje: " + coche.getCilindraje() + " Km \n";
			resultado += "Modelo: " + coche.getAño() + "\n";
			resultado += "Arrancar: " + coche.arrancar() + "\n";
			resultado += "Frenar: " + coche.frenar() + "\n";
			resultado += "Parquear: " + coche.parquear() + "\n \n";
			
			JOptionPane.showMessageDialog(null, resultado);
			
		} else {
			JOptionPane.showMessageDialog(null, "No se encuentra el coche con placas " + placa + " en el sistema");
		}
		
	}

}
