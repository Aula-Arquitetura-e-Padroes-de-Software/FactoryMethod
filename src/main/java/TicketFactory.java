public class TicketFactory {

    public static Ticket obterTicket(String tipo){
        return obterTicket(tipo,null);
    }


    public static Ticket obterTicket(String tipo, String nomePassageiro){
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName("Ticket" + tipo);
            objeto = classe.getDeclaredConstructor(String.class).newInstance(nomePassageiro);
        } catch (Exception e){
            throw  new IllegalArgumentException("Tipo de Ticket Inexistente");
        }
        if (!(objeto instanceof Ticket)){
            throw new IllegalArgumentException("Tipo de Ticket Inválido");
        }
        return (Ticket) objeto;
    }
}
