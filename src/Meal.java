public abstract class Meal {
    public final void doMeal(){
        prepareIngridient();
        cook();
        eat();
        cleanUp();
    }
    public abstract void prepareIngridient();
    public abstract void cook();
    public  void eat(){
        System.out.println("That's tasty!!!! ");
    };
    public abstract void cleanUp();
}
