package Decorator;

public class Assado implements Preparo {

    @Override
    public String preparar() {
        return "Assado";
    }
}