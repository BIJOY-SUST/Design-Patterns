import java.util.Random;

class ChocolateBoiler {
    private boolean empty, boiled;

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    private long signature;

    private ChocolateBoiler() {
        System.out.println("Creating New Instance By Thread");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Thread is handled by default handler.");
        }
        empty = true;
        boiled = false;
        // Random ran = new Random(); // bad deya hoice
        signature = System.currentTimeMillis();
        System.out.println("created " + this);
    }

    private static ChocolateBoiler NewUniqueOBJ;

    public static synchronized ChocolateBoiler getUniqueInstance() {
        if (NewUniqueOBJ == null) {
            synchronized (ChocolateBoiler.class) {
                if (NewUniqueOBJ == null) {
                    System.out.println("Creating New Instance By Thread");
                    NewUniqueOBJ = new ChocolateBoiler();
                }
            }
        }
        return NewUniqueOBJ;
    }

    public String toString() {
        return "Boiler: <" + signature + ">";
    }

    public synchronized void fill() {
        if (isEmpty()) {
            System.out.println(this + "filling chocolate and milk");
            empty = false;
            boiled = false;
        } else {
            System.out.println(this + "Can't fill: Boiler not empty");
        }
    }

    public synchronized void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println(this + "0o.o0 boiling chocolate and milk");
            boiled = true;
        } else {
            if (isEmpty())
                System.out.println(this + "Can't boil: Boiler is empty");
            else
                System.out.println(this + "Can't boil: Already boiled");
        }
    }

    public synchronized void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println(this + "Draining chocolate bars");
            empty = true;
        } else {
            if (isEmpty())
                System.out.println(this + "Can't drain: Boiler is empty");
            else
                System.out.println(this + "Can't drain: Not boiled yet");
        }
    }
}