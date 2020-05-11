public class Main {
    public static void main(String[] args) {
        Meal meal1 = new HumburgerMeal();
        meal1.doMeal();
        System.out.println("===========");
        Meal meal2 = new TacoMeal();
        meal1.doMeal();

    }
}
