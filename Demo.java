import java.util.Scanner;
public class Demo 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please choose a fruit, either Apple or Mango: ");

        String userInput = kb.nextLine();
        Fruits apple = new Apple();
        Fruits mango = new Mango();
        String ret;
        if(userInput.equals("Apple"))
        {
            ret = apple.getColor();
            System.out.println("You chose " + userInput);

            System.out.println("The color of an apple is " + ret);
        }
        else if (userInput.equals("Mango"))
        {
            ret = mango.getColor();
            System.out.println("You chose " + userInput);

            System.out.println("The color of an apple is " + ret);
        }
        else
        {
            System.out.println("You need to enter the keyword 'Apple' or 'Mango'.");
        }
        
    }
    
}
