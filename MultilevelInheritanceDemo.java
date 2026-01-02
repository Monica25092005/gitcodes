// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Grandchild class (inherits Dog)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();   // from Animal class
        p.bark();  // from Dog class
        p.weep();  // from Puppy class
    }
}

