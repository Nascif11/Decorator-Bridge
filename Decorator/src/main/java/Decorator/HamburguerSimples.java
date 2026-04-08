package Decorator;

public class HamburguerSimples implements Pedido {

    private final Preparo preparo;
    private final float preco;
    
    public HamburguerSimples(Preparo preparo) {
        this.preco = 10.0f;
        this.preparo = preparo;
    }

    public HamburguerSimples(float preco, Preparo preparo) {
        this.preco = preco;
        this.preparo = preparo;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Hambúrguer simples (" + preparo.preparar() + ")";
    }
}