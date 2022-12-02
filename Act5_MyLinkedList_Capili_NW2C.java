package Act5_MyLinkedList_Capili_NW2C;

import java.util.Scanner;

public class Act5_MyLinkedList_Capili_NW2C {
    public int dAreaC, dAge;
    public String dFirstN , dMidN, dLastN, dTelN, dGender;
    public Act5_MyLinkedList_Capili_NW2C next;
    public static Act5_MyLinkedList_Capili_NW2C firstNode;
    public static Act5_MyLinkedList_Capili_NW2C lastNode = null;
    
    public Act5_MyLinkedList_Capili_NW2C (String firstN, String midN, String lastN, int areaC, String telN, String gender, int age, Act5_MyLinkedList_Capili_NW2C next){
        this.dFirstN = firstN;
        this.dMidN = midN;
        this.dLastN = lastN;
        this.dAreaC = areaC;
        this.dTelN = telN;
        this.dGender = gender;
        this.dAge = age;
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
            
          if (lastNode != null) {
                lastNode.next = n;
                lastNode = n;
            } else {
                firstNode = n;
                lastNode = n;
            }
        }
               
            Act5_MyLinkedList_Capili_NW2C n = firstNode;
            
            while (n != null) { 
                System.out.println("Welcome to the club " +n.dFirstN + " " +n.dMidN+ " " +n.dLastN+ "!");
                System.out.println("Your area code and telephone number are (" +n.dAreaC+ ") " +n.dTelN);
                System.out.println("You are a " +n.dGender+ " member and your age is " +n.dAge+ ".");
                System.out.println();
                
                n = n.next;
       }
        
    }
}