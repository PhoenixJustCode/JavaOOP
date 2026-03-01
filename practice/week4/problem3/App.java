
public class App {

    public void getStatistics(Game g) {
        System.out.println("Statistics for: " + g.getClass().getSimpleName());
        g.a();
        g.b();
        g.c();
    }
}
