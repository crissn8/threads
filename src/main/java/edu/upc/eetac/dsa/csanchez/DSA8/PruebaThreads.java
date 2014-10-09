package edu.upc.eetac.dsa.csanchez.DSA8;

public class PruebaThreads {

	
	public static void main(String args[])
	{
	CuentaAtras contador1 = new CuentaAtras("ID1", 4);
		new Thread(new CuentaAtras(contador1.id,contador1.num)).start();
		
	CuentaAtras contador2 = new CuentaAtras("ID2", 7);
	new Thread(new CuentaAtras(contador2.id,contador2.num)).start();

	CuentaAtras contador3 = new CuentaAtras("ID3", 8);
	new Thread(new CuentaAtras(contador3.id,contador3.num)).start();
	
	}
		
}
