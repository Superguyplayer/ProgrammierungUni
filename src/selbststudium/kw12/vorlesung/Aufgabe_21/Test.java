package selbststudium.kw12.vorlesung.Aufgabe_21;

public class Test
{

	public static void main(String[] args)
	{

		Konto k1 = new Konto(5, 5000);
		k1.setKunde(new Kunde("Meier", "Teststraße"));

		Konto k2 = k1.clone();

		System.out.println(k1.getKunde().getAdresse());
		System.out.println(k2.getKunde().getAdresse());

		System.out.println();

		k2.getKunde().setAdresse("Bla");

		System.out.println(k1.getKunde().getAdresse());
		System.out.println(k2.getKunde().getAdresse());


	}

}
