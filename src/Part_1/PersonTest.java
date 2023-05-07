package Part_1;

public class PersonTest {
    public static void main(String[] args) {
        Person alice = new Person("Alice", 2000);
        Person bob = new Person("Bob", 1995);
        Person charlie = new Person("Charlie", 2005);

        System.out.println(alice.compareTo(bob)); // Output: 1 (alice's birth year is greater than Bob's)
        System.out.println(bob.compareTo(alice)); // Output: -1 (Bob's birth year is less than alice's)
        System.out.println(alice.compareTo(charlie)); // Output: -1 (alice's birth year is less than charlie's)
        System.out.println(alice.compareTo(alice)); // Output: 0 (alice's birth year is equal to alice's)
    }
}

