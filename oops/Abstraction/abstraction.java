package _11_OOPS.Abstraction;


abstract class Car{
    abstract void start();
    abstract void stop();

    void fuel(){
        System.out.println("Fueling the car");
    }
}

class Bike{
    public void start(){

    }
    public void stop(){

    }

    void fuel(){
        System.out.println("Fueling the car");
    }
}
class Hero extends Bike{
    
}

class Tesla extends Car{
    void start(){

    }

    void stop(){

    }
}



public class abstraction{
    public static void main(String[] args) {
        
    }
}
    



