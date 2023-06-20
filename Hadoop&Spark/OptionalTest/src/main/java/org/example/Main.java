package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//기본생성자, 매개변수생성저, setter/getter, toString 오버라이드
class Person
{
    String name;
    int age;
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class House{
    private Person owner;
    private String address;
    public House() {
    }
    public House(Person owner, String address) {
        this.owner = owner;
        this.address = address;
    }
    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "House{" +
                "owner=" + owner +
                ", address='" + address + '\'' +
                '}';
    }
}
class HouseService
{
    List<House> houseList = new ArrayList<House>();
    public HouseService() {
        houseList.add( new House(null, "광진구"));
        houseList.add( new House(new Person("홍길동", 23), "서울시"));
        houseList.add( new House(new Person(),  "부산시"));
        houseList.add( new House(null,  "관악구"));
    }
}
public class Main {
    public static void main(String[] args) {
        HouseService service = new HouseService();
        for(int i=0; i<service.houseList.size();i++){
            House house = service.houseList.get(i);
            if(house.getOwner()!=null)
                System.out.println(house);
            if(house.getOwner()!=null && house.getOwner().getName()!=null)
                System.out.println(house);
        }
        System.out.println("----------------------------------------------");
        for(int i=0; i<service.houseList.size();i++){
            House house = service.houseList.get(i);
//            Optional.of(house).map(House::getOwner)
//                    .map(Person::getName)
//                    .ifPresent(System.out::println);
//            String ownerName = Optional.of(house).map(House::getOwner)
//                    .map(Person::getName)[0];
        }
    }
}