package tierra_media;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrollTest {

	private Personaje troll;
	
	@Before
	public void inicio() {
		troll = new Troll();
	}

	@Test
	public void testTrollContraElfo() {
		Personaje elfo = new Elfo();

		Assert.assertEquals(100, troll.salud());

		elfo.atacar(troll); /* 0 ataques recibidos */
		troll.atacar(elfo); /* 0 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(100, elfo.salud());

		elfo.atacar(troll); /* 1 ataques recibidos */
		troll.atacar(elfo); /* 1 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(100, elfo.salud());

		elfo.atacar(troll); /* 2 ataques recibidos */
		troll.atacar(elfo); /* 2 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(70, elfo.salud());

		elfo.atacar(troll); /* 3 ataques recibidos */
		troll.atacar(elfo); /* 3 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(70, elfo.salud());

		elfo.atacar(troll); /* 4 ataques recibidos */
		troll.atacar(elfo); /* 4 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(70, elfo.salud());

		elfo.atacar(troll); /* 5 ataques recibidos */
		troll.atacar(elfo); /* 5 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(40, elfo.salud());

		elfo.atacar(troll); /* 6 ataques recibidos */
		troll.atacar(elfo); /* 6 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(40, elfo.salud());
		
		elfo.atacar(troll); /* 7 ataques recibidos */
		troll.atacar(elfo); /* 7 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(40, elfo.salud());
		
		elfo.atacar(troll); /* 8 ataques recibidos */
		troll.atacar(elfo); /* 8 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(10, elfo.salud());
		
		troll.descansar();
		troll.atacar(elfo);
		troll.atacar(elfo);
		troll.atacar(elfo);
		
		Assert.assertEquals(10, elfo.salud());
	}
	
	@Test
	public void testTrollContraEnano() {
		Personaje enano = new Enano();

		Assert.assertEquals(100, troll.salud());

		enano.atacar(troll); /* 0 ataques dados */
		troll.atacar(enano); /* 0 ataques dados */
		troll.atacar(enano); /* 1 ataques dados */
		troll.atacar(enano); /* 2 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(70, enano.salud());

		enano.atacar(troll); /* 1 ataques dados */
		troll.atacar(enano); /* 3 ataques dados */
		troll.atacar(enano); /* 4 ataques dados */
		troll.atacar(enano); /* 5 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(40, enano.salud());

		enano.atacar(troll); /* 2 ataques dados */
		troll.atacar(enano); /* 6 ataques dados */
		troll.atacar(enano); /* 7 ataques dados */
		troll.atacar(enano); /* 8 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(10, enano.salud());
		
		troll.descansar();
		troll.atacar(enano);
		troll.atacar(enano);
		troll.atacar(enano);
		troll.atacar(enano);
		troll.atacar(enano);
		troll.atacar(enano);
		
		Assert.assertEquals(10, enano.salud());
	}
	
	@Test
	public void testTrollContraGoblin() {
		Personaje goblin = new Goblin();

		Assert.assertEquals(100, troll.salud());

		goblin.atacar(troll);
		for (int i = 0; i < 30; i++)
			troll.atacar(goblin);

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(70, goblin.salud());

		goblin.atacar(troll);
		for (int i = 0; i < 30; i++)
			troll.atacar(goblin);

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(40, goblin.salud());

		goblin.atacar(troll);
		for (int i = 0; i < 30; i++)
			troll.atacar(goblin);

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(10, goblin.salud());
		
		troll.descansar();
		troll.atacar(goblin);
		troll.atacar(goblin);
		troll.atacar(goblin);
		troll.atacar(goblin);
		troll.atacar(goblin);
		troll.atacar(goblin);
		
		Assert.assertEquals(10, goblin.salud());
	}
	
	@Test
	public void testTrollContraHumano() {
		Personaje humano = new Humano();

		Assert.assertEquals(100, troll.salud());

		humano.atacar(troll); /* fuerza 10 */
		troll.atacar(humano); /* 0 ataques dados */
		troll.atacar(humano); /* 1 ataques dados */
		troll.atacar(humano); /* 2 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(70, humano.salud());

		humano.atacar(troll); /* fuerza 6 */
		troll.atacar(humano); /* 3 ataques dados */
		troll.atacar(humano); /* 4 ataques dados */
		troll.atacar(humano); /* 5 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(40, humano.salud());

		humano.atacar(troll); /* fuerza 2 */
		troll.atacar(humano); /* 6 ataques dados */
		troll.atacar(humano); /* 7 ataques dados */
		troll.atacar(humano); /* 8 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(10, humano.salud());
		
		troll.descansar();
		troll.atacar(humano);
		troll.atacar(humano);
		troll.atacar(humano);
		troll.atacar(humano);
		troll.atacar(humano);
		troll.atacar(humano);
		
		Assert.assertEquals(10, humano.salud());
	}
	
	@Test
	public void testTrollContraOrco() {
		Personaje orco = new Orco();

		Assert.assertEquals(100, troll.salud());

		orco.atacar(troll);
		troll.atacar(orco); /* 0 ataques dados */
		troll.atacar(orco); /* 1 ataques dados */
		troll.atacar(orco); /* 2 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(93, orco.salud());

		orco.atacar(troll);
		troll.atacar(orco); /* 3 ataques dados */
		troll.atacar(orco); /* 4 ataques dados */
		troll.atacar(orco); /* 5 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(86, orco.salud());

		orco.atacar(troll);
		troll.atacar(orco); /* 6 ataques dados */
		troll.atacar(orco); /* 7 ataques dados */
		troll.atacar(orco); /* 8 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(79, orco.salud());
		
		orco.atacar(troll);
		troll.atacar(orco); /* 9 ataques dados */
		troll.atacar(orco); /*10 ataques dados */
		troll.atacar(orco); /*11 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(72, orco.salud());

		orco.atacar(troll);
		troll.atacar(orco); /*12 ataques dados */
		troll.atacar(orco); /*13 ataques dados */
		troll.atacar(orco); /*14 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(65, orco.salud());

		orco.atacar(troll);
		troll.atacar(orco); /*15 ataques dados */
		troll.atacar(orco); /*16 ataques dados */
		troll.atacar(orco); /*17 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(58, orco.salud());
		
		troll.descansar();
		troll.atacar(orco);
		troll.atacar(orco);
		troll.atacar(orco);
		troll.atacar(orco);
		troll.atacar(orco);
		troll.atacar(orco);
		
		Assert.assertEquals(58, orco.salud());
	}
}
