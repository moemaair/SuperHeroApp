import java.util.ArrayList;


public class Squad {

    private String name;
    private String cause;
    private int maxMembers;

    private int id;
    private static ArrayList<Squad> instances = new ArrayList<>();

    public Squad(String name, String cause, int maxMembers) {
        this.name = name;
        this.maxMembers = maxMembers;
        this.cause = cause;
        instances.add(this);
        this.id = instances.size();
    }

    public String getName() {
        return name;
    }


    public String getCause() {
        return cause;
    }

    public int getMaxMembers() {
        return maxMembers;
    }

    public static ArrayList<Squad> getInstances() {
        return instances;
    }



    public int getId() {
        return id;
    }

    public static Squad findById(int id){
        return instances.get(id-1);
    }


}




