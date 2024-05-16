// 인터페이스 BaeMin 선언
interface BaeMin {
    // 배달 기능을 추상 메소드로 정의
    public void deliver();
}

// 추상 클래스 Vehicle 선언
abstract class Vehicle {
    // 속도와 바퀴 개수를 protected로 선언하여 하위 클래스에서 접근 가능하게 함
    protected int velocity;
    protected int wheelNum;
    public String carName;

    // 기본 생성자에서 바퀴 개수와 속도를 초기화
    public Vehicle() {
        wheelNum = 6; // 바퀴 개수 초기화
        velocity = 0; // 속도 초기화
    }

    // 차량 이름을 설정하는 메소드
    public void setCarName(String name) {
        carName = name;
    }

    // 하위 클래스에서 구현해야 하는 추상 메소드 speedUp
    public abstract void speedUp();
}

// Car 클래스 선언
class Car {
    // 속도와 바퀴 개수를 protected로 선언하여 하위 클래스에서 접근 가능하게 함
    protected int velocity;
    protected int wheelNum;
    protected String carName;

    // 기본 생성자에서 바퀴 개수와 속도를 초기화
    public Car() {
        wheelNum = 4; // 바퀴 개수 초기화
        velocity = 100; // 속도 초기화
    }

    // 속도를 증가시키는 메소드
    public void speedUp() {
        velocity++; // 속도를 1 증가시킴
    }
}

// Cycle 클래스 선언 및 BaeMin 인터페이스 구현
class Cycle implements BaeMin {
    int velocity;

    // BaeMin 인터페이스의 deliver 메소드 구현
    public void deliver() {
        System.out.println("자전거로 배달합니다.");
    }

    // Cycle 클래스의 speedUp 메소드
    public void speedUp() {
        velocity++; // 속도를 1 증가시킴
    }
}

// Truck 클래스 선언, Car 클래스를 상속받고 BaeMin 인터페이스를 구현
public class Truck extends Car implements BaeMin {
    // Car 클래스의 speedUp 메소드를 오버라이딩
    public void speedUp() {
        velocity += 30; // 속도를 30 증가시킴
    }

    // 경적을 울리는 메소드
    public void warn() {
        System.out.println("경적을 울림");
    }

    // BaeMin 인터페이스의 deliver 메소드 구현
    public void deliver() {
        System.out.println("트럭으로 배달합니다.");
    }

    // main 메소드 - 프로그램 실행의 시작점
    public static void main(String args[]) {
        // Truck 객체를 생성하여 다형성 예시
        Truck myTruck = new Truck();
        myTruck.speedUp();
        System.out.println("트럭의 속도 " + myTruck.velocity); // 트럭의 속도 130 출력

        // Car 타입의 참조 변수를 통해 Truck 객체 참조
        Car myCar = myTruck;
        myCar.speedUp();
        System.out.println("트럭의 속도 " + myCar.velocity); // 트럭의 속도 160 출력

        // myCar.warn(); // 컴파일 에러 - Car 타입에는 warn 메소드가 없음

        // 인터페이스를 통한 다형성 예시
        BaeMin myBaeMin = new Cycle();
        myBaeMin.deliver(); // 자전거로 배달합니다. 출력
        myBaeMin = myTruck;
        myBaeMin.deliver(); // 트럭으로 배달합니다. 출력
    }
}
