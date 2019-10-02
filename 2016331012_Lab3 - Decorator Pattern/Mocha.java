class Mocha extends Condiments{

    Mocha(Beverage Bvr){
        this.bvr = Bvr;
        desp = bvr.getDesp() +", Mocha";
    }
    int cost(){
        return bvr.cost()+15;
    }

}