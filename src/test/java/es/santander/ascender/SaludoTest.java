package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SaludoTest {
    @Test
    public void testSaludar() {
        Saludo saludo = new Saludo();
        String resultado = saludo.Saludar("Miguel");
        
        // Verificamos que el resultado sea el esperado
        assertEquals("Hola\nMiguel", resultado);
    }
}
