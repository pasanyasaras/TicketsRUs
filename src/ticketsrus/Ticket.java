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
public class Ticket {
    private int serialNumber=0;
    public static int counter=1;
    
    public int price=0;
    
    public Ticket()
    {
        serialNumber = counter++;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public String toString()
    {
        return "Ticket: [serial#: "+ serialNumber+" Price: "+getPrice()+"]";
    }
    
}
