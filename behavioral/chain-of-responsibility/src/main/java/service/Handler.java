package service;

public interface Handler {
    Handler successor();
    Handler successor(Handler handler);
    boolean canHandle(Request request);
    void doHandle(Request request);
    default void handle(Request request) {
        if (canHandle(request))
            doHandle(request);
        else if (successor() != null)
            successor().handle(request);
        else
            System.out.println("Request unhandled");
    }
}
