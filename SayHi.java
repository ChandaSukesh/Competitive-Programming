// Write a class called Dog that has two properties: name and age. 
//Write a constructor that takes three arguments self, name and age and set these to the object properties.
// Now write a function sayHI(dog) where dog is the dog class object that returns a Hi, 
//my name is <dog’s name> and I am <age> years old!

// sayHi(d1) # Hi, my name is Dot and I am 4 years old!
// sayHi(d2) # Hi, my name is Elf and I am 3 years old!


public class SayHi {
    public static void main(String args[])
    {
        Dog e=new Dog();
        e.set("Dog",4);
        Dog f=new Dog();
        f.set("Elf",3);
        System.out.println("Hi, my name is " + e.name + " and I am " + e.age + " years old!");
        System.out.println("Hi, my name is " + f.name + " and I am " + f.age + " years old!");
    }
}

class Dog
{ 
    String name="";
    int age=0;
    void set(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
   
}