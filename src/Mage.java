
public class Mage  extends Personnage {
	private int mana;
	
	//on reprend les attribut de la classe la plus complete de personnage, et on met super.attribut
	public Mage (String ps) {
		super(ps);
	    super.initiative = super.niveau * 6 +4;
	    super.pointdevie = super.niveau *5 +10;
	    this.mana = super.niveau *5;
	}
	
	public Mage(String ps, int niv, int m) {
		//equivalent a new Personnage(ps,niv)
		super(ps,niv);
		super.initiative = super.niveau + 3;
		super.pointdevie = super.niveau *5 + 10;
		this.mana = m;
	}
	

}
