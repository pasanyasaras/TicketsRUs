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
public class DiscountTicket extends WebTicket {
    public String type;
    public static double DISCOUNT = 0.5;
    
    public DiscountTicket(int days, String type)
    {
        super(days);
        price *=DISCOUNT;
        this.type = type;
    }
    
    public String toString()
    {
        return super.toString()+" Type: "+type;
    }
    
}
