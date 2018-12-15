/*
 * exercicio2.java
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
 * Ahora escribe un programa que permita visualizar los datos grabados anteriormente en el fichero FicheroDatos.dat. Se deben obtener en el mismo orden en el que se escribieron, es decir, primero obtenemos el nombre y luego la edad
 * 
 * Fet per Eric Visier Sánchez
 * 
 */

package FicherosBinarios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class exercicio2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream filein= new FileInputStream ("/home/cf17eric.visier/Escriptori/FicheroDatos.dat");
		DataInputStream dataIS = new DataInputStream (filein);


		try {
			while (true) {
				System.out.println("Nombre: " + dataIS.readUTF() + " Edat: " + dataIS.readInt());
			}
		} catch(EOFException e) {
			System.out.println("END OF FILE");

		} finally {
			filein.close();
		}


	}
}

