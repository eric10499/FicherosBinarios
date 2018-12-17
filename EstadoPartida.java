package TresenRalla;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;


public class EstadoPartida {
	char [][] tablero;
	
	
	public EstadoPartida(char[][] tableroTresEnRaya) {
		this.tablero = tableroTresEnRaya;
	}
	


	public char[][] getTablero() {
		return tablero;
	}



	public void setTablero(char[][] tablero) {
		this.tablero = tablero;
	}



	public void juegoTres(char[][] tableroTresEnRaya) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char ficha1;
		char ficha2;
		ficha1 = 'x';
		ficha2 = 'o';

	
		while(true) {
			System.out.println("Turno Jugador 1: ");
			System.out.println("Fila: ");
			int fila1 = scanner.nextInt();
			System.out.println("columna: ");
			int columna1 = scanner.nextInt();

			if (tableroTresEnRaya[fila1][columna1]== ficha1 || tableroTresEnRaya[fila1][columna1]== ficha2){
				System.out.println("Esta posición ya esta ocupada, pierdes tu turno");
			}else {
				tableroTresEnRaya[fila1][columna1]= 'x';
			}

			
			

			System.out.println(tableroTresEnRaya[0][0] + " | " + tableroTresEnRaya[0][1] + " | " + tableroTresEnRaya[0][2] + "\n---------");
			System.out.println(tableroTresEnRaya[1][0] + " | " + tableroTresEnRaya[1][1] + " | " + tableroTresEnRaya[1][2] + "\n---------");
			System.out.println(tableroTresEnRaya[2][0] + " | " + tableroTresEnRaya[2][1] + " | " + tableroTresEnRaya[2][2] + "\n");

			System.out.println("Turno Jugador 2: ");
			System.out.println("Fila: ");
			int fila2 = scanner.nextInt();
			System.out.println("columna: ");
			int columna2 = scanner.nextInt();

			if (tableroTresEnRaya[fila2][columna2]== ficha2 || tableroTresEnRaya[fila2][columna2]== ficha1){
				System.out.println("Esta posición ya esta ocupada, pierdes tu turno");
			}else {
				tableroTresEnRaya[fila2][columna2]= 'o';
			}

			System.out.println(tableroTresEnRaya[0][0] + " | " + tableroTresEnRaya[0][1] + " | " + tableroTresEnRaya[0][2] + "\n---------");
			System.out.println(tableroTresEnRaya[1][0] + " | " + tableroTresEnRaya[1][1] + " | " + tableroTresEnRaya[1][2] + "\n---------");
			System.out.println(tableroTresEnRaya[2][0] + " | " + tableroTresEnRaya[2][1] + " | " + tableroTresEnRaya[2][2] + "\n");
			

			System.out.println("Desea guardar la partida? Y / N");
			String respuesta = scanner.next();
			if(respuesta.equals("Y")) {
				break;
			}
		}
	}	
}
