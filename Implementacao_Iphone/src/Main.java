public class Main {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone("iPhone 14", 128, 75);

        // Testando MediaPlayer
        meuIphone.play("Imagine - John Lennon");
        meuIphone.pause();
        meuIphone.stop();

        System.out.println();

        // Testando Phone
        meuIphone.dial("11999999999");
        meuIphone.answerCall();
        meuIphone.hangUp();

        System.out.println();

        // Testando Browser
        meuIphone.navigateTo("https://www.openai.com");
        meuIphone.refresh();

        System.out.println();

        // Outro teste: status do iPhone
        System.out.println("Modelo: " + meuIphone.getModel());
        System.out.println("Armazenamento: " + meuIphone.getStorage() + "GB");
        System.out.println("Bateria: " + meuIphone.getBatteryLevel() + "%");

        System.out.println();

        // Novo teste: simulando uso combinado
        System.out.println("=== Teste Simultâneo ===");
        meuIphone.play("Bohemian Rhapsody - Queen");
        meuIphone.navigateTo("https://www.youtube.com");
        meuIphone.dial("1122334455");
        meuIphone.stop();
        meuIphone.hangUp();
        meuIphone.refresh();
    }
}

