package BelangrijkeAantekeningen;

public class InterfaceMethoden {

	public static void main(String[] args) {
		metDefault d = new Default();
		d.defaulteren();
//			Default.defaulteren();   // Kan niet
		metStatic s = new Statisch();
//			s.statischMaken();   // Kan niet
		Statisch.statischMaken(); // Kan niet
		metStatic.statischMaken();
	}
}

interface metAbstract { // impliciet, zonder abstract in de method erbij te plaatsen.
	/* abstract */ void abstraheren(); // dwingt implementatie af in de class
}
// kan geen body hebben
// let op de public
// raakt beschikbaar voor het object NIET voor de interface/klasse

interface metDefault { // expliciet
	default void defaulteren() { // implementatie wordt optioneel in de class
	}
}
// heeft wel een body VERPLICHT
// let op de public
// raakt beschikbaar voor het object NIET voor de interface/klasse

interface metStatic { // expliciet
	static void statischMaken() {
	}
}
// raakt beschikbaar voor de interface NIET VOOR het object
// heeft wel een body VERPLICHT
// overriden is uberhaupt niet ter sprake

class Abstract implements metAbstract {
	public void abstraheren() { // moet public
		
	}
}

class Default implements metDefault {
	 							// moet public
}
class Statisch implements metStatic {
	static void statischMaken() { //overriden is uberhaupt niet ter sprake

	}
}
