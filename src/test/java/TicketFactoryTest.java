import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketFactoryTest {

    @Test
    public void testCreateTicketParaTicketInexistente() {
        try {
            Ticket ticket = TicketFactory.obterTicket("Basica");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de Ticket Inexistente", e.getMessage());
        }
    }

    @Test
    public void testCreateTicketParaTicketInvalido(){
            try{
                Ticket ticket = TicketFactory.obterTicket("PrimeiraClasse","Teste");
                fail();

            } catch (IllegalArgumentException e){
                assertEquals("Tipo de Ticket Inválido",e.getMessage());
            }
        }


}
