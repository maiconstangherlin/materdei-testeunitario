package atividade1;

public interface CarrinhoCompraRepository {

    public CarrinhoCompra findById(Long id);

    public void save(CarrinhoCompra carrinhoCompra);

    public void update(Long id, CarrinhoCompra carrinhoCompra);

}
