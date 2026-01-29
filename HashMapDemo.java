import java.util.*;

// Step 1: Define the Person class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // Override equals() to compare content
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.name.equals(other.name);
    }

    // Override hashCode() to match equals()
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

// Step 2: Use Person in HashMap
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();

        Person p1 = new Person("Alice");
        Person p2 = new Person("Alice");

        map.put(p1, "Developer");

        // Test retrieval
        System.out.println("p1 == p2: " + (p1 == p2));              // false (different objects)
        System.out.println("p1.equals(p2): " + p1.equals(p2));      // true (same content)
        System.out.println("map.get(p2): " + map.get(p2));          // "Developer" (works because hashCode matches)
    }
}
