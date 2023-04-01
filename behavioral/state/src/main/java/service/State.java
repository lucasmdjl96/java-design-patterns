package service;

public enum State {
    A {
        @Override
        public void handle(Context context) {
            System.out.println("State A handling");
            context.setState(B);
        }
    },
    B {
        @Override
        public void handle(Context context) {
            System.out.println("State B handling");
            context.setState(A);
        }
    };
    abstract void handle(Context context);
}
