package calculadoraimposto;
public final class America extends CalculadoraImposto {

    @Override    
    public final void calculaImposto(float p) {
        this.setPreco(p * 1.1f);         
    }
}
