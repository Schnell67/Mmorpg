public class Guerrier extends Personnage {
    String  monture;
    public Guerrier (String ps) {
        // appel au constructeur associ� de Personnage. Cela doit toujours �tre en premi�re ligne
        super(ps);
        // modification des attributs h�rit� de Personnage
        super.pointdevie = super.niveau * 8 + 4;
        super.initiative = super.niveau * 4 + 6;
        this.monture = "";
    }
    
    public Guerrier(String ps, int n, String m) {
        super(ps,n); // equivalent � new Personnage (ps, n);
        super.pointdevie = super.niveau * 8 + 4;
        super.initiative = super.niveau * 4 + 6;
        
        this.monture = m;
    }
    
    
    
}
