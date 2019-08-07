package atividade1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pessoa {

    private Long id;
    private String nome;
    private String uf;

}
