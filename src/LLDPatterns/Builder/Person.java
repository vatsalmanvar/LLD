package LLDPatterns.Builder;

public class Person {
    String name;
    int age;
    String address;
    String phoneNumber;

    public Person(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static class PersonBuilder {
        String name;
        int age;
        String address;
        String phoneNumber;

        public PersonBuilder setName(String name){
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public PersonBuilder setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build(){
            return new Person(name, age, address, phoneNumber);
        }
    }
}
