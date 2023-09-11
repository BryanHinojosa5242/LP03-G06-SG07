package evaluacioncrediticia;

import java.util.Random;

public class EvaluacionCrediticia {

    public static void main(String[] args) {
        Random random = new Random();
        int hombres = 0;
        int mujeres = 0;
        int hombresTrabajan = 0;
        int mujeresTrabajan = 0;
        int sumaSueldosHombresTrabajan = 0;
        int sumaSueldosMujeresTrabajan = 0;
        int totalPersonas = 8;
        
        int[] genero = new int[totalPersonas];   // genero
        int[] trabajos = new int[totalPersonas]; // estado de empleo
        int[] sueldos = new int[totalPersonas];  // sueldos

        // llenar los arreglos
        for (int i = 0; i < totalPersonas; i++) {
            genero[i] = random.nextInt(2) + 1; // 1 para masculino, 2 para femenino
            trabajos[i] = random.nextInt(2) + 1; // 1 para trabaja, 2 para no trabaja
            if (trabajos[i] == 1) {
                sueldos[i] = random.nextInt(3001 - 950) + 950; // sueldo entre 950 y 3000
            } else {
                sueldos[i] = 0; // si no trabaja, el sueldo es cero
            }
        }

        // calcula el numero de hombres y mujeres, y el numero de hombres y mujeres que trabajan
        for (int i = 0; i < totalPersonas; i++) {
            if (genero[i] == 1) {
                hombres++;
                if (trabajos[i] == 1) {
                    hombresTrabajan++;
                    sumaSueldosHombresTrabajan += sueldos[i];
                }
            } else {
                mujeres++;
                if (trabajos[i] == 1) {
                    mujeresTrabajan++;
                    sumaSueldosMujeresTrabajan += sueldos[i];
                }
            }
            
            // muestra informacion de la persona
            System.out.println("Persona " + (i + 1) + ":");
            System.out.println("Sexo: " + (genero[i] == 1 ? "Masculino" : "Femenino"));
            System.out.println("Trabaja: " + (trabajos[i] == 1 ? "Si" : "No"));
            System.out.println("Sueldo: " + sueldos[i]);
            System.out.println();
        }

        // calcula y muestra
        double porcentajeHombres = (double) hombres / totalPersonas * 100;
        double porcentajeMujeres = (double) mujeres / totalPersonas * 100;
        
        double porcentajeHombresTrabajan = Math.round(((double) hombresTrabajan / hombres * 100 * 100)/100); // redondea a 2 decimales
        double porcentajeMujeresTrabajan = Math.round(((double) mujeresTrabajan / mujeres * 100 * 100)/100);
        
        double promedioSueldosHombresTrabajan = Math.round(((double) sumaSueldosHombresTrabajan / hombresTrabajan*100)/100);
        double promedioSueldosMujeresTrabajan = Math.round(((double) sumaSueldosMujeresTrabajan / mujeresTrabajan*100)/100);
        
        System.out.println("a) Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("b) Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("c) Porcentaje de hombres que trabajan: " + porcentajeHombresTrabajan + "%");
        System.out.println("e) Porcentaje de mujeres que trabajan: " + porcentajeMujeresTrabajan + "%");
        System.out.println("f) Sueldo promedio de hombres que trabajan: " + promedioSueldosHombresTrabajan);
        System.out.println("g) Sueldo promedio de mujeres que trabajan: " + promedioSueldosMujeresTrabajan);
    }
}
