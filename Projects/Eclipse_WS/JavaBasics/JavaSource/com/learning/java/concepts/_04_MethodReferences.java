package com.java.eight.concepts;


@FunctionalInterface
interface ConstructorMethodReferenceDemo {
    void print(String message);
}

class MethodRefConstructor {

    private String msg;

    public MethodRefConstructor(String message) {
        System.out.println("This is being invoked " + message);
        this.msg = message;
    }

    public static void show() {

        //2. Method Reference -> Constructor
        ConstructorMethodReferenceDemo object = MethodRefConstructor::new;
        object.print("My Custom message");
    }

    public static void main(String[] args) {

    }

}


public class _04_MethodReferences {

    public static void main(String[] args) {
        _04_MethodReferences object = new _04_MethodReferences();
        //Lambda Expression
        Operate operate1 = (a, b, c) -> a * b * c;
        operate1.multiply(12, 3, 2);

        //1. Method Reference -> Instance Method
        Operate operate2 = object::performOperation;
        operate2.multiply(34, 5, 3);

        //2. Method Reference -> Static Method
        Operate operate3 = _04_MethodReferences::multiplyNumber;
        operate3.multiply(56, 2, 12);


        MethodRefConstructor.show();

    }

    static int multiplyNumber(int a, int b, int c) {
        System.out.println("This is multiplyNumbers ");
        return a * b * c;
    }

    int performOperation(int a, int b, int c) {
        System.out.println("This is performOperation ");
        return a * b * c;
    }

    @FunctionalInterface
    interface Operate {
        int multiply(int a, int b, int c);
    }


}
