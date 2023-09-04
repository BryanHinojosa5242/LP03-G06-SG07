package fecha;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }
    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }
    
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
        valida();
    }
    
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
        valida();
    }
    
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
        valida();
    }
    
    public void leer() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el dia(1 a 31): ");
        int dia = entrada.nextInt();
        System.out.print("Ingrese el mes(1 a 12): ");
        int mes = entrada.nextInt();
        System.out.print("Ingrese el año(1 a 2050): ");
        int anio = entrada.nextInt();
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }
    public void bisiesto() {
        if(anio%4 == 0 && (anio%100 != 0 || anio%400 == 0)) {
            System.out.println("El año es bisiesto");
        }
        else {
            System.out.println("El año no es bisiesto");
        }
    }
    
    public int diaMes(int mes) {
        switch(mes) {
            case 1:
                return 31;
            case 2:
                if(anio%4 == 0 && (anio%100 != 0 || anio%400 == 0)) {
                    return 29;
                }
                else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return 0;
    }
    
    private void valida() {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (anio%4 == 0 && (anio%100 != 0 || anio%400 == 0)) {
            diasPorMes[2] = 29;
        }
        if (dia < 1 || dia > diasPorMes[mes]) {
            dia = 1;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (anio < 1900 || anio > 2050) {
            anio = 1900;
        }
    }
    
    public void corta() {
        System.out.println(dia+"-"+mes+"-"+anio);
    }
    
    public int diasTranscurridos() {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDias = 0;

        for (int anioActual = 1900; anioActual < this.anio; anioActual++) { // bucle for, cuenta los dias desde 1900 hasta el año actual
            if (anioActual%4 == 0 && (anioActual%100 != 0 || anioActual%400 == 0)) {
                totalDias += 366; // año bisiesto
            }
            else {
                totalDias += 365; // año no bisiesto
            }
        }

        for (int mesActual = 1; mesActual < this.mes; mesActual++) { // cuenta los dias transcurridos del año actual
            totalDias += diasPorMes[mesActual];

            if (mesActual == 2 && (this.anio % 4 == 0 && (this.anio % 100 != 0 || this.anio % 400 == 0))) {
                totalDias++; // febrero en año bisiesto
            }
        }
        return totalDias;
    }
    
    public String diaSemana() {
        String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDias = 0;

        // sumar días de años anteriores
        for (int anioActual = 1900; anioActual < this.anio; anioActual++) {
            if (anioActual%4 == 0 && (anioActual%100 != 0 || anioActual%400 == 0)) {
                totalDias += 366; // año bisiesto
            }
            else {
                totalDias += 365; // año no bisiesto
            }
        }

        for (int mesActual = 1; mesActual < this.mes; mesActual++) { // cuenta los dias transcurridos del año actual
            totalDias += diasPorMes[mesActual];

            if (mesActual == 2 && (this.anio % 4 == 0 && (this.anio % 100 != 0 || this.anio % 400 == 0))) {
                totalDias++; // febrero en año bisiesto
            }

        }
        totalDias += this.dia;
        // calcular el día de la semana
        int diaSemana = totalDias % 7;
        return diasSemana[diaSemana];
    }
    
    public void larga() {
        String[] nombreMeses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println(diaSemana() + " " + this.dia + " de " + nombreMeses[this.mes] + " de " + this.anio);
    }
    
    public void fechaTras(long diasTranscurridos) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int anioActual = 1900;
        int mesActual = 1;
        int diaActual = 1;

        while (diasTranscurridos > 0) {
            int diasEnElMes = diasPorMes[mesActual];

            if (mesActual == 2 && this.anio % 4 == 0 && (this.anio % 100 != 0 || this.anio % 400 == 0)) {
                diasEnElMes = 29; 
            }

            if (diasTranscurridos >= diasEnElMes - diaActual + 1) {
                // avanzar al siguiente mes
                diasTranscurridos -= (diasEnElMes - diaActual + 1);
                diaActual = 1;
                if (mesActual < 12) {
                    mesActual++;
                }
                else {
                    mesActual = 1;
                    anioActual++;
                }
            }
            else {
                // establecer el día dentro del mes actual
                diaActual += diasTranscurridos;
                break;
            }
        }

        this.dia = diaActual;
        this.mes = mesActual;
        this.anio = anioActual;
    }
    
    public int diasEntre(Fecha otraFecha) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // asegurarse de que la fecha actual sea anterior a la otraFecha
        if (this.anio > otraFecha.anio || (this.anio == otraFecha.anio && this.mes > otraFecha.mes) || (this.anio == otraFecha.anio && this.mes == otraFecha.mes && this.dia > otraFecha.dia)) {
            Fecha temp = this;
            this.anio = otraFecha.anio;
            this.mes = otraFecha.mes;
            this.dia = otraFecha.dia;
            otraFecha = temp;
        }

        int diasTranscurridos = 0;

        while (this.anio < otraFecha.anio || (this.anio == otraFecha.anio && this.mes < otraFecha.mes) || (this.anio == otraFecha.anio && this.mes == otraFecha.mes && this.dia < otraFecha.dia)) {
            int diasEnElMes = diasPorMes[this.mes];

            if (this.mes == 2 && this.anio % 4 == 0 && (this.anio % 100 != 0 || this.anio % 400 == 0)) {
                diasEnElMes = 29;
            }

            diasTranscurridos += (diasEnElMes - this.dia + 1);

            this.dia = 1;
            if (this.mes < 12) {
                this.mes++;
            }
            else {
                this.mes = 1;
                this.anio++;
            }
        }

        diasTranscurridos += (otraFecha.dia - this.dia);

        return diasTranscurridos;
    }
    
    public void siguiente() {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (this.anio % 4 == 0 && (this.anio % 100 != 0 || this.anio % 400 == 0)) {
            diasPorMes[2] = 29; // febrero tiene 29 días en años bisiestos
        }

        if (this.dia < diasPorMes[this.mes]) {
            this.dia++;
        } 
        else {
            // si es el último día del mes, avanzar al siguiente mes
            this.dia = 1;
            
            if (this.mes < 12) {
                this.mes++;
            } 
            else {
                // si es diciembre, avanzar al siguiente año
                this.mes = 1;
                this.anio++;
            }
        }
    }
    
    public void anterior() {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (this.anio % 4 == 0 && (this.anio % 100 != 0 || this.anio % 400 == 0)) {
            diasPorMes[2] = 29;
        }

        if (this.dia > 1) {
            this.dia--;
        } 
        else {
            // si es el primer día del mes, retroceder al mes anterior
            if (this.mes > 1) {
                this.mes--;
            } 
            else {
                // si es enero, retroceder al último día de diciembre del año anterior
                this.mes = 12;
                this.anio--;
            }

            // establecer el día al último día del mes actual
            this.dia = diasPorMes[this.mes];
        }
    }
    
    public void fechaFutura(long diasTranscurridos) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (this.anio % 4 == 0 && (this.anio % 100 != 0 || this.anio % 400 == 0)) {
            diasPorMes[2] = 29;
        }
        while (diasTranscurridos > 0) {
            int diasEnElMes = diasPorMes[this.mes];

            if (this.mes == 2 && this.anio % 4 == 0 && (this.anio % 100 != 0 || this.anio % 400 == 0)) {
                diasEnElMes = 29;
            }

            if (diasTranscurridos >= (diasEnElMes - this.dia + 1)) {
                // avanzar al siguiente mes
                diasTranscurridos -= (diasEnElMes - this.dia + 1);
                this.dia = 1;
                if (this.mes < 12) {
                    this.mes++;
                } 
                else {
                    // avanzar al siguiente año
                    this.mes = 1;
                    this.anio++;
                }
            } 
            else {
                // agregar los días restantes al día actual
                this.dia += diasTranscurridos;
                diasTranscurridos = 0; // salir del bucle
            }
        }
    }
    
    public Fecha copia() {
        return new Fecha(dia,mes,anio);
    }
    
    public static boolean igualQue(Fecha fecha1, Fecha fecha2) {
        return (fecha1.getDia() == fecha2.getDia()) && (fecha1.getMes() == fecha2.getMes()) && (fecha1.getAnio() == fecha2.getAnio());
    }
    
    public static boolean menorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.getAnio() < fecha2.getAnio()) { // compara los años
            return true;
        } else if (fecha1.getAnio() == fecha2.getAnio() && fecha1.getMes() < fecha2.getMes()) {  // compara los meses
            return true;
        } else if (fecha1.getAnio() == fecha2.getAnio() && fecha1.getMes() == fecha2.getMes() && fecha1.getDia() < fecha2.getDia()) { // compara los dias
            return true;
        }
        return false;
    }
    
    public static boolean mayorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.getAnio() > fecha2.getAnio()) { // compara los años
            return true;
        } else if (fecha1.getAnio() == fecha2.getAnio() && fecha1.getMes() > fecha2.getMes()) {  // compara los meses
            return true;
        } else if (fecha1.getAnio() == fecha2.getAnio() && fecha1.getMes() == fecha2.getMes() && fecha1.getDia() > fecha2.getDia()) { // compara los dias
            return true;
        }
        return false;
    }
}
