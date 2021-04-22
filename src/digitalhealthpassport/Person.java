package digitalhealthpassport;

public class Person {

    private String healthCard;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private int age;
    private String email;
    private String address;
    private String city;
    private Vaccine vaccineSet;

    public Person(String healthCard, String firstName, String lastName, int phoneNumber, int age, String email, String address, String city, Vaccine vaccineSet) {
        this.healthCard = healthCard;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
        this.address = address;
        this.city = city;
        this.vaccineSet = vaccineSet;
    }

    public Person() {
    }
    
    
    Person krista = new Person();
    
}