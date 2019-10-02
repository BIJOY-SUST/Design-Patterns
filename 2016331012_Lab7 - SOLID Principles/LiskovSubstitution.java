/**
 * LiskovSubstitution
 */

class People{
    public String eat(){
        return "I can eat.";
    }
}

class Dancer extends People {

    public String dance() {
        return "I can dance.";
    }
}

class NonDancer extends People {

    public String dontDance() {
        return "I can't Dance";
    }
}


public class LiskovSubstitution {

    public static void main(String[] args) {
        Dancer dancer = new Dancer();
        System.out.println("Dancer is saying : ");
        System.out.println(dancer.eat());
        System.out.println(dancer.dance());

        NonDancer nonDancer = new NonDancer();
        System.out.println("Non Dancer is saying : ");
        System.out.println(nonDancer.eat());
        System.out.println(nonDancer.dontDance());
    }
    
}