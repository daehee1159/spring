public class EngineXml {
    public EngineXml() {
        System.out.println("applicationContext.xml 에 등록된 bean 순서에 따라 EngineXml을 호출합니다.");
        System.out.println("EngineXml객체의  생성자 생성 완료");
        System.out.println("CarXml 생성자를 생성합니다.");
        System.out.println("====================================================================================================");
    }

    public void exec() {
        System.out.println("엔진이 동작합니다.");
        System.out.println("====================================================================================================");
    }
}