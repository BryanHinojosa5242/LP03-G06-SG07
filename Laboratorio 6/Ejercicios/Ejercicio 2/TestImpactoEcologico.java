package testimpactoecologico;

import java.util.ArrayList;

public class TestImpactoEcologico {

    public static void main(String[] args) {
        // objeto de las tres clases
        Edificio edificio = new Edificio(1000); 
        Auto auto = new Auto(3000);
        Bicicleta bicicleta = new Bicicleta(4.2);

        // ArrayList
        ArrayList<ImpactoEcologico> objetosImpacto = new ArrayList<>();
        objetosImpacto.add(edificio);
        objetosImpacto.add(auto);
        objetosImpacto.add(bicicleta);

        // iteracion
        for (ImpactoEcologico objetoIE : objetosImpacto) {
            System.out.println(objetoIE.toString());

            // muestra el impacto ecologico de cada objeto
            double impactoEcologico = objetoIE.obtenerImpactoEcologico();
            System.out.printf("%s%,.3f%s\n","Impacto ecologico: ", impactoEcologico, " GEI");
            System.out.println();
        }
    }
}
