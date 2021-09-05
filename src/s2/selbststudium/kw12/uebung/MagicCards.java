package s2.selbststudium.kw12.uebung;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicCards
{


	static ArrayList<ArrayList<Integer>> cards = new ArrayList<ArrayList<Integer>>();

	public static void generateCards()
	{

		ArrayList<Integer> card1 = new ArrayList<>();
		ArrayList<Integer> card2 = new ArrayList<>();
		ArrayList<Integer> card4 = new ArrayList<>();
		ArrayList<Integer> card8 = new ArrayList<>();
		ArrayList<Integer> card16 = new ArrayList<>();
		ArrayList<Integer> card32 = new ArrayList<>();
		ArrayList<Integer> card64 = new ArrayList<>();

		cards.add(card1);
		cards.add(card2);
		cards.add(card4);
		cards.add(card8);
		cards.add(card16);
		cards.add(card32);
		cards.add(card64);

		BigInteger testfor;

		for (int i = 1; i <= 100; i++) {

			testfor = new BigInteger(String.valueOf(i));

			if(testfor.testBit(0)) {
				card1.add(testfor.intValue());
			}
			if(testfor.testBit(1)) {
				card2.add(testfor.intValue());
			}
			if(testfor.testBit(2)) {
				card4.add(testfor.intValue());
			}
			if(testfor.testBit(3)) {
				card8.add(testfor.intValue());
			}
			if(testfor.testBit(4)) {
				card16.add(testfor.intValue());
			}
			if(testfor.testBit(5)) {
				card32.add(testfor.intValue());
			}
			if(testfor.testBit(6)) {
				card64.add(testfor.intValue());
			}


		}

	}
	
	public static void play()
	{
		Scanner s = new Scanner(System.in);
		int sum = 0;


		for(ArrayList<Integer> card : cards){

			for(int number : card){
				System.out.print(number + ",");

			}
			System.out.println();
			System.out.println("Ist Ihre Zahl enthalten?(y/n)");
			if(s.next().equals("y")) {
				sum += card.get(0);
			}


		}

		System.out.println();
		System.out.println("Ihre Zahl ist: " + sum);

		
		
	}

	
	public static void main(String[] args)
	{
		generateCards();
		play();

	}

}

