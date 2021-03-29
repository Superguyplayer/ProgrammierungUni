package selbststudium.kw12.vorlesung.Aufgabe_21;

public class Konto
{
	private int id;
	private double saldo;
	private Kunde kunde;
	
	public Konto()
	{
		
	}
	
	public Konto(int id, double saldo)
	{
		this.id = id;
		this.saldo  = saldo;
	}
	
	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;};
	public double getSaldo() {return this.saldo;}
	public void setSaldo(double saldo) {this.saldo = saldo;}
	public Kunde getKunde() {return this.kunde;}
	public void setKunde(Kunde k) {this.kunde = k;}
	
	public void add(double betrag)
	{
		saldo += betrag;
	}
	
	public Konto clone() {
		Konto dummy = new Konto(this.id, this.saldo);
		dummy.setKunde(new Kunde(getKunde()));
		return dummy;
	}

}
