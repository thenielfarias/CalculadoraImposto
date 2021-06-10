package calculadoraimposto;
public class Main {
    
    static float soma(float a, float b, float c) {
        float s = a + b + c;
        return s;
    }    
    
    public static void main(String args[]) {

    America p1 = new America();
    p1.calculaImposto(100);
    System.out.format("Peço na America com imposto = %.2f \n", p1.getPreco());
    
    Europa p2 = new Europa();
    p2.calculaImposto(100);
    System.out.format("Preço na Europa com imposto = %.2f \n", p2.getPreco());
    
    Asia p3 = new Asia();
    p3.calculaImposto(100);
    System.out.format("Preço na Asia com imposto = %.2f \n", p3.getPreco());
    
    float total = soma(p1.getPreco(),p2.getPreco(),p3.getPreco());
    System.out.println("Soma dos preços com impostos = " + total);
    }    
}
