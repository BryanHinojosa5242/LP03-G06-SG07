package fecha;

public class Principal {
   
    public static void main(String[] args) {
        // creamos instancia
        Fecha fecha1 = new Fecha();
        System.out.println("Fecha por defecto:");
        fecha1.corta(); // muestra fecha en corto
        
        // crea instancia enviando parametros
        Fecha fecha2 = new Fecha(30, 8, 2023);
        System.out.println("\nFecha personalizada:");
        fecha2.corta(); // fecha en corto
        fecha2.bisiesto(); // verifica si es bisiesto
        System.out.println("Dia de la semana: " + fecha2.diaSemana()); // calcula el día de la semana
        fecha2.larga(); // fecha en formato largo
        
        // utilizamos el metodo para avanzar al siguiente dia
        System.out.println("\nAvanzar un dia:");
        fecha2.siguiente();
        fecha2.corta();
        
        // utilizamos el metodo para retroceder al siguiente dia
        System.out.println("\nRetroceder un dia:");
        fecha2.anterior();
        fecha2.corta();
        
        // utilizamos el metodo fechaTras para establecer una fecha en el futuro
        System.out.println("\nFecha tras 30 dias:");
        fecha2.fechaTras(30);
        fecha2.corta();
        
        // utilizamos el metodo copia para crear una copia de la fecha
        System.out.println("\nCopia de fecha2:");
        Fecha copiaFecha2 = fecha2.copia();
        copiaFecha2.corta();
        
        // utilizamos el metodo igualQue
        System.out.println("\nComparar fecha2 con copiaFecha2:");
        boolean sonIguales = Fecha.igualQue(fecha2, copiaFecha2);
        System.out.println("Son iguales? " + sonIguales);
        
        // utilizamos el método menorQue
        System.out.println("\nComparar fecha1 y fecha2:");
        boolean esMenor = Fecha.menorQue(fecha1, fecha2);
        System.out.println("fecha1 es menor que fecha2? " + esMenor);
    }
    
}
