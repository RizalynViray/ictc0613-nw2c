import java.io.*;
import java.util.*;


public class Activity5A_NW2C_Paguio {
	
	 public static class UserData {
	        public String fname, mname, lname, sex;
	        public int acode, tpn, age;
	        public UserData usr;
	        
	        public static UserData firstNode;
	        public static UserData lastNode = null;
	        
	        UserData(String fn, String mn, String ln, int ac, int tp, String sx, int ag, UserData us) {
	            fname = fn;
	            mname = mn;
	            lname = ln;
	            acode = ac;
	            tpn = tp;
	            sex = sx;
	            age = ag;
	            usr = us;
	        }
	 }
	 
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("----- Welcome! -----");
		 System.out.println("How many member's information will be entered?: \"");
		 int members = scanner.nextInt();
		 
		 for (int i = 0; i < members; i++) {
	            
	            System.out.println("Kindly give the information of member #" + (i + 1));
	            System.out.print("Enter first name: ");
	            String firstName = String.valueOf(inputText.readLine());
	            
	            System.out.print("Enter middle name: ");
	            String middleName = String.valueOf(inputText.readLine());
	            
	            System.out.print("Enter last name: ");
	            String lastName = String.valueOf(inputText.readLine());
	            
	            System.out.print("Enter area code: ");
	            int areaCode = Integer.parseInt(inputText.readLine());
	            
	            System.out.print("Enter telephone number: ");
	            int telephoneNumber = Integer.parseInt(inputText.readLine());
	            
	            System.out.print("Enter gender: ");
	            String gender = String.valueOf(inputText.readLine());
	            
	            System.out.print("Enter age: ");
	            int age = Integer.parseInt(inputText.readLine());
	            
	            UserData n = new UserData(firstName, middleName, lastName, areaCode, telephoneNumber, gender, age, null);
	            if(UserData.lastNode != null) {
	                UserData.lastNode.usr = n;
	                UserData.lastNode = n;
	            } else {
	                UserData.firstNode = n;
	                UserData.lastNode = n;
	            }
	            System.out.println();
	        }
	        UserData n = UserData.firstNode;
	        while(n != null) {
	            System.out.println("Welcome to the club " + n.fname + " " + n.mname + " " + n.lname + "!");
	            System.out.println("Your area code and telephone number is (" + n.acode + ") " + n.tpn);
	            System.out.println("You are a " + n.sex + " member, and your age is " + n.age + "\n");
	            n = n.usr;
	        }
	    }
	 }
}
