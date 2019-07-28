package exemplo1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumeroTest {

    @Test
    public void deveRetornar1(){
        assertEquals("I", Numero.converteParaRomano(1));
    }

    @Test
    public void deveRetornar2(){
        assertEquals("II", Numero.converteParaRomano(2));
    }

    @Test
    public void deveRetornar3(){
        assertEquals("III", Numero.converteParaRomano(3));
    }

    @Test
    public void deveRetornar4(){
        assertEquals("IV", Numero.converteParaRomano(4));
    }

    @Test
    public void deveRetornar8(){
        assertEquals("VIII", Numero.converteParaRomano(8));
    }
}