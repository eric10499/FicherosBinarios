package TresenRalla;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class GuardaryRecuperarEstado {

    public static void guardarEstado( EstadoPartida partida) throws IOException {
        File fichero = new File ("C:\\\\Users\\\\ERIC\\\\Pictures\\\\partida.save");
        FileOutputStream fileout = new FileOutputStream (fichero);
        ObjectOutputStream dataOS = new ObjectOutputStream (fileout);
        //TODO CONSTRUCTOR CON VARIABLES A PASAR
        
        try {
			dataOS.writeObject (partida) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        dataOS.close();
    }
    
    public static EstadoPartida recuperarEstado() throws IOException, ClassNotFoundException {
    	File fichero = new File ("C:\\\\Users\\\\ERIC\\\\Pictures\\\\partida.save");
    	FileInputStream filein = new FileInputStream (fichero);
    	ObjectInputStream dataIS = new ObjectInputStream (filein) ;
    	EstadoPartida partida = (EstadoPartida) dataIS.readObject();
		return partida;
    }
}
