public class Main {
    public static void main(String[] args) {
          EncryptionEngine encryptionEngine=new EncryptionEngine();
          IEncStrategy iEncStrategy=new Alg1Enc();
          encryptionEngine.setiEncStrategy(iEncStrategy);
          encryptionEngine.getiEncText("LALA");
    }
}
