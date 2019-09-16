package exemplo2;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PessoaServiceAulaTest {

    @Mock
    private PessoaRespository pessoaRespository;
    @InjectMocks
    private PessoaService service;

    private Pessoa pessoa;

    @Before
    public void setUp() {
        pessoa = new Pessoa();
        pessoa.setId(1L);
        pessoa.setNome("Maicon");
    }

    @Test
    public void deveRetornarUmaPessoa() {
        Mockito.when(pessoaRespository.findById(1L)).thenReturn(pessoa);
        Pessoa pessoates = service.findById(1L);
        verify(pessoaRespository).findById(1L);
    }

    @Test
    public void testeSavePessoa() {
        service.save(pessoa);
        verify(pessoaRespository).save(pessoa);
    }


}