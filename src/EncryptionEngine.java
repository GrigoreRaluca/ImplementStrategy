public class EncryptionEngine {
    IEncStrategy iEncStrategy;

    public void getiEncText(String s) {
       iEncStrategy.encrypt(s);
    }

    public void setiEncStrategy(IEncStrategy iEncStrategy) {
        this.iEncStrategy = iEncStrategy;
    }
}
