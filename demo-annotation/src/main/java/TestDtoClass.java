public class TestDtoClass {
    @AnnotionFieldDemo(param = "a")
    private String a;

    @AnnotionFieldDemo(param = "b")
    private String b;

    @AnnotionFieldDemo(param = "c")
    private String c;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
