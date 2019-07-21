package self.learn.ex.structural.facade;

public class QFacade {
    private QSubSys1st sys1st = new QSubSys1st();
    private QSubSys2nd sys2nd = new QSubSys2nd();

    public void functionBySys1st() {
        sys1st.function();
    }

    public void functionBySys2nd() {
        sys2nd.function();
    }
}
