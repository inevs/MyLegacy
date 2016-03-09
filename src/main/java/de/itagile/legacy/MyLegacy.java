package de.itagile.legacy;

import java.util.Vector;

public class MyLegacy {

	public MyLegacy() {
		Lupe.getInstance().setScale(2);
	}

	public double run() {
		double flaeche = 0;
		Rechteck re1 = new Rechteck(3, 4);
		Figur re2 = new Rechteck(5, 6);
		Kreis kr1 = new Kreis(7);
		Figur kr2 = new Kreis(8);
		Vector<Figur> vec = new Vector<Figur>();
		vec.add(re1);
		vec.add(re2);
		vec.add(kr1);
		vec.add(kr2);
		for (int i = 0; i < vec.size(); i++) {
			Figur f = (vec.get(i));
			if (f instanceof Kreis)
				System.out.println("Kreis: Radius " + ((Kreis) f).getRadius());
			if (f instanceof Rechteck)
				System.out.println("Rechteck: Seiten a und b:"
						+ ((Rechteck) f).getHoehe() + " "
						+ ((Rechteck) f).getBreite());
			flaeche += f.getFlaeche();
		}
		System.out.println("Gesamtflaeche ist: " + flaeche * 2);
		return flaeche * Lupe.getInstance().scale();
	}

	abstract class Figur {
		abstract double getFlaeche();
	}

	class Rechteck extends Figur {
		private double a, b;

		public Rechteck(double a, double b) {
			this.a = a;
			this.b = b;
		}

		public double getBreite() {
			return b;
		}

		public double getHoehe() {
			return a;
		}

		@Override
		public double getFlaeche() {
			return a * b;
		}
	}

	class Kreis extends Figur {
		private double r;

		public Kreis(double r) {
			this.r = r;
		}

		@Override
		public double getFlaeche() {
			return Math.PI * r * r;
		}

		public double getRadius() {
			return r;
		}
	}
}
