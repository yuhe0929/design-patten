package patten;

public class ConcreteHandler3 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return new Level(5);
    }

    @Override
    public Response process(Request request) {
        System.out.println("-----请求由处理器3行处理-----");
        return null;
    }
}
