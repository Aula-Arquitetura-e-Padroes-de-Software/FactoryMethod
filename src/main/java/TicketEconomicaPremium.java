public class TicketEconomicaPremium extends Ticket {
    public TicketEconomicaPremium(String nomePassageiro) {
        super(nomePassageiro);
    }

    @Override
    public String emitirTicket() {
        return "Passagem Premium Economica Emitida Para: " + this.getNomePassageiro();
    }
}
