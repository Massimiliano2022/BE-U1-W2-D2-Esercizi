package esercizio1.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		int i = 0;

		HashSet<String> listaParole = new HashSet<String>();

		List<String> paroleDuplicate = new ArrayList<String>();

		int numeroElementi;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Quante parole intendi aggiungere?");

			numeroElementi = scanner.nextInt();

		} while (numeroElementi <= 0);

		inserisciParole(numeroElementi, scanner, i, listaParole, paroleDuplicate);

		stampoParoleDuplicate(paroleDuplicate);

		stampoNumeroParole(listaParole);

		stampoListaParole(listaParole);
	}

	private static void inserisciParole(int numeroElementi, Scanner scanner, int i, HashSet<String> listaParole,
			List<String> paroleDuplicate) {

		scanner.nextLine();

		while (i < numeroElementi) {

			String parola = null;

			System.out.printf("Inserisci il %d elemento:", i + 1);

			parola = scanner.nextLine();

			if (parola != "") {
				if (listaParole.contains(parola)) {
					paroleDuplicate.add(parola);
				} else {
					listaParole.add(parola);
				}
				i++;
			}

		}
		scanner.close();
	}

	private static void stampoParoleDuplicate(List<String> paroleDuplicate) {

		if (paroleDuplicate.size() > 0) {
			System.out.println("Parole duplicate :");
			for (String parola : paroleDuplicate) {
				System.out.println(parola);
			}
		}
	}

	private static void stampoNumeroParole(HashSet<String> listaParole) {

		System.out.printf("Hai inserito %d parole.\n", listaParole.size());

	}

	private static void stampoListaParole(HashSet<String> listaParole) {

		System.out.println("Stampo tutte le parole inserite:");

		for (String parola : listaParole) {
			System.out.println(parola);
		}

	}

}
