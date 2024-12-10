public class Calculadora {

    public static Integer sumar(Integer num1, Integer num2) {
        Integer suma = num1 + num2;
        return suma;
    }

    public static Integer restar(Integer num1, Integer num2) {
        Integer resta = num1 - num2;
        return resta;
    }

    public static Integer multiplicar(Integer num1, Integer num2) {
        Integer multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public static double division(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return (double) num1 / num2;
    
    
    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }
}
