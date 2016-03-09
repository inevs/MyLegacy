package de.itagile.legacy;

import java.util.Random;

public class CryptTool {

	private static int scale;
	private static Integer cryptoNumber;

	public static void init() {
		cryptoNumber = new Random().nextInt();
	}

	public static void cryptScale(int scale) {
		sleep();
		CryptTool.scale = scale + cryptoNumber;
	}

	public static int decryptScale() {
		sleep();
		return CryptTool.scale - cryptoNumber;
	}

	private static void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
