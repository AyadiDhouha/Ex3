
public class Client implements Comparable {
	private String nom,adresse ; 
	private float credit; 
	
	public  Client(String n , String adr ) {
		this.nom=n ;
		this.adresse=adr ; 
	}
	
	public String toString() {
		return "je suis "+nom+" j'habite a "+adresse+" et j'ai "+credit ; 
	}
	
	
	public void augmenterCredit(float i) {
		credit+=i; 
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String n) {
		this.nom = n;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adr) {
		this.adresse = adr;
	}
	public float getCredit() {
		return credit;
	}
	public void setCredit(float c) {
		this.credit = c;
	}
	
	
	public int compareTo(Object o) {
		Client c =(Client)o; 
		if(getNom().hashCode()==c.getNom().hashCode()) {
			return 0 ;
		}
		else if(getNom().hashCode()>c.getNom().hashCode()) {
			return 1 ; 
		}
		
		return -1;	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	}
