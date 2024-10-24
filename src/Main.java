public class Main {
public static void main(String[] args) {
   
    //Execução da conversão Celcius Para Fahrenheit

    double Fahrenheit = ConversorUnidades.celsiusParaFahrenheit(35);
    System.out.println ("Fahrenheit = " + Fahrenheit + "°F"); 

    //Execução da conversão Quilometro Para Milhas

    double Milhas = ConversorUnidades.quilometrosParaMilhas(120);
    System.out.println ("Milhas = " + Milhas + " mi");

//Execução da conversão Gramas Para Libras

    double Libras = ConversorUnidades.gramasParaLibras(120);
System.out.println("Libras = " + Libras + " lb");
}
}
