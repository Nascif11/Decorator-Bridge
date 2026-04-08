package Decorator;

public class Queijo extends PedidoDecorator {

    public Queijo(Pedido pedido) {
        super(pedido);
    }

    @Override
    public float getPrecoAdicional() {
        return 2.0f;
    }

    @Override
    public String getIngrediente() {
        return "Queijo";
    }
}