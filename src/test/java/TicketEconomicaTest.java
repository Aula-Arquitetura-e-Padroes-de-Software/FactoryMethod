import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TicketEconomicaTest {

    @Test
    public void testEmitirTicket(){
        Ticket ticket = TicketFactory.obterTicket("Economica","Teste");
        assertEquals("Passagem Económica Emitida Para: Teste",ticket.emitirTicket());

    }
}
