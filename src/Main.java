import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Komputer> komputery = new ArrayList<>();

        WindowsKomp win1 = new WindowsKomp("Abc123","Lenovo");
        MacKomp mac1 = new MacKomp("Ade235","Apple");
        

        komputery.add(mac1);
        komputery.add(win1);

        for (Komputer k:komputery){
            System.out.println(k.getClass().getName());
            k.uruchom();
            k.zepsujSie();
            System.out.println("---------------");
        }
        Collections.sort(komputery);

    }
}