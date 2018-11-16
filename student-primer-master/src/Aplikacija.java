import student.Student;

public class Aplikacija {

	public static void main(String[] args) {
		// Instanciranje studenta uz pomoc defaul construktora
		Student tanja = new Student();
//		System.out.println("Ime: " + tanja.imePrezime); - nije preporucljivo ovako pristupati atributima iz klase
//Dodavanje vrednosti preko setera u instanciran prazan objekat!
		System.out.println("Student: " + tanja.getImePrezime() + ", " + tanja.getBrojIndexa());
		tanja.setImePrezime("Tanja");
		tanja.setBrojIndexa("1/2018");
		System.out.println("Student: " + tanja.getImePrezime() + ", " + tanja.getBrojIndexa());

// Instanciranje objekta pomocu konstruktora sa prosledjenim vrednostima
		Student aleksandar = new Student("Aleksandar", "2/2018");
		System.out.println("Student: " + aleksandar.getImePrezime() + ", " + aleksandar.getBrojIndexa());
//Instanciranje samo sa delimicnim atributima
		Student milan = new Student("Milan");
		System.out.println("Student: " + milan.getImePrezime() + ", " + milan.getBrojIndexa());
		milan.setBrojIndexa("3/2018");
		System.out.println("Student: " + milan.getImePrezime() + ", " + milan.getBrojIndexa());

	}

}
