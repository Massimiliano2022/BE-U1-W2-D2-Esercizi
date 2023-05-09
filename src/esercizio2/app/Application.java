package esercizio2.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		int numeroElementi;
		boolean pari = false;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Quanti numeri casuali nel range da 0 a 100 intendi generare?");

			numeroElementi = scanner.nextInt();

		} while (numeroElementi <= 0);

		scanner.close();

		List<Integer> listaNumeriOrdinata = generaListaOrdinataNumeriCasuali(numeroElementi);

		generaListaReverse(listaNumeriOrdinata);

		stampaNumeriCasualiPariDispari(pari, listaNumeriOrdinata);

	}

	private static List<Integer> generaListaOrdinataNumeriCasuali(int numeroElementi) {

		List<Integer> listaNumeri = new ArrayList<Integer>();

		for (int i = 0; i < numeroElementi; i++) {

			Random random = new Random();

			int numeroCasuale = random.nextInt(101);

			listaNumeri.add(numeroCasuale);

		}
		Collections.sort(listaNumeri);

		System.out.println("Lista ordinata crescente numeri casuali: " + listaNumeri);

		return listaNumeri;
	}

	private static void generaListaReverse(List<Integer> listaNumeriOrdinata) {

		List<Integer> listaReversed = listaNumeriOrdinata;

		Collections.reverse(listaReversed);

		System.out.println("Lista ordinata decrescente numeri casuali: " + listaReversed);

	}

	private static void stampaNumeriCasualiPariDispari(boolean pari, List<Integer> listaNumeriOrdinata) {

		if (pari) {
			for (Integer numero : listaNumeriOrdinata) {
				if (numero % 2 == 0) {
					System.out.println(numero);
				}
			}
		} else {
			for (Integer numero : listaNumeriOrdinata) {
				if (numero % 2 != 0) {
					System.out.println(numero);
				}
			}
		}
	}
}
