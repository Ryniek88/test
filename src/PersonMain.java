public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(13);
        person.setFirstName("Adam");
        person.setLastName("");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getFullName());
        System.out.println(person.getAge());
        System.out.println(person.isTeen());

    }
}
