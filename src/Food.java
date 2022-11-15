public class Food {
    String name;
    public Food(String name, String taste, String ingredient) {
        this.name = name;
        this.taste = taste;
        this.ingredient = ingredient;
    }
    String taste;
    String ingredient;
    public static String minus(String name){
        return name;
    }
    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", ingredient='" + ingredient + '\'' +
                '}';
    }
    public static String plus(String name){
        return name;
    }
}