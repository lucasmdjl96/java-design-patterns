import service.Originator;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setData1(2);
        originator.setData2("Hello");
        Originator.Memento memento = originator.createMemento();
        originator.setData2("World");
        originator.setData1(1);
        originator.setMemento(memento);
        System.out.println(originator.getData2() + " " + originator.getData1());
    }
}
