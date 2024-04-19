public class HelloWorld {
    private String hello;
    private String name;

    public HelloWorld(String theName) {
        hello = "Hello, world!";
        name = theName;
    }

    public String toString() {
        return hello + "\nNice to meet you, " + name + "!";
    }
}