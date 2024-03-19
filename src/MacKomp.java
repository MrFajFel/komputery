public class MacKomp implements Komputer{
    private String model;
    private String marka;

    @Override
    public void uruchom() {
        System.out.println("uruchomiony Mac.");
    }

    @Override
    public void zepsujSie() {
        System.out.println("zepsul sie Mac.");
    }

    public MacKomp(String model, String marka) {
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
