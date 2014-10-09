package ejercicio10;

import java.io.IOException;

public class PruebaThreads3 {
	
	public static void main(String args[]) throws IOException,
	InterruptedException {

cuentaAtras contador1 = new cuentaAtras("ID1", 4);
cuentaAtras contador2 = new cuentaAtras("ID2", 8);
cuentaAtras contador3 = new cuentaAtras("ID3", 7);

contador1.start();

contador2.start();

contador3.start();

}

}
