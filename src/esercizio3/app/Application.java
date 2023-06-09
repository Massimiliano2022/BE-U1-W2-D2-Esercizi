package esercizio3.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import esercizio3.app.entities.Persona;

public class Application {

	public static void main(String[] args) {

		Persona contatto1 = new Persona("Mario", "3334445550");
		Persona contatto2 = new Persona("Antonio", "3204451111");
		Persona contatto3 = new Persona("Giuseppe", "3456789900");
		Persona contatto4 = new Persona("Maria", "3512267891");
		Persona contatto5 = new Persona("Ludovica", "3902156789");

		List<Persona> listaPersone = new ArrayList<Persona>(
				Arrays.asList(contatto1, contatto2, contatto3, contatto4, contatto5));

		Map<String, String> rubrica = new HashMap<>();

		// aggiungiContatto(rubrica,contatto1);

		aggiungiContatti(rubrica, listaPersone);

		cancellaContatto(rubrica, contatto5.getNome());

		String nomeContattoCercato = ricercaContatto(rubrica, contatto2.getNumeroTelefono());

		System.out.println("La persona cercata è " + nomeContattoCercato);

		String numeroCercato = cercaNumeroContatto(rubrica, contatto4.getNome());

		System.out.println("Il numero cercato è " + numeroCercato);

		stampaContattiRubrica(rubrica);

	}

	/*
	 * private static void aggiungiContatto(Map<String, String> rubrica, Persona
	 * contatto1) {
	 * 
	 * rubrica.put(contatto1.getNome(), contatto1.getNumeroTelefono());
	 * 
	 * }
	 */

	private static void aggiungiContatti(Map<String, String> rubrica, List<Persona> listaPersone) {

		Iterator<Persona> i = listaPersone.iterator();
		while (i.hasNext()) {
			Persona contatto = i.next();
			rubrica.put(contatto.getNome(), contatto.getNumeroTelefono());
		}
	}

	private static void cancellaContatto(Map<String, String> rubrica, String nomeContatto) {
		if (rubrica.containsKey(nomeContatto)) {
			rubrica.remove(nomeContatto);
		}
	}

	private static String ricercaContatto(Map<String, String> rubrica, String numeroTelefono) {

		String nomeCercato = null;

		Iterator<Entry<String, String>> i = rubrica.entrySet().iterator();

		while (i.hasNext()) {

			Map.Entry<String, String> entry = i.next();

			if (numeroTelefono.equals(entry.getValue())) {
				nomeCercato = entry.getKey();
			}
		}
		return nomeCercato;
	}

	private static String cercaNumeroContatto(Map<String, String> rubrica, String nomeContatto) {

		String numeroCercato = null;

		Iterator<Entry<String, String>> i = rubrica.entrySet().iterator();

		while (i.hasNext()) {

			Map.Entry<String, String> entry = i.next();

			if (nomeContatto.equals(entry.getKey())) {

				numeroCercato = entry.getValue();
			}

		}

		return numeroCercato;
	}

	private static void stampaContattiRubrica(Map<String, String> rubrica) {

		/*
		 * for (String key : rubrica.keySet()) { System.out.println("Nome: " + key +
		 * " Telefono: " + rubrica.get(key)); }
		 */

		System.out.println(rubrica);

	}

}
