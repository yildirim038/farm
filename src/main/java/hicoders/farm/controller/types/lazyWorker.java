package hicoders.farm.controller.types;

public class lazyWorker implements Workers {
    private int hourlyCost = 23;
    public int calculatePrice(int weeklyWork){
        return this.hourlyCost * weeklyWork;
    }
}
