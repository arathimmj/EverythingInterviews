abstract public class abstractClass {

    abstract void abstractMethod();
}

class extendedClass extends abstractClass{

//    @Override
    void abstractMethod() {
        System.out.println("Inside abstract method");
    }
}

class mainClass{
    public static void main(String[] args) {
        abstractClass abc = new extendedClass();
        abc.abstractMethod();
    }
}
