package de.itagile.legacy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyLegacyTest {

	@Test
	public void berechnetFlaeche() {
		CryptTool.init();
		MyLegacy myLegacy = new MyLegacy();
		myLegacy.run();
	}

}
