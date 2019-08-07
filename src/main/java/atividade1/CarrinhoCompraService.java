package atividade1;

public class CarrinhoCompraService {

    private CarrinhoCompraRepository repository;

    public CarrinhoCompraService(CarrinhoCompraRepository repository) {
        this.repository = repository;
    }

    public void save(CarrinhoCompra carrinhoCompra) {
        calculaPrecoFreteDoProduto(carrinhoCompra);
        repository.save(carrinhoCompra);
    }

    public void update(CarrinhoCompra carrinhoCompra) {
        calculaPrecoFreteDoProduto(carrinhoCompra);
        repository.update(carrinhoCompra.getId(), carrinhoCompra);
    }

    public CarrinhoCompra findById(Long id) {
        return repository.findById(id);
    }

    public void calculaPrecoFreteDoProduto(CarrinhoCompra carrinhoCompra) {
        Double valorFrete = 0d;

        for (Item item : carrinhoCompra.getItens()) {
            if (carrinhoCompra.getPessoa().getUf().equals("PR")) {
                valorFrete += 15d;
            } else if (carrinhoCompra.getPessoa().getUf().equals("SP")) {
                valorFrete += 30d;
            } else {
                valorFrete += 50d;
            }
        }

        carrinhoCompra.setValorFrete(valorFrete);
    }

}
