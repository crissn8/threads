package ejercicio9;

public class CuentaAtras implements Runnable {
	
	public  int num ;
	public  String id;
	
	public int i= 0;
	
	public CuentaAtras(String ID, int numero){
		
		numero = num;
		ID= id;
				
		
	}
	
	public String toString()
	{System.out.print("Cuenta atras de " + id + "    ");
		
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
