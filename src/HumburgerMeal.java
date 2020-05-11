public class HumburgerMeal extends Meal {
    @Override
    public void prepareIngridient() {
        System.out.println("Prepare ingredient...");
    }

    @Override
    public void cook() {
        System.out.println("Cook");
    }

    @Override
    public void cleanUp() {
        System.out.println("Wash dishes!!!");
    }
}
