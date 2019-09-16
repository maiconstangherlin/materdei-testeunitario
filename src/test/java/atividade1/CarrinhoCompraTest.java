package atividade1;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CarrinhoCompraTest {

    @Test
    public void validaSeIdFicouOk() {
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();
        carrinhoCompra.setId(1L);

        assertEquals(Long.valueOf(1), carrinhoCompra.getId());
    }

    @Test
    public void valorDoItemDeveSerMantidoSeCompraNaoForFree() {
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();
        Item item = new Item(11L, "ITEM", 50d);
        List<Item> itens = List.of(item);

        carrinhoCompra.setItens(itens, false);

        assertEquals(Double.valueOf(50),
                carrinhoCompra.getItens().get(0).getValor());
    }

    @Test
    public void valorDoItemDeveSerZeroSeCompraForFree() {
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();
        Item item = new Item(11L, "ITEM", 50d);
        List<Item> itens = List.of(item);

        carrinhoCompra.setItens(itens, true);

        assertEquals(Double.valueOf(0),
                carrinhoCompra.getItens().get(0).getValor());
    }
}