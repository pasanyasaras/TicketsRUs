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
public class TestTickets {
    public static void main(String[] args) {
        int total_sales=0;
        
        Ticket[] tickets = {
            new WebTicket(10),
            new WebTicket(5),
            new CounterTicket(),
            new DiscountTicket(5,"Student"),
            new DiscountTicket(10,"Senior")
        };
        
        for(int i=0; i<tickets.length; i++)
        {
            System.out.println(tickets[i]); 
        }
        
        for(int i=0; i<tickets.length; i++)
        {
            total_sales +=tickets[i].getPrice();
        }
        
        System.out.println();
        System.out.println("Total sales: "+total_sales);
    }
    
}
