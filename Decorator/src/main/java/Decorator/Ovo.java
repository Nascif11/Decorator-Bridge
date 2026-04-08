package Decorator;

public class Ovo extends PedidoDecorator {

    public Ovo(Pedido pedido) {
        super(pedido);
    }

    @Override
    public float getPrecoAdicional() {
        return 1.5f;
    }

    @Override
    public String getIngrediente() {
        return "Ovo";
    }
}