/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketsrus;

/**
 *
 * @author Pasan Yasara
 */
public class CounterTicket extends Ticket{
    
    public static int COUNTER_TICKET_PRICE=50;
    
    public CounterTicket()
    {
        super();
    }
    
    public int getPrice()
    {
        return COUNTER_TICKET_PRICE;
    }
    
    
    
}
