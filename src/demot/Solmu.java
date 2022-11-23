package demot;

import java.util.ArrayList;
import java.util.List;

public class Solmu {

	private int key;
	private Solmu vanhempi;
	private Solmu vasen;
	private Solmu oikea;
	
	public Solmu(int key) {
		this.key = key;
	}
	
	public static void main(String[] args) {
		int montako = 15;
		List<Solmu> solmut = new ArrayList<Solmu>();
		for (int i = 0; i < montako; i++) {
			Solmu solmu = new Solmu(i);
			if (onkoSolmua(solmu, solmut)) continue;
			solmut.add(mihin(solmut, solmu), solmu);
		}
		Solmu keski = etsiKeski(solmut);
		keski.vanhempi = null;
		keski.luoPuu(solmut);
	}
	
	public void luoPuu(List<Solmu> solmut) { luoPuu(solmut, solmut.size()/2); }
	
	public void luoPuu(List<Solmu> solmut, int mika) {
		int monesko = 1;
		for (int i = 0; i < mika; i++) monesko *= 2;
		monesko = solmut.size()/monesko;
		this.vasen = solmut.get(monesko);
		this.vasen.vanhempi = this;
		if (!(solmut.get(monesko) == solmut.get(0)))
			this.vasen.luoPuu(solmut, ++mika);
		int ala = 0;
		int yla = 0;
		for (int i = 0; i < solmut.size(); i++) {
			if (this.key == solmut.get(i).key) ala = i;
			if (this.vanhempi.key == solmut.get(i).key) yla = i;
		}
		this.oikea = solmut.get((yla-ala)/2 + ala);
		this.oikea.vanhempi = this;
		this.oikea.luoPuu(solmut, mika);
		
	}
	
	public static Solmu etsiKeski(List<Solmu> solmut) {
		return solmut.get(solmut.size()/2);
	}
	
	public static boolean onkoSolmua(Solmu solmu, List<Solmu> solmut) {
		for (int i = 0; i < solmut.size(); i++) {
			if (solmut.get(i).key == solmu.key) return true;
		}
		return false;
	}
	
	public static int mihin(List<Solmu> solmut, Solmu solmu) {
		for (int i = 0; i < solmut.size(); i++) {
			if (solmut.get(i).key > solmu.key) return i;
		}
		return solmut.size();
	}
}
