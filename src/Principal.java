
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnage sulyvan = new Personnage("sulyvan");
		Personnage monPerso = new Personnage("toto");
		Personnage godSlayer = new Personnage("Marcel", 435);
		
		String msg = godSlayer.toString();
		System.out.println(msg);
		int d = monPerso.degats();
		System.out.println(msg + " il fait "+ d + " points de dégats");
		monPerso.combat(godSlayer);
		if (monPerso.pointdevie <=0){ 
		System.out.println("toto est mort");
		} else{
		System.out.println("Marcel est mort");
		}
	
	}

}
