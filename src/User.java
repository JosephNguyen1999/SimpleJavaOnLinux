//Name: Joseph Nguyen
//Date: June 11, 2020

public class User{
    //main method
    public static void main (String[] args){
	//called on static methods from UserIdentifier class and places in string variable
	String userName = UserIdentifier.getUserName();
	String OSName = UserIdentifier.getOSName();
	
	//prints out "I am jhn21502 on Linux"
	System.out.println("I am " + userName + " on " + OSName);
    }
}
