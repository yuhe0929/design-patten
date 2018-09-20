package patten;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNextHandler(handler2).setNextHandler(handler3);

        handler1.handleRequest(new Request(new Level(4)));
        handler1.handleRequest(new Request(new Level(0)));
        handler1.handleRequest(new Request(new Level(1)));
        handler1.handleRequest(new Request(new Level(2)));
        handler1.handleRequest(new Request(new Level(8)));
    }
}
