import java.util.*;

public class TestApp {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------"); 
        System.out.println("1. Dal Makhani:       = 235 Rs.");        
        System.out.println("2. Shahi Paneer:      = 275 Rs.");        
        System.out.println("3. Palak Paneer:      = 270 Rs.");       
        System.out.println("4. Aloo Gobi:         =  75 Rs.");    
        System.out.println("5. Vegetable Biryani: = 265 Rs.");             
        System.out.println("6. Veg Fried Rice:    = 190 Rs.");          
        System.out.println("7. Matar Paneer:      = 180 Rs.");        
        System.out.println("8. Chole Bhature:     =  70 Rs."); 
        System.out.println("--------------------------------"); 

        int sum = 0;

        do {
            System.out.print("Select your order (or type 'skip' / 'done'): ");
            String sel = sc.nextLine().trim(); // remove extra spaces

            if (sel.equalsIgnoreCase("done")) {  // Exit condition
                System.out.println("--------------------------------");
                System.out.println("Your final bill = " + sum + " Rs.");
                System.out.println("Thank you for ordering! 🍽️");
                break;
            }

            if (sel.equalsIgnoreCase("skip")) {  // Skip condition
                continue; 
            }

            switch (sel) {
                case "1": sum += 235; break;
                case "2": sum += 275; break;
                case "3": sum += 270; break;
                case "4": sum += 75;  break;
                case "5": sum += 265; break;
                case "6": sum += 190; break;
                case "7": sum += 180; break;
                case "8": sum += 70;  break;
                default:
                    System.out.println("❌ Invalid choice, please try again.");
                    continue;
            }

            System.out.println("Item added! Current total = " + sum + " Rs.");

        } while (true);

        sc.close();
    }
}
