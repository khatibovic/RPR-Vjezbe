public class Main {
    public static void main(String[] args) {
        Sat s = new Sat(15,30,45);
        System.out.println(s);
        s.Sljedeci();
        System.out.println(s);
        s.PomjeriZa(-48);
        System.out.println(s);
        s.Postavi(0,0,0);
        System.out.println(s);
    }
}