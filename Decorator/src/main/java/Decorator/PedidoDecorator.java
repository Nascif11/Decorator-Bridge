package Decorator;

public abstract class PedidoDecorator implements Pedido {

    private Pedido pedido;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract float getPrecoAdicional();

    @Override
    public float getPreco() {
        return this.pedido.getPreco() + this.getPrecoAdicional();
    }

    public abstract String getIngrediente();

    @Override
    public String getDescricao() {
        return this.pedido.getDescricao() + " + " + this.getIngrediente();
    }
}