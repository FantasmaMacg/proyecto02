package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SaludoTest {
    @Test
    public void testSaludar() {
        Saludo saludo = new Saludo();
        String resultado = saludo.Saludar("Miguel");
        assertEquals("Hola\nMiguel", resultado);
    }
}
