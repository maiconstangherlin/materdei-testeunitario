package exemplo2;

public class PessoaService {

    private PessoaRespository respository;

    public PessoaService(PessoaRespository respository) {
        this.respository = respository;
    }

    public void save(Pessoa pessoa) {
        respository.save(pessoa);
    }

    public void delete(Long id) {
        respository.deleteById(id);
    }

    public Pessoa findById(Long id) {
        return respository.findById(id);
    }
}
