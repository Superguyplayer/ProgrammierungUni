package vorlesung.v4;

public class PointsAndDoors {
	
	public static void main (String[] args)
	{
		/*
		 * Erzeugung zweier Point-Objekte und Nutzung verschiedener Attribute und Methoden
		 */
		java.awt.Point player = new java.awt.Point();
		player.x = player.y = 10;
		
		java.awt.Point door = new java.awt.Point();
		door.setLocation(10,  100);
		
		System.out.println("Abstand von Tür zum Spieler ist " + player.distance(door));
		
		/*
		 * JEDES Objekt kennt die Methode toString()
		 */
		System.out.println("Das player-Objekt ergibt bei der Konvertierung zu einem String: " + player.toString());
		
		/*
		 * Der Punkt-Operator kann mehrfach hintereinander "geschachtelt" werden
		 * Beispiel: Ein Objekt der Klasse String kann die Methode length() nutzen
		 */
		// lange Fassung
		String s = player.toString();
		System.out.println("Ausgabe der Länge der Zeichenkette des player-Objekts: " + s.length());
		
		// Kurzfassung
		System.out.println("Ausgabe der Länge der Zeichenkette des player-Objekts: " + player.toString().length());
		
		/*
		 * Wird ein Objekt nur kurzzeitig für eine Ausgabe o.ä. benötigt kann die Referenzvariable auch weggelassen werden
		 */
		System.out.println("Ein neuer Punkt mit der Länge: " + new java.awt.Point().toString().length());
		
		/*
		 * Ob zwei Point-Objekte gleich sind, kann man NICHT mit dem == Operator testen! (Warum nicht?)
		 * Test auf Gleichheit erfolgt mit der Methode equals
		 */
		System.out.println("Sind die beiden Punkte gleich: " + player.equals(door));
		
	}

}
