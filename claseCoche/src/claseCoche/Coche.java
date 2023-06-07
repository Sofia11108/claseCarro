package claseCoche;

public class Coche {

	private String placa;
	private String marca;
	private String color;
	private String cilindraje;
	private int año;
	
	public Coche() {
		
	}
	
	public Coche(String placa, String marca, String color, String cilindraje, int año) {
		setPlaca(placa);
		setMarca(marca);
		setColor(color);
		setCilindraje(cilindraje);
		setAño(año);		
	}
	
	
	public String arrancar() {
		String resultado;
		resultado = "carro " + placa + " arrancando...";
		
		return resultado;
	}
	
	public String frenar() {
		String resultado;
		resultado = "carro " + placa + " frenando...";
		
		return resultado;
	}
	
	public String parquear() {
		String resultado;
		resultado = "carro " + placa + " parqueando...";
		
		return resultado;		
	}
	

	
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public String getPlaca() {
			return placa;
		}
		
		
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getMarca() {
			return marca;
		}
	
		
		public void setColor(String color) {
			this.color = color;
		}
		public String getColor() {
			return color;
		}
		
		
		public void setCilindraje(String cilindraje) {
			this.cilindraje = cilindraje;
		}
		public String getCilindraje() {
			return cilindraje;
		}
	
		
		public void setAño(int año) {
			this.año = año;
		}
		public int getAño() {
			return año;
		}

	
}
