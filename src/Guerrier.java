
public class Guerrier extends Personnage {

	public Guerrier(String ps, int niv, int intiatiative) {
		super(ps, niv);
		super.pointdevie = super.niveau *8 + 4;
		super.initiative = super.niveau * 4 + 6;
		// TODO Auto-generated constructor stub
	}

	
}
