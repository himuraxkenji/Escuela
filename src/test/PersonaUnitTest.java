package test;

import escuela.Fecha;
import escuela.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class PersonaUnitTest {

	@Test
	public void testPersonaWhenHaveFirstNameAndSecondName () {
		//Arrange and Act
		Persona person = new Persona("Adriel Aaron", "Riperto");

		//Assert
		Assertions.assertNotNull(person);

	}

	@Test
	public void testPersonaWhenHaveFechaAndDni(){
		//Arrange
		Fecha dateOfBirthday = new Fecha(10,6,1994);

		//Act
		Persona person = new Persona("Adriel Aaron", "Riperto", 38440761, dateOfBirthday);

		//Assert
		Assertions.assertNotNull(person);

	}

}
