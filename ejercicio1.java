package FicherosBinarios;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ejercicio1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File fichero = new File ("/home/cf17eric.visier/Escriptori/FicheroDatos.dat");
		DataOutputStream dataOS = new DataOutputStream(new FileOutputStream (fichero, true));
				
		String nombre[] = {"Eric", "Manolo", "Andrea"};
		int edad[] = {19,99,21};
		int i = 0;
		
		for(String nombres : nombre) {
			try { 
				
				dataOS.writeUTF(nombres);
				dataOS.writeInt(edad[i]);
				i = i +1;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
