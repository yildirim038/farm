package hicoders.farm.controller.types;

public class goodWorker implements Workers{
        private int hourlyCost = 40;
        public int calculatePrice(int weeklyWork){
            return this.hourlyCost * weeklyWork;
        }
}


