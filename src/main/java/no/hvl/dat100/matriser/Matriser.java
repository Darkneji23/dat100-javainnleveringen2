package no.hvl.dat100.matriser;

public class Matriser {

	// a) Skriver ut matrisen med to utvidede for-løkker
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
			for (int tall : rad) {
				System.out.print(tall + " ");
			}
			System.out.println();
		}
	}

	// b) Lager tekst med mellomrom etter hvert tall og linjeskift etter hver rad
	public static String tilStreng(int[][] matrise) {
		String tekst = "";

		for (int[] rad : matrise) {
			for (int tall : rad) {
				tekst += tall + " ";
			}
			tekst += "\n";
		}

		return tekst;
	}
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
