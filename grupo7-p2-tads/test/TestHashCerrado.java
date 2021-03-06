import static org.junit.Assert.*;

import org.junit.Test;

import uy.edu.um.prog2.adt.Hash.ClaveInvalida;
import uy.edu.um.prog2.adt.Hash.ElementoYaExistenteException;
import uy.edu.um.prog2.adt.Hash.HashCerrado;
import uy.edu.um.prog2.adt.Hash.HashTable;

public class TestHashCerrado {
	
	@Test
	public void testInsertar() {
		HashTable<Integer, Integer> hash = new HashCerrado<>(5, true);
		try {
			hash.insertar(1, 1);
			hash.insertar(2, 2);
			hash.insertar(3, 3);
			hash.insertar(4, 4);
			hash.insertar(5, 5);

		} catch (ElementoYaExistenteException e) {
			fail();
		}

		assertTrue(hash.pertenece(1));
		assertTrue(hash.pertenece(2));
		assertTrue(hash.pertenece(3));
		assertTrue(hash.pertenece(4));
		assertTrue(hash.pertenece(5));

		assertFalse(hash.pertenece(6));

		try {
			hash.insertar(6, 6);
		} catch (ElementoYaExistenteException e) {
			fail();
		}
		assertTrue(hash.pertenece(6));
		assertFalse(hash.pertenece(7));
		
		try {
			hash.insertar(40,40);
		} catch (ElementoYaExistenteException e) {
			fail();
		}
		assertTrue(hash.pertenece(40));
	}

	@Test
	public void testEliminar() {
		HashTable<Integer, Integer> hash = new HashCerrado<>(5, true);
		try {
			hash.insertar(1, 1);
			hash.insertar(2, 2);
		} catch (ElementoYaExistenteException e) {
			fail();
		}
		assertTrue(hash.pertenece(1));
		try {
			hash.borrar(1);
		} catch (ClaveInvalida e) {
			fail();
		}
		assertFalse(hash.pertenece(1));
		try {
			hash.borrar(3);
			fail();
		} catch (ClaveInvalida e) {
		}

		try {
			hash.borrar(2);
		} catch (ClaveInvalida e) {
			fail();
		}
		assertFalse(hash.pertenece(2));
	}
	
	@Test
	public void testInsertarCuadratico() {
		HashTable<Integer, Integer> hash = new HashCerrado<>(5, false);
		try {
			hash.insertar(0, 0);
			hash.insertar(10, 10);
			hash.insertar(20, 20);
		} catch (ElementoYaExistenteException e) {
			fail();
		}
		assertTrue(hash.pertenece(0));
	}	
	
	@Test
	public void testBorrarCuadratico() {
		HashTable<Integer, Integer> hash = new HashCerrado<>(5, false);
		try {
			hash.insertar(0, 0);
			hash.insertar(10, 10);
			hash.insertar(20, 20);
		} catch (ElementoYaExistenteException e) {
			fail();
		}
	}
	
	@Test
	public void testAgrandar() {
		HashTable<Integer, Integer> hash = new HashCerrado<>(5, true);
		try {
			hash.insertar(1, 1);
			hash.insertar(2, 2);
			hash.insertar(3, 3);
			hash.insertar(4, 4);
			hash.insertar(5, 5);
			hash.insertar(6, 6);
			hash.insertar(7, 7);
			hash.insertar(8, 8);

			assertEquals(hash.size(),10);
			
			
		} catch (ElementoYaExistenteException e) {
		}
	}
}
