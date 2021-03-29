package selbststudium.kw12.uebung;

public class MyList
{

	Element top;
	Element last;
	
	public MyList()
	{
		this.top = null;
		this.last = null;
	}
	
	public void add(String x)
	{
		Element e =  new Element(x);
		
		if (top == null)
		{
			top = e;
			last = e;
		} else {
			last.next=e;
			last = e;
		}
		
	}
	
	public void insertTop(String x)
	{
		/*
		 * Hier soll ein neues Element am Kopf
		 * der Liste eingefügt werden. Dabei berücksichtigen,
		 * dass der Kopf (top) auf das neue Element und das 
		 * neue Element auf den alten Kopf zeigen muss.
		 */

		Element e = new Element(x);

		if(this.top == null){
			this.top = e;
			this.last = e;
		}else{
			e.next = this.top;
			this.top = e;
		}


		
	}
	
	public void appendList(MyList l2)
	{
		/*
		 * Hier wird eine zweite Liste übergeben wobei 
		 * das letzte Element der aktuellen Liste
		 * auf den Kopf der übergebenen Liste zeigt, und 
		 * sich das letzte Element (last) ebenfalls ändert.
		 */

		this.last.next = l2.top;
		this.last = l2.last;

		
		
	}
	
	public void setData(String x, int index)
	{
		/*
		 * Das Element an der Stelle index (beginnend
		 * mit 0 für das erste Element) soll ein neues
		 * Datum erhalten.
		 * Falls das Ende der Liste vorzeitig erreicht wurde,
		 * wird die Ausführung mit einem return unterbrochen.
		 */
		Element e = this.top;

		for (int i = 0; i < index; i++) {
			if(e.next == null) {
				return;
			}
			e = e.next;
		}

		e.data = x;
		

	}
	
	
	
	
	public String toString()
	{
		if (top == null) 
			return "";
		
		String erg = "";
		Element cur = top;
		while (cur != null)
		{
			erg += cur.toString();
			cur = cur.next;
		}
		
		return erg;
	}
	
	
	public static void main(String[] args)
	{
		MyList l = new MyList();
		l.add("b");
		l.add("c");
		l.add("d");
		
		System.out.println(l); //Gibt "bcd" zurück
		
		l.insertTop("a");
		System.out.println(l); // Gibt "abcd" zurück
		
		
		MyList newlist = new MyList();
		newlist.add("1");
		newlist.add("2");
		newlist.add("3");
		
		l.appendList(newlist);
		System.out.println(l); // Gibt "abcd123" zurück
		
		
		l.setData("x", 1);
		System.out.println(l); // Gibt "axcd123" zurück
		
		l.setData("x", 2);
		System.out.println(l); // Gibt "axxd123" zurück
		
	}
	
}


class Element
{
	Element next;
	String data=null;
	
	public Element(String x)
	{
		this.data=x;
	}
	
	public String toString()
	{
		return (data!=null) ? data : "";
	}
	
}
