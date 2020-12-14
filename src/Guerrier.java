public class Guerrier extends Personnage {
    String  monture;
    public Guerrier (String ps) {
        // appel au constructeur associé de Personnage. Cela doit toujours être en première ligne
        super(ps);
        // modification des attributs hérité de Personnage
        super.pointdevie = super.niveau * 8 + 4;
        super.initiative = super.niveau * 4 + 6;
        this.monture = "";
    }
    
    public Guerrier(String ps, int n, String m) {
        super(ps,n); // equivalent à new Personnage (ps, n);
        super.pointdevie = super.niveau * 8 + 4;
        super.initiative = super.niveau * 4 + 6;
        
        this.monture = m;
    }
    
    
    
}
