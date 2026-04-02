public class TicketFactory {
    public static Ticket obterTicket(String tipo){
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName("Ticket" + tipo);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception e){
            throw  new IllegalArgumentException("Tipo de Ticket Inexistente");
        }
        if (!(objeto instanceof Ticket)){
            throw new IllegalArgumentException("Tipo de Ticket Inválido");
        }
        return (Ticket) objeto;
    }
}
