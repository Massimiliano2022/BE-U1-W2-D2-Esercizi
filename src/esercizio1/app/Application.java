package esercizio1.app;

import java.util.HashSet;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		int i = 0;

		HashSet<String> listaParole = new HashSet<String>();

		int numeroElementi;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Quante parole intendi aggiungere?");

			numeroElementi = scanner.nextInt();

		} while (numeroElementi <= 0);

		inserisciParole(numeroElementi, scanner, i, listaParole);

		stampoParoleDuplicate(listaParole);

		stampoNumeroParole(listaParole);

		stampoListaParole(listaParole);
	}

	private static void inserisciParole(int numeroElementi, Scanner scanner, int i, HashSet<String> listaParole) {

		while (i < numeroElementi) {

			String parola = null;

			System.out.printf("Inserisci il %d elemento:", i + 1);

			parola = scanner.nextLine();

			if (parola != "") {

				listaParole.add(parola);
				i++;
			}

		}
		scanner.close();
	}

	private static void stampoParoleDuplicate(HashSet<String> listaParole) {

		System.out.println("L'hashSet non permette l'inserimento di elementi uguali.");

	}

	private static void stampoNumeroParole(HashSet<String> listaParole) {

		System.out.printf("Hai inserito %d parole.\n", listaParole.size());

	}

	private static void stampoListaParole(HashSet<String> listaParole) {

		System.out.println("Stampo tutte le parole inserite:");

		for (String word : listaParole) {
			System.out.println(word);
		}

	}

}
