package This;

public class Dog {
    private String name;
    private String breed;
    private int age;

    // default (no-argument) constructor = Kaan default
    public Dog() {}

    // the constructor - creates a Dog object and initialize its attributes 
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // accessor methods 
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    // mutator methods 
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
            /*  checks if the current object (this) is the same as the object being 
            compared (obj) by comparing their references (memory addresses).  */ 
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
            /*  if the obj parameter is null  it cannot be equal to any object so we would retrun false.
            getClass() != obj.getClass() checks if the class of this object is not the same as the class of obj. 
            If they belong to different classes, they cannot be equal, so we return false to indicate inequality.  */
            
        }
        Dog otherDog = (Dog) obj;
        /*  This line performs a type cast of obj to a Dog reference and assigns it to a variable named otherDog. 
        This cast assumes that obj is indeed a Dog object. If it's not, a ClassCastException will be thrown at runtime. 
        However, we've already checked the class type with getClass() != obj.getClass() to minimize this risk.  */ 

        return age == otherDog.age && name.equals(otherDog.name) && breed.equals(otherDog.breed);
        /* this compares the attributes of the current Dog object with the attributes of otherDog. In the age 
        attribute "==" is used as it is type int while .equals is used as the attribute is type String. */ 
    }
}


