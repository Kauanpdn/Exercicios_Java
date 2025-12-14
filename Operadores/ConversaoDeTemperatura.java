package Operadores;
import java.util.Scanner;

/*Crie um programa que converta uma temperatura em graus Celsius para Fahrenheit. A
fórmula de conversão é: F = (C * 9/5) + 32. Exiba o resultado no console.*/

public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Digite a temperatura em celsiu (°C) : ");
        int temperaturaCelsiu = scanner.nextInt();

        int conversão = (temperaturaCelsiu * 9/5) + 32;

        double temperaturaFahrenheit = conversão;

        System.out.println("A conversão de " + temperaturaCelsiu + "°C para fahrenheit fica " + temperaturaFahrenheit + "°F");

        scanner.close();
    }
}
