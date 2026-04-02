public class TicketEconomica extends Ticket {
    public TicketEconomica(String nomePassageiro) {
        super(nomePassageiro);
    }

    @Override
    public String emitirTicket() {
        return "Passagem Económica Emitida Para: " + this.getNomePassageiro();
    }
}
