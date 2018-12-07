package FicherosBinarios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class ejercicio2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i;

		FileInputStream filein= new FileInputStream ("/home/cf17eric.visier/Escriptori/FicheroDatos.dat");
		DataInputStream dataIS = new DataInputStream (filein);


			try {
				while (true) {
					System.out.println("Nombre: " + dataIS.readUTF() + " Edat: " + dataIS.readInt());
				}
			} catch(EOFException e) {
				System.out.println("END OF FILE");

			}


		}
	}
