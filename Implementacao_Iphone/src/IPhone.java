class IPhone implements MediaPlayer, Phone, Browser {

    private String model;
    private int storage;
    private int batteryLevel;

    public IPhone(String model, int storage, int batteryLevel) {
        this.model = model;
        this.storage = storage;
        this.batteryLevel = batteryLevel;
    }

    // Métodos do MediaPlayer
    @Override
    public void play(String song) {
        System.out.println("Tocando a música: " + song);
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void stop() {
        System.out.println("Música parada.");
    }

    // Métodos do Phone
    @Override
    public void dial(String number) {
        System.out.println("Discando para: " + number);
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void hangUp() {
        System.out.println("Chamada encerrada.");
    }

    // Métodos do Navegador
    @Override
    public void navigateTo(String url) {
        System.out.println("Navegando para: " + url);
    }

    @Override
    public void refresh() {
        System.out.println("Atualizando a página.");
    }

    // Getters opcionais
    public String getModel() {
        return model;
    }

    public int getStorage() {
        return storage;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}

