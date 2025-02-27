package skalajava;

// 추상 클래스 선언
abstract class Animal {
    String name;

    //생성자 생성
    public Animal(String name){
        this.name = name;
    }

    // 추상 메서드 (구현 필요)
    abstract void makeSound();

    // 일반 메서드
    public void eat(){
        System.out.println(name + "은 밥 먹는중...");
    }
}

// 서브 클래스 생성
class Dog extends Animal{
    
    //생성자
    public Dog(String name){
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("월월 짖었다.");
    }
    
    @Override
    public void eat(){
        System.out.printf("자식 메서드가 먹는중");
        super.eat();
    }
}
public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("킹율");
        dog.makeSound();
        dog.eat();

    }
}