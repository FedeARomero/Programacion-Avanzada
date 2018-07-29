package tierra_media;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GoblinTest {
	
	private Personaje goblin;
	
	@Before
	public void inicio() {
		goblin = new Goblin();
	}

	@Test
	public void testGoblinContraElfo() {
		Personaje elfo = new Elfo();

		Assert.assertEquals(100, goblin.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 0 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(95, goblin.salud());
		Assert.assertEquals(97, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 1 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(88, goblin.salud());
		Assert.assertEquals(94, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 2 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(79, goblin.salud());
		Assert.assertEquals(91, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 3 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(66, goblin.salud());
		Assert.assertEquals(88, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 4 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(45, goblin.salud());
		Assert.assertEquals(85, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 5 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(8, goblin.salud());
		Assert.assertEquals(82, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 6 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(0, goblin.salud());
		Assert.assertEquals(79, elfo.salud());
	}

	@Test
	public void testGoblinContraEnano() {
		Personaje enano = new Enano();

		Assert.assertEquals(100, goblin.salud());

		/* 0 ataques dados */
		for (int i = 0; i < 10; i++)
			enano.atacar(goblin); 
		goblin.atacar(enano);

		Assert.assertEquals(72, goblin.salud());
		Assert.assertEquals(97, enano.salud());

		/* 10 ataques dados */
		for (int i = 0; i <= 10; i++)
			enano.atacar(goblin); 
		goblin.atacar(enano);

		Assert.assertEquals(24, goblin.salud());
		Assert.assertEquals(94, enano.salud());
	
		/* 20 ataques daos */
		for (int i = 0; i <= 10; i++)
			enano.atacar(goblin); 
		goblin.atacar(enano);

		Assert.assertEquals(0, goblin.salud());
		Assert.assertEquals(91, enano.salud());
	}

	@Test
	public void testGoblinContraHumano() {
		Personaje humano = new Humano();

		Assert.assertEquals(100, goblin.salud());

		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano); 

		Assert.assertEquals(99, goblin.salud());
		Assert.assertEquals(97, humano.salud());

		humano.descansar();
		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano); 

		humano.descansar();
		Assert.assertEquals(98, goblin.salud());
		Assert.assertEquals(94, humano.salud());

		humano.descansar();
		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano);

		Assert.assertEquals(97, goblin.salud());
		Assert.assertEquals(91, humano.salud());

		humano.descansar();
		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano);

		Assert.assertEquals(96, goblin.salud());
		Assert.assertEquals(88, humano.salud());

		humano.descansar();
		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano);

		Assert.assertEquals(95, goblin.salud());
		Assert.assertEquals(85, humano.salud());

		humano.descansar();
		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano);

		Assert.assertEquals(94, goblin.salud());
		Assert.assertEquals(82, humano.salud());

		humano.descansar();
		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano);

		Assert.assertEquals(93, goblin.salud());
		Assert.assertEquals(79, humano.salud());
	}
	
	@Test
	public void testGoblinContraOrco() {
		Personaje orco = new Orco();

		Assert.assertEquals(100, goblin.salud());

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
	public void testGoblinContraTroll() {
		Personaje troll = new Troll();

		Assert.assertEquals(100, goblin.salud());

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
}

