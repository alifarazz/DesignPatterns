package filterPattern;

public class Person {

    private String name;
    private String gender;
    private String martialStatus;
    
    public Person(String name, String gender, String martialStatus){
        this.name = name;
        this.gender = gender;
        this.martialStatus = martialStatus;
    }
    
    public String getName(){
        return name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getMartialStatus(){
        return martialStatus;
    }
}
