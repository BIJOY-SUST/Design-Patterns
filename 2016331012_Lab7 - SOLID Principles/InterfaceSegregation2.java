interface Athlete {

    public String compete(String atheleteName);

}

interface Swimmers extends Athlete {

    public String swim();

}

interface Racers extends Athlete {

    public String relayRace();

    public String sprint();

    public String fourHunderedMeters();

    public String eightHundredMeters();
}

interface Jumpers extends Athlete {

    public String longJump();

    public String highJump();

}

class Jumping implements Athlete, Jumpers {

    @Override
    public String longJump() {
        return "in long jump.";
    }

    @Override
    public String highJump() {
        return "in high jump.";
    }

    @Override
    public String compete(String atheleteName) {
        return atheleteName + " started competing ";
    }

}

class Racing implements Athlete, Racers {

    @Override
    public String relayRace() {
        return "in relay racing.";
    }

    @Override
    public String sprint() {
        return "in sprint.";
    }

    @Override
    public String fourHunderedMeters() {
        return "in 400 meters race.";
    }

    @Override
    public String eightHundredMeters() {
        return "in 800 meters race.";
    }

    @Override
    public String compete(String atheleteName) {
        return atheleteName + " strated competing ";
    }

}

class Swimming implements Athlete, Swimmers {

    @Override
    public String swim() {
        return "in swimming.";
    }

    @Override
    public String compete(String atheleteName) {
        return atheleteName + " started competing ";
    }

}

/**
 * InterfaceSegregation - 2
 */
public class InterfaceSegregation2 {

    public static void main(String[] args) {
        Jumping jumping = new Jumping();
        System.out.println("Jumping tournament has been started.");
        System.out.println(jumping.compete("Aman") + jumping.longJump());

        Racing racing = new Racing();
        System.out.println("Racing tournament has been started.");
        System.out.println(racing.compete("Aman") + racing.sprint());

        Swimming swimming = new Swimming();
        System.out.println("Swimming tournament has been started.");
        System.out.println(swimming.compete("Aman") + swimming.swim());
    }

}