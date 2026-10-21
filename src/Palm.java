public class Palm extends Plant{ // arv från Plant
    static final double MULTIPLIER =0.5;
    //Constructor
    public Palm(String name, double height, WaterType waterType) {
        super(name, height, waterType);

    }
    //Abstracts
    @Override
     public double waterAmount() {// 0,5L per day * length
        return MULTIPLIER * this.getHeight();
    }

    // Polymorphism
    @Override
    public String waterInstructions(){ // Lägger till Palmen och kallar sedan på Plant.waterInstructions
        return "Palmen " + super.waterInstructions();
    }


}
