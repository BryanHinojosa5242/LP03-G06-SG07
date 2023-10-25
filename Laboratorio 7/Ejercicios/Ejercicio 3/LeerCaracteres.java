package lab07;

import java.io.IOException;
import java.io.InputStream;

public class LeerCaracteres {

    private LeerEntrada entrada;

    public LeerCaracteres(InputStream fuente) {
        entrada = new LeerEntrada(fuente);
    }

    public void procesar() throws ExcepcionVocal, ExcepcionNumero, ExcepcionBlanco, ExcepcionSalida {
        char c;
        try {
            c = entrada.getChar();
        } catch (IOException e) {
            throw new ExcepcionSalida("Fin de la entrada");
        }

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                throw new ExcepcionVocal("Se ha leído una vocal");
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                throw new ExcepcionNumero("Se ha leído un número");
            case ' ':
            case '\t':
            case '\n':
                throw new ExcepcionBlanco("Se ha leído un carácter blanco");
            default:
                throw new ExcepcionSalida("Fin de la entrada");
        }
    }
}