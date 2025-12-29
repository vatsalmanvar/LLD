package LLDPatterns.Builder;

public class Builder {

    public static void execute(){
        Person person = new Person.PersonBuilder()
                .setName("John Doe")
                .setAge(30)
                .setAddress("123 Main St")
                .setPhoneNumber("555-1234")
                .build();

        System.out.println("Person created: " + person.name + ", Age: " + person.age +
                ", Address: " + person.address + ", Phone: " + person.phoneNumber);
    }
}
