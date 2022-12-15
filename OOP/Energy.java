public class Energy extends Product{

    private float volume;
    private float caffeine;

    public Energy(String name, double price, float caffeine, float volume) {
        super(name, price);
        this.caffeine = caffeine;
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public float getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(float caffeine) {this.caffeine = caffeine;}
    public void setVolume(float volume) {this.volume = volume;}


    public String toString(){
        return String.format("%s caffeine: %.1f mg/l  volume: %.1f L", super.toString(), caffeine, volume);
    }
}