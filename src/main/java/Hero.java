import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private String specialPower;
    private  String weakness;
    private static ArrayList<Hero> instances = new ArrayList<Hero>();
    private int Id;

    public Hero(String name, int age, String specialPower, String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        instances.add(this);
        Id = instances.size();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }

    public static ArrayList<Hero> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public int getId()
    {
        return Id;
    }

    public static Hero find(int id) {
        return instances.get(id - 1);
    }


}
