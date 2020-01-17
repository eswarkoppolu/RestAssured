package Exapmle;

public class Example1 {
	
public static void main(String[]args){
	
	String email = "eswar_koppolu@gmail.com";
    String[] splittedmail = email.split("[@]");
    for (int j = 0; j <= splittedmail.length - 1; j++)
    {
        System.out.println("splited emails----------" + splittedmail[j]);
    }
}

}
