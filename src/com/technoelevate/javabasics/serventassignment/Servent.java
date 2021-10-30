package com.technoelevate.javabasics.serventassignment;

import java.util.Scanner;

public class Servent {
	public void stuff(Scanner sc) {
		System.out.println("they give this much ammount ");
	int j=sc.nextInt();
		
		System.out.println("servent buy this much of ammount Stuff");
		int stuff=sc.nextInt();
		int result;
		result=j-stuff;
		System.out.println("Servent give "+result+"this amount to owner");
		

		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("owner has this much of ammount");
		int i=sc.nextInt();
		Servent s=new Servent();
		s.stuff(sc);
	}

}
