import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketEconomicaPremiumTest {

    @Test
    public void testEmitirTicket() {
        Ticket ticket = TicketFactory.obterTicket("EconomicaPremium", "Teste");
        assertEquals("Passagem Premium Economica Emitida Para: Teste", ticket.emitirTicket());

    }
}

