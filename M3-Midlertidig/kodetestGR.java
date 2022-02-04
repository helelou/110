public class GruppeRom{
	private Person booketAv = null;
	private String romnavn = "";
	
	public GruppeRom(String gruppeRomNavn){
		romnavn = gruppeRomNavn;
	}
	
	public boolean BookRom(Person personSomVilBooke){
		if(booketAv == null){
			booketAv = personSomVilBooke;
			return true;
		}
		else{
			return false;
		}
	}
	
	public void PrintRomstatus(){
		System.out.println("Romnavn: " + romnavn);
		if(booketAv == null){
			System.out.println("Rommet er ledig.");
		}
		else{
			System.out.println("Rommet er booket av: " + booketAv.getNavn());
		}
	}	
	
	public static void main(String args[]){
		GruppeRom EtRom = new GruppeRom("Grupperom 42");
		
		Person EnPerson = new Person("Frank");
		
		if(EtRom.BookRom(EnPerson)){
			EtRom.PrintRomstatus();
		}
		else{
			System.out.println("Rommet er opptatt.");
		}
	}
}

public class Person{
	private String navn;
	
	public Person(String personnavn){
		navn = personnavn;
	}
	
	public String getNavn(){
		return navn;
	}
}
