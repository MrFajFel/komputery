public interface Komputer extends Comparable<Komputer>{
    void uruchom();
    void zepsujSie();

    @Override
    default int compareTo(Komputer o) {
        return this.getClass().getName().length() - o.getClass().getName().length();
    }
}
