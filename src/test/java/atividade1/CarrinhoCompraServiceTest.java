package atividade1;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CarrinhoCompraServiceTest {

    @Test()
    public void teste(){
        CarrinhoCompraRepository repository = Mockito.mock(CarrinhoCompraRepository.class);
        CarrinhoCompraService service = new CarrinhoCompraService(repository);

        Mockito.when(repository.findById(1L)).thenReturn(new CarrinhoCompra());
        Mockito.when(repository.findById(2L)).thenThrow(new RuntimeException("TESTE"));

        assertNotNull(service.findById(1L));

        Mockito.verify(repository).findById(Mockito.any());
    }
}