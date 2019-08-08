package exemplo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PessoaServiceTest {

    @Mock
    private PessoaRespository respository;
    @InjectMocks
    private PessoaService service;

    @Test
    public void deveRetornarUmaPessoa() {
        Pessoa pessoa1 = new Pessoa();
        when(respository.findById(1L)).thenReturn(pessoa1);
        assertEquals(pessoa1, service.findById(1L));
    }

}