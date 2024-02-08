/**
 * 
 * @author 4a
 *
 */
public class Moto extends Veicolo {

	private int nruote;
	private final int tariffaG=5;
	
	/**
	 * 
	 * @param t
	 * @param m
	 * @param dis
	 * @param cost
	 * @param nr
	 */
	public Moto(String t, String m, boolean dis, float cost, int nr) {
		super(t, m, dis, cost);
		nruote=nr;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int getNRuote() {
		return nruote;
		
	}
	
	/**
	 * 
	 */
	public float getCostoG() {
		return tariffaG-costovig;/////////
		
	}
	
	/**
	 * 
	 */
	public String toString() {
		String s="VEICOLO: MOTO\n";
		s+=super.toString();
		s+="Numero ruote: "+nruote+"\n";
		s+="Tariffa giornaliera: "+tariffaG+"€\n";
		s+="guadagno: "+getCostoG()+"\n";
		return s;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Moto m=new Moto("AY0231AB","KTM",false,2,2);
		System.out.println(m);
		System.out.println(m.costovig);
	}

}
