public class mmain{
    public static void main(String[] args) {
        Beverage bvr = new darkRoast();

        bvr = new Mocha(bvr);
        bvr = new Mocha(bvr);
        bvr = new Sugar(bvr);

        System.out.println("Total Cost "+ bvr.cost());
        System.out.println("Description : "+ bvr.getDesp()+".");
    }
}