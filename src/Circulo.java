public class Circulo {
    public float radio;
    private float area;
    private float diametro;
    private float circunferencia;

/*calculararea=pi x radio al cuadrado
   diametro= radio x dos
    circunferencia pi x diametro */

    public Circulo(){
        System.out.println("soy un circulo");
    }
    public Circulo(float radio,float area,float diametro,float circunferencia){
        this.radio=radio;
        this.diametro=diametro;
        this.circunferencia=circunferencia;
        this.area=area;

    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
