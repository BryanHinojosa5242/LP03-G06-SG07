package lab07;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LeerEntrada {
    private Reader stream;
    
    /**
     *
     * @param fuente
     */
    public LeerEntrada(InputStream fuente) {
        stream = new InputStreamReader(fuente);
    }
    
    public char getChar() throws IOException {
        return (char) this.stream.read();
    }
}
