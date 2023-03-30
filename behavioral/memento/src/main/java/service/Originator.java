package service;

import org.jetbrains.annotations.NotNull;

public class Originator {
    private int data1;
    private String data2;
    public Memento createMemento() {
        return new Memento(data1, data2);
    }
    public void setMemento(@NotNull Memento memento) {
        data1 = memento.getData1();
        data2 = memento.getData2();
    }
    public int getData1() {
        return data1;
    }
    public void setData1(int data1) {
        this.data1 = data1;
    }
    public String getData2() {
        return data2;
    }
    public void setData2(String data2) {
        this.data2 = data2;
    }
    public static class Memento {
        private final int data1;
        private final String data2;
        private Memento(int data1, String data2) {
            this.data1 = data1;
            this.data2 = data2;
        }
        private int getData1() {
            return data1;
        }
        private String getData2() {
            return data2;
        }
    }
}
