package atividade1;

public interface CarrinhoCompraRepository {

    CarrinhoCompra findById(Long id);

    void save(CarrinhoCompra carrinhoCompra);

    void update(Long id, CarrinhoCompra carrinhoCompra);

}
