public class CarXml {
    private EngineXml v8;

    public CarXml() {
        System.out.println("CarXml 객체의 생성자 생성완료");
        System.out.println("CarXml 객체의 run 메서드를 실행합니다.");
        System.out.println("====================================================================================================");
    }

    public void setEngine(EngineXml e) {
        v8 = e;
    }

    public void run() {
        System.out.println("run 메서드 실행 완료");
        System.out.println("엔진을 이용하여 달립니다.");
        System.out.println("applicationContext.xml 에 등록된 CarXml의 engine은 e를 참조하여 Engine 객체의 exec 메서드를 호출합니다.");
        System.out.println("====================================================================================================");
        v8.exec();
    }
}