package exemplo2;

public interface PessoaRespository {

    void save(Pessoa pessoa);

    Pessoa findById(Long id);

    void deleteById(Long id);
}
