import java.util.Scanner;

public class Main {
    private static Scanner leer;

    public static void main(String[] args) {


        System.out.println("ingresa el radio");
        System.out.println();//privado

        Circulo Radio= new Circulo();
        Circulo radio= new Circulo(Radio.radio,22.3f,3,2 );
        Radio.setRadio(leer.nextFloat());
        Radio.getArea();
        Radio.getCircunferencia();
        Radio.getDiametro();



    }
}
