package com.javaDay8;

public class CricketEg {

	static int score;
	public void incre(int x) {
		score+= x;

	}
	public static void main(String[] args) {
		CricketEg ob = new CricketEg();
		CricketEg cb = new CricketEg();
		CricketEg sb = new CricketEg();
		

		ob.incre(14);
		cb.incre(7);
		sb.incre(19);
		
		System.out.println(CricketEg.score);	

	}
}
