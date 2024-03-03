import java.util.HashMap;

public class FamilyMember {

    public static HashMap<String, FamilyMember> instances= new HashMap<>();

    public FamilyMember(String firstName, String age) {
        this.firstName = firstName;
        this.age = age;
    }

    String firstName;
    String age;

    public static void getInstance(String firstName, String age){
        if(instances.get(firstName+age)==null){
            instances.put(firstName+age, new FamilyMember(firstName, age));
        }
        instances.get(firstName+age);
    }


}
