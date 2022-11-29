package demot;

import java.util.Arrays;
import java.util.Random;

public class demo4 {

	/**
	 * kaksi luentomateriaalista löytyvää lajittelualgoritmia
	 * @param args
	 */
	public static void main(String[] args) {
		int[] t1 = new int[10];
		int[] t2 = new int[10];
		int[] t3 = new int[10];
		int[] t4 = new int[10];
		
		Random rand = new Random();
		
		for (int i = 0; i < t1.length; i++) {
			t1[i] = rand.nextInt(1000);
			t2[i] = rand.nextInt();
			t3[i] = rand.nextInt(1000);
			t4[i] = rand.nextInt();
		}

		kuplaLajittelu(t1);
		kuplaLajittelu(t2);
		valintaLajittelu(t3);
		valintaLajittelu(t4);
	}
	
	public static void kuplaLajittelu(int[] t) {
		System.out.print("Taulukko ennen: ");
		System.out.print( Arrays.toString( t ));
		
		for (int i = 0; i < t.length - 1; i++) {
			for (int j = t.length -2; j > i - 1; j-- ) {
				if (t[j] > t[j+1]) {
					int apu = t[j];
					t[j] = t[j+1];
					t[j+1] = apu;
				}
			}
		}
		
		System.out.print(" ja kuplalajittelun jälkeen: ");
		System.out.println( Arrays.toString( t ));
	}
	
	public static void valintaLajittelu(int[] t) {
		System.out.print("Taulukko ennen: ");
		System.out.print( Arrays.toString( t ));
		
		for (int i = 0; i < t.length -2; i++) {
			int p = t[i];
			int k = i;
			for (int j = i + 1; j < t.length - 1; j++) {
				if (t[j] < p) {
					p = t[j];
					k = j;
				}
			}
			if (k != i) {
				t[k] = t[i];
				t[i] = p;
			}
		}
		
		System.out.print(" ja valintalajittelun jälkeen: ");
		System.out.println( Arrays.toString( t ));
	}
}
