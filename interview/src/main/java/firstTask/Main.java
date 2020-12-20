package firstTask;

public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        builder.addFirstName("Sam")
                .addLastName("Fisher")
                .addAge(41)
                .addCountry("Bolivia")
                .addGender("M")
                .addPhone("666");
        Person person = builder.getPerson();

        System.out.println(person.toString());
        System.out.println(person.getFirstName() + "\n" +
                person.getLastName() + "\n" +
                person.getCountry());
    }
}
