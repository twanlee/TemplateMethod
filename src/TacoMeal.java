public class TacoMeal extends Meal{
    @Override
    public void prepareIngridient() {
        System.out.println("Prepare Taco");
    }

    @Override
    public void cook() {
        System.out.println("Cook Taco");
    }

    @Override
    public void cleanUp() {
        System.out.println("Wash Dishes ... ");
    }
}
