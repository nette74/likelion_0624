public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1,100);
        Car car2 = new Car(2,150);
        SuperCar car3 = new SuperCar(3,200,"XRT-2235");
        car1.run();
        car2.run();
        car3.run();
    }
}
class Car{
    int speed=0;
    int number=0;
    private Car nextCar;

    Car(){}
    Car(int inputNumber,int inputSpeed){
        speed = inputSpeed;
        number = inputNumber;
    }
    void link(Car n){
        nextCar = n;
    }
    void run(){
        System.out.println(this.number +"번 자동차가 " + this.speed +"의 속력으로 달립니다.");
    }
}
class SuperCar extends Car{
    String engineName="순정";
    SuperCar(){
        super();
    }
    SuperCar(int inputNumber,int inputSpeed,String engine)
    {
        super(inputNumber,inputSpeed);
        engineName=engine;
    }
    void run() {
        super.run();
        System.out.println(this.engineName+"모델 엔진에서 큰 소리가 납니다.");
    }
}