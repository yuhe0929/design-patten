package patten;

public class ConcreteHandler1 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return new Level(1);
    }

    @Override
    public Response process(Request request) {
        System.out.println("-----请求由处理器1进行处理-----");
        return null;
    }
}
