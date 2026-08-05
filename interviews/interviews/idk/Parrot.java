class Bird {
    public void Eat() {
        System.out.println("This bird can eat.");
    }

    public void fly() {
        System.out.println("This bird can fly.");
    }
}
public class Parrot extends Bird {
}

class Penguin extends Bird {
    @Override
    public void fly() {
//        throw new Exception("Penguins cannot fly");
    }
}