package Act5_MyLinkedList_Capili_NW2C;

import java.util.Scanner;

public class Act5_MyLinkedList_Capili_NW2C {
    public int AreaC, Age;
    public String FirstN , MidN, LastN, TelN, Gender;
    public Act5_MyLinkedList_Capili_NW2C next;
    public static Act5_MyLinkedList_Capili_NW2C fNode;
    public static Act5_MyLinkedList_Capili_NW2C lNode = null;
    
    public Act5_MyLinkedList_Capili_NW2C (String firstN, String midN, String lastN, int areaC, String telN, String gender, int age, Act5_MyLinkedList_Capili_NW2C next){
        this.FirstN = firstN;
        this.MidN = midN;
        this.LastN = lastN;
        this.AreaC = areaC;
        this.TelN = telN;
        this.Gender = gender;
        this.Age = age;
        this.next = next;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int membersNum;
        String firstN, midN, lastN, gender, telN;
        int areaC, age;
        
        System.out.print("How many members will be entered? ");
        membersNum = Integer.parseInt(input.nextLine());
          System.out.println();
          
        for(int i=0; i < membersNum; i++){
            
            System.out.println("Kindly give the information of member #" +(i+1) );
            
             System.out.print("Enter first name: ");
                firstN = input.nextLine();
             System.out.print("Enter middle name: ");
                midN = input.nextLine();
             System.out.print("Enter last name: ");
                lastN = input.nextLine();
             System.out.print("Enter area code: ");
                areaC = Integer.parseInt(input.nextLine());
             System.out.print("Enter telephone number: ");
                telN = input.nextLine();
             System.out.print("Enter gender: ");
                gender = input.nextLine();
             System.out.print("Enter age: ");
                age = Integer.parseInt(input.nextLine());
              System.out.println();
              
          Act5_MyLinkedList_Capili_NW2C n = new Act5_MyLinkedList_Capili_NW2C (firstN, midN, lastN, areaC, telN, gender, age,  null);
            
          if (lNode != null) {
                lNode.next = n;
                lNode = n;
            } else {
                fNode = n;
                lNode = n;
            }
        }
        
          Act5_MyLinkedList_Capili_NW2C n = fNode;
            
            while (n != null) { 
                System.out.println("Welcome to the club " + n.FirstN + " " + n.MidN + " " + n.LastN + "!");
                System.out.println("Your area code and telephone number are (" +n.AreaC+ ") " + n.TelN);
                System.out.println("You are a " + n.Gender + " member and your age is " + n.Age + ".");
                System.out.println();
                
                n = n.next;
       }
        
    }
}