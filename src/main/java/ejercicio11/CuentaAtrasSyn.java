package ejercicio11;

public class CuentaAtrasSyn extends Thread{

	int num;
	String id;
	static String ultimaescritura;

	static int cont = 0;
	
	public CuentaAtrasSyn( String ID, int numero) {
		
		numero=num;
		id = ID;
		ultimaescritura = "";
		
		cont++;
			
		
	}
	
	public int Getcontador() {
		return cont;	}
	
	public void Setcontador() {
		cont--;
	}
	
	
	public void run() {
		while (num >= 0) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	
		}

			if (num == 0) {
				Setcontador();
				System.out.println("ultima escritura " + id + " quedan "
						+ Getcontador() + " Threads activos");
				System.out.println(id + " - " + num + " ultima escritura "
						+ ultimaescritura);

			} else
				System.out.println(id + " - " + num + " ultima escritura "
						+ ultimaescritura);
			--num;
			synchronized (this) {
				ultimaescritura = id;
			}
	}
}
