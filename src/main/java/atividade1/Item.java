package atividade1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Item {

    private Long id;
    private String descricao;

    @Setter
    private Double valor;
}
