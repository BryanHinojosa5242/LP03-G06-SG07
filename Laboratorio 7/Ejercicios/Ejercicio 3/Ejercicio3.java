package lab07;

public class Ejercicio3 {
    public static void main(String[] args) {
        LeerCaracteres lector = new LeerCaracteres(System.in);
        try {
                lector.procesar();
        } catch (ExcepcionVocal e) {
            System.out.println("Se ha leido una vocal");
        } catch (ExcepcionNumero e) {
            System.out.println("Se ha leido un numero");
        } catch (ExcepcionBlanco e) {
            System.out.println("Se ha leido un caracter blanco");
        } catch (ExcepcionSalida e) {
            System.out.println("Fin de la entrada");
        }
    }
}
