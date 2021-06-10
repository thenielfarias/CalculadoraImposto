package calculadoraimposto;
public final class Europa extends CalculadoraImposto {

    @Override  
    public final void calculaImposto(float p) {
        this.setPreco(p * 1.15f);
    }
}