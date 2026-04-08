package Decorator;

public class Bacon extends PedidoDecorator {

    public Bacon(Pedido pedido) {
        super(pedido);
    }

    @Override
    public float getPrecoAdicional() {
        return 3.0f;
    }

    @Override
    public String getIngrediente() {
        return "Bacon";
    }
}