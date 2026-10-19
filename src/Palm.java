public class Palm extends Plant{ // arv från Plant

    //Constructor
    public Palm(String name, double height, WaterType waterType) {
        super(name, height, waterType);
    }
    //Abstracts
    @Override
     public double waterAmount() {// 0,5L per day * length
        return 0.5 * this.getHeight();
    }

    // Polymorphism
    @Override
    public String waterInstructions(){ // Lägger till Palmen och kallar sedan på Plant.waterInstructions
        return "Palmen " + super.waterInstructions();
    }


}
