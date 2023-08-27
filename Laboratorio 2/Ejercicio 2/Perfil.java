package perfil;
import java.util.Scanner;

public class Perfil {

    public static void main(String[] args) {
        String nombre, apellido;
        int dia, mes, anio;
        double peso, altura;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese su primer nombre: ");
        nombre = entrada.next();
        System.out.print("Ingrese su apellido: ");
        apellido = entrada.next();
        System.out.print("Ingrese su dia de nacimiento: ");
        dia = entrada.nextInt();
        System.out.print("Ingrese su mes de nacimiento: ");
        mes = entrada.nextInt();
        System.out.print("Ingrese su año de nacimiento: ");
        anio = entrada.nextInt();
        System.out.print("Ingrese su altura (en cm): ");
        altura = entrada.nextDouble();
        System.out.print("Ingrese su peso (en kg): ");
        peso = entrada.nextDouble();
        
        PerfilMedico persona = new PerfilMedico(nombre, apellido, dia, mes, anio, altura, peso);
        System.out.print("\nInformacion del objeto: ");
        System.out.println(persona);
        
        System.out.println("\nEdad de la persona: " + persona.obtenerEdad());
        System.out.println("IMC (Indice de masa corporal): " + Math.round(persona.calcularIMC() * 100.0)/100.0);
        System.out.println("FCM (Frecuencia cardiaca maxima): " + persona.calcularFCM());
        
    }
}
