public abstract class Ticket {
    private String nomePassageiro;
    public Ticket(String nomePassageiro){
        this.nomePassageiro = nomePassageiro;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public abstract String emitirTicket();
}
