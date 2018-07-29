package tierra_media;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrcoTest {

	private Personaje orco;
	
	@Before
	public void inicio() {
		orco = new Orco();
	}
	
	@Test
	public void testOrcoContraElfo() {
		Personaje elfo = new Elfo();

		Assert.assertEquals(100, orco.salud());

		elfo.atacar(orco); /* 0 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(99, orco.salud());
		Assert.assertEquals(85, elfo.salud());

		elfo.atacar(orco); /* 1 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(98, orco.salud());
		Assert.assertEquals(70, elfo.salud());

		elfo.atacar(orco); /* 2 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(96, orco.salud());
		Assert.assertEquals(55, elfo.salud());

		elfo.atacar(orco); /* 3 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(93, orco.salud());
		Assert.assertEquals(40, elfo.salud());

		elfo.atacar(orco); /* 4 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(88, orco.salud());
		Assert.assertEquals(25, elfo.salud());

		elfo.atacar(orco); /* 5 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(79, orco.salud());
		Assert.assertEquals(10, elfo.salud());

		elfo.atacar(orco); /* 6 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(62, orco.salud());
		Assert.assertEquals(0, elfo.salud());
	}
	
	@Test
	public void testOrcoContraEnano() {
		Personaje enano = new Enano();
		
		Assert.assertEquals(100, orco.salud());
		
		enano.atacar(orco); /* 0 ataques dados */
		orco.atacar(enano);
		
		Assert.assertEquals(98, orco.salud());
		Assert.assertEquals(85, enano.salud());
		
		enano.atacar(orco); /* 1 ataques dados */
		orco.atacar(enano);
		
		Assert.assertEquals(95, orco.salud());
		Assert.assertEquals(70, enano.salud());
		
		enano.atacar(orco); /* 2 ataques dados */
		orco.atacar(enano);
		
		Assert.assertEquals(92, orco.salud());
		Assert.assertEquals(55, enano.salud());
		
		enano.atacar(orco); /* 3 ataques dados */
		orco.atacar(enano);
		
		Assert.assertEquals(88, orco.salud());
		Assert.assertEquals(40, enano.salud());
		
		enano.atacar(orco); /* 4 ataques dados */
		orco.atacar(enano);
		
		Assert.assertEquals(84, orco.salud());
		Assert.assertEquals(25, enano.salud());
		
		enano.atacar(orco); /* 5 ataques dados */
		orco.atacar(enano);
		
		Assert.assertEquals(79, orco.salud());
		Assert.assertEquals(10, enano.salud());
		
		enano.atacar(orco); /* 6 ataques dados */
		orco.atacar(enano);
		
		Assert.assertEquals(74, orco.salud());
		Assert.assertEquals(0, enano.salud());
	}
	
	@Test
	public void testOrcoContraGoblin() {
		Personaje goblin = new Goblin();

		Assert.assertEquals(100, orco.salud());

		for (int i = 0; i < 10; i++)
			orco.atacar(goblin);
		goblin.atacar(orco);

		Assert.assertEquals(100, orco.salud());
		Assert.assertEquals(85, goblin.salud());

		for (int i = 0; i < 10; i++)
			orco.atacar(goblin);
		goblin.atacar(orco);

		Assert.assertEquals(100, orco.salud());
		Assert.assertEquals(70, goblin.salud());

		for (int i = 0; i < 10; i++)
			orco.atacar(goblin);
		goblin.atacar(orco);

		Assert.assertEquals(100, orco.salud());
		Assert.assertEquals(55, goblin.salud());

		for (int i = 0; i < 10; i++)
			orco.atacar(goblin);
		goblin.atacar(orco);

		Assert.assertEquals(100, orco.salud());
		Assert.assertEquals(40, goblin.salud());

		for (int i = 0; i < 10; i++)
			orco.atacar(goblin);
		goblin.atacar(orco);

		Assert.assertEquals(100, orco.salud());
		Assert.assertEquals(25, goblin.salud());

		for (int i = 0; i < 10; i++)
			orco.atacar(goblin);
		goblin.atacar(orco);

		Assert.assertEquals(100, orco.salud());
		Assert.assertEquals(10, goblin.salud());

		for (int i = 0; i < 10; i++)
			orco.atacar(goblin);
		goblin.atacar(orco);

		Assert.assertEquals(100, orco.salud());
		Assert.assertEquals(0, goblin.salud());
	}
	
	@Test
	public void testOrcoContraHumano() {
		Personaje humano = new Humano();

		Assert.assertEquals(100, orco.salud());

		humano.atacar(orco); /* fuerza 10 */
		orco.atacar(humano);

		Assert.assertEquals(98, orco.salud());
		Assert.assertEquals(85, humano.salud());

		humano.atacar(orco); /* fuerza 8 */
		orco.atacar(humano);

		Assert.assertEquals(96, orco.salud());
		Assert.assertEquals(70, humano.salud());

		humano.atacar(orco); /* fuerza 6 */
		orco.atacar(humano);

		Assert.assertEquals(95, orco.salud());
		Assert.assertEquals(55, humano.salud());

		humano.atacar(orco); /* fuerza 4 */
		orco.atacar(humano);

		Assert.assertEquals(94, orco.salud());
		Assert.assertEquals(40, humano.salud());

		humano.atacar(orco); /* fuerza 2 */
		orco.atacar(humano);

		Assert.assertEquals(94, orco.salud());
		Assert.assertEquals(25, humano.salud());

		humano.descansar();
		humano.atacar(orco); /* fuerza 10 */
		orco.atacar(humano);

		Assert.assertEquals(92, orco.salud());
		Assert.assertEquals(10, humano.salud());

		humano.atacar(orco); /* fuerza 8 */
		orco.atacar(humano);

		Assert.assertEquals(90, orco.salud());
		Assert.assertEquals(0, humano.salud());
	} 

	@Test
	public void testOrcoContraTroll() {
		Personaje troll = new Troll();

		Assert.assertEquals(100, orco.salud());

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
