package demot;

import java.util.Random;

/**
 * Tehtävä:
 * 		Kirjoita ohjelma, jolla voidaan laskea, kuinka moni kokonaislukutaulukon alkioista on jaollinen annetulla luvulla m.
 * 		Muodosta taulukko, joka sisältää satunnaisia kokonaislukuja, ja laske kuinka moni sen luvuista on jaollinen luvuilla m=2, m=3 ja m=5.
 * @author Topias
 * @version 1.0 9.11.2022
 */
public class demo1 {
	
	/**
	 * lasketaan moniko taulukon luvuista on jaollisia annetulla luvulla
	 * @param t tutkittava taulukko
	 * @param etsittava jakava numero
	 * @return montako jakavaa löytyy
	 * @example
     * <pre name="test">
     * int[] t = new int[]{1, 2, 3, 4, 5};
     * montakoEsiintymaa(t, 1) === 5;
     * montakoEsiintymaa(t, 2) === 2;
     * montakoEsiintymaa(t, 3) === 1;
     * montakoEsiintymaa(t, 0) === -1;
     * int[] t1 = new int[0];
     * montakoEsiintymaa(t1, 3) === -1;
     * 
     * </pre>
	 */
	public static int montakoEsiintymaa(int[] t, int etsittava) {
		if (etsittava == 0) return -1;
		if (t.length == 0) return -1;
		int montako = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] % etsittava == 0) {
				montako++;
				// System.out.println(t[i] + " on jaollinen luvulla: " + etsittava);
			}
		}
		return montako;
	}
	
	public static void main(String[] args) {
		int montako = 1000;
		int[] taulukko = new int[montako];
		Random rand = new Random();
		
		for (int i = 0; i < montako; i++ ) {
			taulukko[i] = rand.nextInt(1000);
		}
		
		int kaksi = montakoEsiintymaa(taulukko, 2);
		int kolme = montakoEsiintymaa(taulukko, 3);
		int viisi = montakoEsiintymaa(taulukko, 5);
		
		System.out.println("Kahdella jaollisia oli: " + kaksi + "\nKolmella jaollisia oli: " + kolme + "\nViidellä jaollisia oli: " + viisi);
	}

}
