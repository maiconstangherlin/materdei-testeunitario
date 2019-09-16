package atividade1;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
