package polluxPak;

public class Etat {
	private String nom;
	private int num;
	public static Etat P0=new Etat ("Etat Initial",1);
	public static Etat B1=new Etat ("Premier But Mis",2);
	public static Etat BUT=new Etat ("But Mis",3);
	public static Etat PALET_A=new Etat ("Scan reussi",4);
	public static Etat PALET0=new Etat ("Echec scan",5);
	public static Etat VERIFICATI0N=new Etat("verification",6);
	public static Etat SECOURS1=new Etat ("Methode de Secours1",7);
	public static Etat FINPARCOURS=new Etat ("Fin Secours1",8);
	public static Etat SECOURS2=new Etat ("Methode de Secours2",9);


	private Etat() {
		// TODO Auto-generated constructor stub
	}
	private Etat( String nom, int num) {
		this.nom=nom;
		this.num=num;
	}
	public int getNum() {
		return num;
	}
	public String toString() {
		return nom;
	}

}
