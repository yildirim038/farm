package hicoders.farm.controller.types;

public class childWorker implements Workers{
    private int hourlyCost = 10;
    public int calculatePrice(int weeklyWork){
        return this.hourlyCost * weeklyWork;
    }
}
