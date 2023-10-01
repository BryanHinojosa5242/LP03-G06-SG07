package testagregacion;

public class TestAgregacion {

    public static void main(String[] args) {
        Motor motor1 = new Motor(3,100);
        Motor motor2 = new Motor(5,130);
        
        Automovil auto = new Automovil("4DW1",4,"Toyota","23");
        Automovil camioneta = new Automovil("R21S",4,"Nissan","22");
        
        auto.setMotor(motor1);
        camioneta.setMotor(motor2);
        
        System.out.println(auto);
        System.out.println(camioneta);
    }
    
}

