package calculadoraimposto;
public abstract class CalculadoraImposto {
    private float preco;
    
    public void calculaImposto(float p) {
        this.setPreco(p * 1f);         
    }
    
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }    

}
