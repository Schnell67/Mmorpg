public class Personnage {
	private String pseudo;
	private int niveau;
	private int pointdevie;
	private int initiative;
	
	public Personnage(String ps) {
		this.pseudo = ps;
		this.niveau = 1;
		this.initiative = 1;
	}
	public Personnage(String ps, int niv) {
		this.pseudo = ps;
		this.niveau = niv;
		this.pointdevie = niv;
		this.initiative = niv;
	}
	public void attaque (Personnage opposant){
		if (this.initiative > opposant.initiative){
		      // this tape le premier
		     opposant.pointdevie = opposant.pointdevie - this.niveau;
		     if (opposant.pointdevie > 0) {
		           this.pointdevie = this.pointdevie - opposant.niveau;
		      }
		} else {
		        if(opposant.initiative > this.initiative ){
		        // opposant tape le premier
		          this.pointdevie = this.pointdevie - opposant.niveau;
		          if (this.pointdevie > 0){
		             opposant.pointdevie = opposant.pointdevie - this.niveau;
		          }  
		     }   else {
		        // les deux tapent en m�me temps
		            opposant.pointdevie = opposant.pointdevie - this.niveau;
		             this.pointdevie = this.pointdevie - opposant.niveau;
		        }
		}
		///////////////////////////////////////////////////////////////////////////
	}
	public void combat(Personnage opposant) {
		while (this.pointdevie > 0 && opposant.pointdevie <= 0 ) {
			this.attaque(opposant);
		}
	}
	public void soigner() {
		this.pointdevie = this.niveau;
	}
}