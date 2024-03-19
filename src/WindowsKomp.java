public class WindowsKomp implements Komputer{
    private String model;
    private String marka;

    @Override
    public void uruchom() {
        System.out.println("uruchomiony win 11.");
    }

    @Override
    public void zepsujSie() {
        System.out.println("zepsul sie win 11");
    }

    public WindowsKomp(String model, String marka) {
        this.model = model;
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public String getMarka() {
        return marka;
    }

    @Override
    public String toString() {
        return String.format("Marka to: %s Model to: %s",marka,model);
    }
}
