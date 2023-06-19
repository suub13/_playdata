package sec01.exam01;

public class ClassCastException {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat); // 여기서 Dog으로 캐스팅 하지만 Cat은 Dog으로 캐스팅 될 수 없다.
        // Cat -> Animal -> Cat (xxxxx)
    }

    public static void changeDog(Animal animal){
//        if (animal instanceof Dog){
            Dog dog = (Dog)animal;
//        }
    }
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
