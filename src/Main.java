import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Komputer> komputery = new ArrayList<>();

        WindowsKomp win1 = new WindowsKomp("Abc123","Lenovo");
        MacKomp mac1 = new MacKomp("Ade235","Apple");

        win1.uruchom();
        win1.zepsujSie();

        System.out.println("--------------------");

        mac1.uruchom();
        mac1.zepsujSie();

        System.out.println("------------------------");

        komputery.add(mac1);
        komputery.add(win1);


    }
}