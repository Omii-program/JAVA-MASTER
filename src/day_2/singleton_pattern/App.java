package day_2.singleton_pattern;

public class App {
    public static void main(String[] args) {

        Singleton instance;

        instance=Singleton.getInstance();

        instance.display();
    }
}
