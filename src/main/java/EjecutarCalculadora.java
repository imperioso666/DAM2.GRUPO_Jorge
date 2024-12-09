public class EjecutarCalculadora {
    public static void main(String[] args) {
        Integer num1 = 6;
        Integer num2 = 8;
        System.out.println("Suma: " + Calculadora.sumar(num1, num2));
        System.out.println("Resta: " + Calculadora.restar(num1, num2));
        System.out.println("Multiplicación: " + Calculadora.multiplicar(num1, num2));
        System.out.println("División: " + Calculadora.division(num1, num2));
    }
}
