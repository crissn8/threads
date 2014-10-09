package edu.upc.eetac.dsa.csanchez.DSA8;

import java.io.*;
import java.util.Set;

public class CuentaAtras extends Thread {
	
	public  int num ;
	public  String id;
	
	public int i= 0;
	public int identificador;
	public Thread[] threadArray;
	
	
	public CuentaAtras(String ID, int n){
		
		num = n;
		ID = id;
	}
	
	public String toString()
	{System.out.print("Cuenta atras de " + id + "    ");
		
	if(num== 0)
	{
		identificador = num;
		 Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		 threadArray = threadSet.toArray(new Thread[threadSet.size()]);
	}else
	{
		identificador = 100;
	}
		return " Cuenta atras en: "+ num +"\n";
		
		 
	}
	public void run()
	{
		while(true)
		{
			System.out.println(this);
			
			if(num != 0)
			{
				num = num -1 ;
			}else
			{
				break;
			}
				
			i++;
			
		}
	}
	
}	

		