package ejercicio11;

import java.io.IOException;

public class PruebaThreadSyn {

	
	public static void main(String args[]) throws IOException,
	InterruptedException {

		CuentaAtrasSyn contador1 = new CuentaAtrasSyn("ID1", 4);
		CuentaAtrasSyn contador2 = new CuentaAtrasSyn("ID2", 8);
		CuentaAtrasSyn contador3 = new CuentaAtrasSyn("ID3", 7);
		contador2.start();

		contador3.start();

		contador1.start();

	}
}
