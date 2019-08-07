package atividade1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
@AllArgsConstructor
public class CarrinhoCompra {

    private Long id;

    private Pessoa pessoa;

    @Setter(AccessLevel.NONE)
    private List<Item> itens;

    private Double valorFrete;

    public void setItens(List<Item> itens, boolean compraFree) {
        if (compraFree) {
            for (Item item : itens) {
                item.setValor(0d);
            }
        }

        this.itens = itens;
    }
}
