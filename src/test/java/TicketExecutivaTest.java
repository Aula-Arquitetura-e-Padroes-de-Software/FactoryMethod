import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketExecutivaTest {
    @Test
    public void testEmitirTicket() {
        Ticket ticket = TicketFactory.obterTicket("Executiva", "Teste");
        assertEquals("Passagem Executiva Emitida Para: TesteVisite Nosso Lounge Por nosso conta",
                ticket.emitirTicket());

    }
}
