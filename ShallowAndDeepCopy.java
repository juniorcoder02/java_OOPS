public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        Address address = new Address("New York");

        // Original Person object with initial Address
        Person originalPerson = new Person("Alice", address);

        // Shallow Copy: Copies the reference of Address (no new Address object created)
        Person shallowCopyPerson = new Person(originalPerson, true);

        // Deep Copy: Creates a completely independent copy of originalPerson
        Person deepCopyPerson = new Person(originalPerson);

        // Lazy Copy: Initially shallow, but can turn into a deep copy when modified
        Person lazyCopyPerson = new Person(originalPerson, true);

        // Modifying the Address in the shallow copy
        shallowCopyPerson.address.city = "Los Angeles";

        System.out.println("After modifying shallowCopyPerson's city:");
        System.out.println("Original Person's city: " + originalPerson.address.city); // Affected by shallow copy change
        System.out.println("Shallow Copy Person's city: " + shallowCopyPerson.address.city);

        // Modifying the Address in the deep copy
        deepCopyPerson.address.city = "Chicago";

        System.out.println("\nAfter modifying deepCopyPerson's city:");
        System.out.println("Original Person's city: " + originalPerson.address.city); // Unaffected by deep copy change
        System.out.println("Deep Copy Person's city: " + deepCopyPerson.address.city);

        // Modifying Address in lazy copy triggers a deep copy (no shared reference
        // after change)
        lazyCopyPerson.lazySetCity("San Francisco");

        System.out.println("\nAfter modifying lazyCopyPerson's city:");
        System.out.println("Original Person's city: " + originalPerson.address.city); // Unaffected by lazy copy change
        System.out.println("Lazy Copy Person's city: " + lazyCopyPerson.address.city);
    }
}

class Address {
    String city;

    // Constructor to initialize Address
    Address(String city) {
        this.city = city;
    }

    // Deep copy constructor for Address
    Address(Address other) {
        this.city = other.city;
    }
}

class Person {
    String name;
    Address address;

    // Constructor to initialize Person with a name and an Address object
    Person(String name, Address address) {
        this.name = name;
        this.address = address; // Assigning reference of address (no new object created)
    }

    // Shallow copy constructor: Only copies reference of 'address'
    Person(Person other, boolean shallowCopy) {
        if (shallowCopy) {
            this.name = other.name;
            this.address = other.address; // Shallow copy (same reference as 'other')
        }
    }

    // Deep copy constructor: Creates a new Address object (completely independent)
    Person(Person other) {
        this.name = other.name;
        this.address = new Address(other.address); // Deep copy (new Address object)
    }

    // Lazy copy method to switch from shallow to deep copy when modification occurs
    public void lazySetCity(String newCity) {
        if (this.address.city != newCity) { // Check if modification is required
            this.address = new Address(this.address); // Create a deep copy only if needed
        }
        this.address.city = newCity;
    }
}