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

		if (matrise == null || matrise.length == 0){
			return new int[0][0];

		}

		int rader = matrise.length;
		int koloner = matrise[0].length;
		int[][] nyMatrise= new int[rader][koloner];

		for (int i = 0; i < rader ; i++){
			for (int j = 0; j < koloner; j++){
				nyMatrise[i][j]= nyMatrise[i][j] * tall;

			}
		}

		return nyMatrise;



	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a == b) return true;
		if (a == null || b = null) return false;
		if (a.length != b.length) return  false;

		for (int i = 0; i < a.length; i++){

			if (a[i].length != b[i].length) return false;

			for (int j = 0; j < a[i].legnth; j++){
				if (a[i][j] != b[i][j]){
					return false;

				}
			}
		}

		return true;

		
	}
	
	// e)S
	public static int[][] speile(int[][] matrise) {

    int n = matrise.length;
    int[][] nyMatrise = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            nyMatrise[i][j] = matrise[i][j];
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int temp = nyMatrise[i][j];
            nyMatrise[i][j] = nyMatrise[j][i];
            nyMatrise[j][i] = temp;
        }
    }

    return nyMatrise;
}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int raderA = a.length;
		int kolonnerA = a[0].length;
		int kolonnerB = b[0].length;
		int[][] resultat = new int[raderA][kolonnerB];
		for (int i = 0; i < raderA; i++) {
			for (int j = 0; j < kolonnerB; j++) {
				resultat[i][j] = 0;
				for (int k = 0; k < kolonnerA; k++) {
					resultat[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return resultat;
	}
}