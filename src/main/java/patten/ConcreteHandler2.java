package patten;

public class ConcreteHandler2 extends Handler{
    @Override
    protected Level getHandlerLevel() {
        return new Level(3);
    }

    @Override
    public Response process(Request request) {
        System.out.println("-----请求由处理器2行处理-----");
        return null;
    }
}
