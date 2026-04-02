public class TicketExecutiva extends Ticket {
    public TicketExecutiva(String nomePassageiro) {
        super(nomePassageiro);
    }

    @Override
    public String emitirTicket() {
        return "Passagem Executiva Emitida Para: " + this.getNomePassageiro() + "Visite Nosso Lounge Por nosso conta";
    }

}
