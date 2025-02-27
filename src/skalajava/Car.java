package skalajava;

public class Car {
    // 객체 변수 생성
    private String brand;
    public String color;
    public String description;

    // 생성자 생성
    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    // 메서드 생성
    public String getInfo() {
        return "차의 브랜드는" + brand + "이고 색상은" + color + " 입니다.";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Car volvoCar = new Car("volvo", "white");
        Car teslaCar = new Car("tesla", "yellow");

        System.out.println(volvoCar.getInfo());
        System.out.println(teslaCar.getInfo());

        volvoCar.setColor("red");

        System.out.println(volvoCar.getInfo());
    }
}
