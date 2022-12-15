public class Milk extends Product {

    private float volume;
    private float fatContent;

    public Milk(String name, double price, float fatContent, float volume) {
        super(name, price);
        this.fatContent = fatContent;
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public float getFatContent() {
        return fatContent;
    }

    public void setVolume(float volume) {this.volume = volume;}
    public void setFatContent(float fatContent) {this.fatContent = fatContent;}


    public String toString(){
        return String.format("%s fat content: %.1f %%  volume: %.1f L", super.toString(), fatContent, volume);
    }
}