package patten;

public abstract class Handler {
    private Handler nextHandler;

    public final Response handleRequest(Request request) {
        Response response = null;

        if (this.getHandlerLevel().above(request.getLevel())) {
            response = this.process(request);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleRequest(request);
            } else {
                System.out.println("-----没有合适的处理器-----");
            }
        }
        return response;
    }

    public Handler setNextHandler(Handler handler) {
        this.nextHandler = handler;
        return nextHandler;
    }

    protected abstract Level getHandlerLevel();

    public abstract Response process(Request request);
}
