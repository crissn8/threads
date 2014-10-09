package ejercicio10;

public class cuentaAtras extends Thread {
	
	
	int n;
	String id;
	static String ultimaescritura;

	static int cont = 0;
	
	public cuentaAtras(String ID, int num)throws InterruptedException{
		
		n=num;
		id = ID;
		ultimaescritura = "";
		
		cont++;
	}
	
	public void Setescritura(String escritura) {
		ultimaescritura = escritura;
	}
	
	public String Getescritura(){
		return ultimaescritura;
				
		}
	
	public int Getcontador() {
		return cont;	}
	
	public void Setcontador() {
		cont--;
	}
	
	public void run() {
		while (n >= 0) {

			if (n == 0) {
				Setcontador();
				System.out.println("ultima escritura " + id + " quedan "
						+ Getcontador() + " Threads activos");
				System.out.println(id + " - " + n + " ultima escritura "
						+ Getescritura());

			} else
				System.out.println(id + " - " + n + " ultima escritura "
						+ Getescritura());
			--n;
			Setescritura(id);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	
		}
	}	
}
	
