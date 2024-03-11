package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Quartos;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas pretendem alugar os quartos? ");
		int n = sc.nextInt();
		
		Quartos[] quartos = new Quartos[10];
		
		String nome;
		String email;
		int room;
		
		for(int c = 1; c <= n; c++) {
			System.out.println(" ");
			System.out.println("Cliente #"+c);
			System.out.print("Nome: ");
			nome = sc.nextLine();
			sc.next();
			System.out.print("Email: ");
			email = sc.nextLine();
			sc.next();
			System.out.print("Quarto: ");
			room = sc.nextInt();
			
			quartos[room] = new Quartos(nome, email);
			
			
			
		}
		
		System.out.println("");
		System.out.println("Quartos ocupados:");
		for(int i = 0; i < 10; i++) {
			if(quartos[i] != null) {
				System.out.println(i+": "+quartos[i]);
			}
			
			
			
		}
		sc.close();
	}

}
