
public class quadrado {

    // Atributos da classe quadrado:
    double lado;
    double area;
    double perimetro;
    // metodos
    // método construtor
    public quadrado(double lado) {
        this.lado = lado;
        this.area = calcularArea2();
    }
    // metodo proprios
    // calcular separado
    public void calcularArea() {
        this.area = this.lado * this.lado;
    }
    // calcular no contrudor
    public double calcularArea2() {
        return this.lado * this.lado;
    }
    public void calcularPerimetro() {
        this.perimetro = this.lado * 4;
    }
    public void imprimir() {
        System.out.println("Lado: " + this.lado);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}