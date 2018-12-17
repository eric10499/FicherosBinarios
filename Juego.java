package TresenRalla;

import java.io.IOException;

import java.util.Scanner;

public class Juego   {

	public static void main(String[] args) {
		char [][] tablero = new char[3][3];

		Scanner scanner = new Scanner(System.in);
		EstadoPartida partidaNueva = new EstadoPartida(tablero);
		partidaNueva.juegoTres(partidaNueva.getTablero());
		try {
			GuardaryRecuperarEstado.guardarEstado(partidaNueva);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Desea recuperar la partida ? Y / N");
		String respuesta = scanner.next();
		if(respuesta.equals("Y")) {
			try {
				EstadoPartida joc = GuardaryRecuperarEstado.recuperarEstado();
				char [][] nuevoTablero = joc.getTablero();
				joc.juegoTres(nuevoTablero);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
