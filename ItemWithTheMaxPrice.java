
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timothykimball1;
/**
 *
 * @author Eon
 */
public class ItemWithTheMaxPrice {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in); {
            int code = 0;
            System.out.println("Enter the code: ");
            code = input.nextInt();
         
            int price = 0;
            System.out.println("Enter the price: ");
            price = input.nextInt();
            
            int items = 0;
            System.out.println("Enter the amount of items: ");
            items = input.nextInt();
            int maxcode = 0; 
            int maxitems = 0;
            int maxprice = 10000;
            while (true) {
                System.out.println("Enter the code: ");
                code = input.nextInt(); 
                if (code == 0) {
                break;
            }
                 System.out.println("Enter the price: ");
                price = input.nextInt();
                 System.out.println("Enter the amount of items: ");
                items = input.nextInt();
           }
          
            if (price <= maxprice){
                maxprice = price;
                maxcode = code;
                maxitems = items;
            }
            System.out.println("Item" + maxitems);
            System.out.println("Maximum price" + maxprice);
            System.out.println("Code of item" + maxcode);
}
}
}