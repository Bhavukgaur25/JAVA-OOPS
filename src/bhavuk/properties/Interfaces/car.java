package bhavuk.properties.Interfaces;

public class car implements Engine,Brake{
    @Override
    public void brake() {
        System.out.println("car brake and immediately stops");
    }

    @Override
    public void start() {
        System.out.println("Strat the car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Acceleratae the engine");

    }
}
