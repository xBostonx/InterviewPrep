package firstTask;

public class PersonBuilder {
    private Person person = new Person();

    public Person getPerson() {
        return person;
    }

    public PersonBuilder addFirstName(String firstName) {
        this.person.setFirstName(firstName);
        return this;
    }

    public PersonBuilder addLastName(String lastName) {
        this.person.setLastName(lastName);
        return this;
    }

    public PersonBuilder addMiddleName(String middleName) {
        this.person.setMiddleName(middleName);
        return this;
    }

    public PersonBuilder addCountry(String country) {
        this.person.setCountry(country);
        return this;
    }

    public PersonBuilder addAddress(String address) {
        this.person.setAddress(address);
        return this;
    }

    public PersonBuilder addPhone(String phone) {
        this.person.setPhone(phone);
        return this;
    }

    public PersonBuilder addAge(int age) {
        this.person.setAge(age);
        return this;
    }

    public PersonBuilder addGender(String gender) {
        this.person.setGender(gender);
        return this;
    }
}
