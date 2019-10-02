class Main{
    public static void main(String[] args){
        // ChocolateBoiler boiler = new ChocolateBoiler();
        // boiler.boil(); // can't boil

        // boiler.fill();
        // boiler.fill(); // can't fill

        // boiler.drain(); // can't drain
        
        // boiler.boil();
        Thread t1 = new Thread(new SimpleThread("Hi, I am Thread1"));
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread is handled by default handler.");
        }
        Thread t2 = new Thread(new SimpleThread("Hi, I am Thread2"));
        t2.start();
    }
}
