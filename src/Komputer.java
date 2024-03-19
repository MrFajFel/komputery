public interface Komputer extends Comparable<Komputer>{
    void uruchom();
    void zepsujSie();

    default int compareTo(){
        return 0;
    }
}
