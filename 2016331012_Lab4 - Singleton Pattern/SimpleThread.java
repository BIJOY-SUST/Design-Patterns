class SimpleThread implements Runnable {
    String NewName;

    SimpleThread(String name) {
        NewName = name;
    }

    public void run() {
        ChocolateBoiler boiler = ChocolateBoiler.getUniqueInstance();
        System.out.println(NewName + " " + boiler);
        boiler.fill();
    }

}
