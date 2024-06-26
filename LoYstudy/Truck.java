// 인터페이스 BaeMin 선언 추상 메소드와 상수만을 포함 가능
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
    public abstract void speedUp(); // 하위클래스에서 사용하려면 반드시 무조건 오버라이딩 해야함
}
//추상클래스는 일반 메소드도 포함 할 수 있음
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
public class Truck extends Car implements BaeMin { // Truck은 Car의 내용을 포함하고 있음
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
        System.out.println("트럭의 속도 " + myTruck.velocity); // 트럭의 속도 130 출력 오버라이딩으로 30을 덮어썼기에 100+30 의 값이 나옴

        // Car 타입의 참조 변수를 통해 Truck 객체 참조(포인터)
        Car myCar = myTruck; // 업캐스팅
        myCar.speedUp(); // 동적바인딩(객체를 따라감)
        System.out.println("트럭의 속도 " + myCar.velocity); // 트럭의 속도 160 출력 위에서 speedup의 30이 호출돼서 130인 상태로 다시 한 번 호출 됐으므로 160이 나옴

        // myCar.warn(); // Wran은 Truck에 있는 메소드라 불가능함 동적바인딩은 오버라이딩된거만 접근 가능함 나머지는 접근 불가능

        // 인터페이스를 통한 다형성 예시
        BaeMin myBaeMin = new Cycle();
        myBaeMin.deliver(); // 자전거로 배달합니다. 출력
        myBaeMin = myTruck;
        myBaeMin.deliver(); // 바로 위와 형태가 같지만 다르게 동작함 이게 다형성
    } 
} // 자바의 업캐스팅은 무조건 동적바인딩
//정적바인딩은 문장을 따라감
//다형성에는 업캐스팅 동적바인딩  오버라이딩이 포함되야한다
