package exemplo1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanoTest {

    @Test
    public void deveRetornar3(){
        assertEquals(3, Romano.converteParaNumero("III"));
    }

    @Test
    public void deveRetornar4(){
        assertEquals(4, Romano.converteParaNumero("IV"));
    }

    @Test
    public void deveRetornar8(){
        assertEquals(8, Romano.converteParaNumero("VIII"));
    }

    @Test
    public void deveRetornar119(){
        assertEquals(119, Romano.converteParaNumero("CXIX"));
    }
}