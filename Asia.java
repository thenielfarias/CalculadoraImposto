package calculadoraimposto;
public final class Asia extends CalculadoraImposto {

    @Override  
    public final void calculaImposto(float p) {
        this.setPreco(p * 1.20f);
    }
}