package Clase_4;


public class Carro {
		// TODO Auto-generated constructor stub
		private int numeroOcupantes;
		private String color;
		private int cantidadllantas;
		private String marcacarro;
		private String TipoFuenteEnergia;
		
		public Carro(){
			
			 numeroOcupantes = 0;
			 color =null;
			 cantidadllantas=0;
			 marcacarro=null;
			 TipoFuenteEnergia =null;
			 
			 
			 
			
		}

		public int getNumeroOcupantes() {
			return numeroOcupantes;
		}

		public void setNumeroOcupantes(int numeroOcupantes) {
			this.numeroOcupantes = numeroOcupantes;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getCantidadllantas() {
			return cantidadllantas;
		}

		public void setCantidadllantas(int cantidadllantas) {
			this.cantidadllantas = cantidadllantas;
		}

		public String getMarcacarro() {
			return marcacarro;
		}

		public void setMarcacarro(String marcacarro) {
			this.marcacarro = marcacarro;
		}

		public String getTipoFuenteEnergia() {
			return TipoFuenteEnergia;
		}

		public void setTipoFuenteEnergia(String tipoFuenteEnergia) {
			TipoFuenteEnergia = tipoFuenteEnergia;
		}
		
	}


