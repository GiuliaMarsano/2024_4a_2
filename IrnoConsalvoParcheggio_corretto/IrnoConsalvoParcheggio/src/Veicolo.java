/**
 * 
 * @author 4a
 *
 */
public class Veicolo {
	protected String targa;
	protected String marca;
	protected boolean disabile;
	protected float costovig;

	/**
	 * 
	 * @param t
	 * @param m
	 * @param dis
	 * @param cost
	 */
	public Veicolo(String t, String m, boolean dis, float cost) {
		targa = t;
		marca = m;
		disabile = dis;
		costovig = cost;
	}

	/**
	 * 
	 * @param mr
	 */
	public void setMarca(String mr) {
		marca = mr;

	}

	/**
	 * 
	 * @return
	 */
	public float getCostoG() {
		return getCostoG();

	}

	/**
	 * 
	 */
	public String toString() {
		String s;
		s = "Targa: " + targa + "\n";
		s += "Marca: " + marca + "\n";
		s += "Disabile: ";
		if (disabile)
			s += "Sì\n";
		else
			s += "No\n";
		s += "Spese vigilanza a veicolo: " + costovig + "\n";
		return s;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Veicolo v=new Veicolo("AX054FR","Fiat",false,3);
		// System.out.println(v);
		Moto m = new Moto("AY0231AB", "KTM", false, 0, 0);
		System.out.println("cc " +m.getCostoG());

	}

}
