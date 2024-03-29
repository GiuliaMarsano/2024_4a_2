/**
 * versione 3 online
 * @author 4a
 *
 */
public class Auto extends Veicolo {
private String tipo;
private final int tariffaG=10;

	/**
	 * 
	 * @param t
	 * @param m
	 * @param dis
	 * @param cost
	 * @param tip
	 */
	public Auto(String t, String m, boolean dis, float cost, String tip) {
		super(t, m, dis, cost);
		tipo=tip;
		// esempio
		
	}
	
	/**
	 * 
	 */
	public float getCostoG() {
		return tariffaG-costovig;
	}
	
	/**
	 * 
	 */
	public String toString() {
		String s="VEICOLO: AUTO\n";
		s+=super.toString();
		s+="Tipo auto: "+tipo+"\n";
		s+="Tariffa giornarliera: "+tariffaG+"€\n";
		return s;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Auto a=new Auto("FA903AZ","Nissan",true,45,"Utilitaria");
		System.out.println(a);
	}

}
