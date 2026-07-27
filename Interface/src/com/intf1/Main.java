package com.intf1;

class Employe {
	int id = 10;

	@Override
	public boolean equals(Object obj) {
		Employe e = (Employe) obj;
		return id == e.id;
	}
}

public class Main {

	public static void main(String[] args) {
		Employe e = new Employe();
		System.out.println(e.equals(("Java")));
	}

}
