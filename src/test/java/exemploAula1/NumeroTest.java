package exemploAula1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumeroTest {

    @Test
    public void deveRetornarUm() {
        assertEquals("I", Numero.converteParaRomano(1));
    }

    @Test
    public void deveRetornarDois() {
        assertEquals("II", Numero.converteParaRomano(2));
    }

    @Test
    public void deveRetornarTres() {
        assertEquals("III", Numero.converteParaRomano(3));
    }
}