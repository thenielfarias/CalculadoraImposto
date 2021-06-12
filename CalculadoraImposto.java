package calculadoraimposto;
public abstract class CalculadoraImposto {
    private float preco;
    
    public abstract void calculaImposto(float p);
    
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }    

}
