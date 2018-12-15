/*
 * ejercicio1.java
 * 
 * Copyright 2018 ERIC <ERIC@DESKTOP-5T1N085>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * Escribe un programa que inserte datos en “FicherosDatos.dat”. Los datos los tomará de dos arrays definidos en el propio programa. Uno contendrá los nombres de una serie de personas y el otro sus edades. Se irá recorriendo los arrays e iremos escribiendo en el fichero el nombre (mediante el método writeUTF(String str) y la edad (writeInt (int v)). NOTA: si queremos añadir bytes al final del fichero (FicheroDatos.dat) se puede usar el siguiente constructor: FileOutputStream fileout = new FileOutputStream (fichero, true)
 * 
 * Fet per Eric Visier Sánchez
 * 
 */

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
