/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author josed
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1
        String correo1 = "tics777@gmail.com";
        String correo2 = "demonslayer@hotmail.com";

        System.out.println("Es un correo de gmail? " + ValidacionCorreo.esGmail(correo1));
        System.out.println("Es un correo de gmail? " + ValidacionCorreo.esGmail(correo2));

        //Ejercicio 2 Prueba Área
        double radio = 20;
        System.out.println("El área del círculo es: " + CalculoArea.calcularAreaCirculo(radio));

        //Ejercicio 3 Prueba
        System.out.println("Vocales en 'Hola Mundo' " + ContadorVocales.contarVocales("Hola Mundo"));
        
        //Ejercicio 3 
        System.out.println("7 es número primo? " + NumeroPrimos.esPrimo(7));
        System.out.println("10 es número primo? " + NumeroPrimos.esPrimo(10));
        
        //Ejercicio 4
        System.out.println("125 Minutos: " + ConversorTiempo.convertirMinutos(125));
    }

    public class ValidacionCorreo { // Ejercicio 1

        public static boolean esGmail(String correo) {
            return correo.toLowerCase().endsWith("@gmail.com"); //Para válidar si el correo términa con @gmail.com
        }
    }

    public class CalculoArea { // Ejercicio 2

        public static double calcularAreaCirculo(double radio) {
            return Math.PI * Math.pow(radio, 2);
        }
    }

    public class ContadorVocales { //Ejercicio 3

        public static int contarVocales(String palabra) {
            int contador = 0;
            palabra = palabra.toLowerCase();

            for (char c : palabra.toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    contador++;
                }

            }
            return contador;
        }
    }

    public class NumeroPrimos {

        public static boolean esPrimo(int n) {

            if (n <= 1) {
                return false;
            } else if (n == 2) {
                return true;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public class ConversorTiempo {

        public static String convertirMinutos(int minutos) {
            int horas = minutos / 60;
            int minutosRestantes = minutos % 60;
            return horas + " horas, " + minutosRestantes + "minutos";
        }
    }
}
