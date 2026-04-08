package Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarPrecoPedidoSimplesGrelhado() {
        Pedido pedido = new HamburguerSimples(10.0f, new Grelhado());

        assertEquals(10.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarDescricaoPedidoSimplesGrelhado() {
        Pedido pedido = new HamburguerSimples(new Grelhado());

        assertEquals("Hambúrguer simples (Grelhado)", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoSimplesAssado() {
        Pedido pedido = new HamburguerSimples(new Assado());

        assertEquals("Hambúrguer simples (Assado)", pedido.getDescricao());
    }

    @Test
    void deveRetornarPrecoPedidoComQueijoGrelhado() {
        Pedido pedido = new Queijo(new HamburguerSimples(10.0f, new Grelhado()));

        assertEquals(12.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComBaconAssado() {
        Pedido pedido = new Bacon(new HamburguerSimples(10.0f, new Assado()));

        assertEquals(13.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComOvoGrelhado() {
        Pedido pedido = new Ovo(new HamburguerSimples(10.0f, new Grelhado()));

        assertEquals(11.5f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComQueijoMaisBaconGrelhado() {
        Pedido pedido = new Queijo(new Bacon(new HamburguerSimples(10.0f, new Grelhado())));

        assertEquals(15.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoCompletoAssado() {
        Pedido pedido = new Queijo(
                new Bacon(
                        new Ovo(
                                new HamburguerSimples(10.0f, new Assado())
                        )
                )
        );

        assertEquals(16.5f, pedido.getPreco());
    }

    @Test
    void deveRetornarDescricaoPedidoComQueijoGrelhado() {
        Pedido pedido = new Queijo(new HamburguerSimples(new Grelhado()));

        assertEquals("Hambúrguer simples (Grelhado) + Queijo", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoComBaconAssado() {
        Pedido pedido = new Bacon(new HamburguerSimples(new Assado()));

        assertEquals("Hambúrguer simples (Assado) + Bacon", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoComOvoGrelhado() {
        Pedido pedido = new Ovo(new HamburguerSimples(new Grelhado()));

        assertEquals("Hambúrguer simples (Grelhado) + Ovo", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoComQueijoMaisBaconGrelhado() {
        Pedido pedido = new Queijo(new Bacon(new HamburguerSimples(new Grelhado())));

        assertEquals("Hambúrguer simples (Grelhado) + Bacon + Queijo", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoCompletoAssado() {
        Pedido pedido = new Queijo(
                new Bacon(
                        new Ovo(
                                new HamburguerSimples(new Assado())
                        )
                )
        );

        assertEquals("Hambúrguer simples (Assado) + Ovo + Bacon + Queijo", pedido.getDescricao());
    }

}