package Activity5b;



import java.util.Scanner;
public class Act05_MyLinkedList_Viray_NW2C {
    
    public int data; 
    public Act05_MyLinkedList_Viray_NW2C next; 
    public static Act05_MyLinkedList_Viray_NW2C firstNode; 
    public static Act05_MyLinkedList_Viray_NW2C lastNode = null;
    public Act05_MyLinkedList_Viray_NW2C(int d, Act05_MyLinkedList_Viray_NW2Cn) {
        data = d;
        next = n;  
    }   
    public static void main(String[] args)  {
       
        String fName ="";String mName =""; String lName =""; String gender="";
        int aCode=0,age=0,telNum=0;
        int numnodes, num;
       
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many members’ information will be entered? ");
        numnodes = scan.nextInt();
        for(int i=0; i<numnodes; i++) {   
            System.out.print("Kindly give the information of member # ");         
            num=scan.nextInt();
            System.out.print("Enter First Name: ");
                fName=sc.nextLine();
            System.out.print("Enter Middle Name: ");
                mName=sc.nextLine();
            System.out.print("Enter Last Name: ");
                lName=sc.nextLine();
            System.out.print("Enter Area Code: ");
                aCode=scan.nextInt();
            System.out.print("Enter Telephone Number: ");
                telNum=scan.nextInt();
            System.out.print("Enter Gender: ");
                gender=sc.nextLine();
            System.out.print("Enter Age: ");
                age=scan.nextInt();
             System.out.println();
                
            
           Act05_MyLinkedList_Viray_NW2C n = new Act05_MyLinkedList_Viray_NW2C(num, null); 
            if(lastNode != null) 
            {
               lastNode.next= n;
               lastNode = n;
            } else { 
               firstNode = n;
