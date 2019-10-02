class Sugar extends Condiments{

    Sugar(Beverage Bvr){
        this.bvr = Bvr;
        desp = bvr.getDesp() + ", Sugar";
    }
    int cost(){
        return bvr.cost()+10;
    }

}