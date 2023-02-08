import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String users[] = new String[3];
        String passw[] = new String[3];
        String first_cont[] = new String[3];
        String second_cont[] = new String[3];

        int i = 0;

        while (true)
        {

           System.out.println("1. register");
           System.out.println("2. login");
           System.out.println("3. display");
           System.out.println("4. search");
           System.out.println("5. delete");
           System.out.println("Enter a selection: ");

           String selection;
           selection = input.nextLine();

           if(selection.equals("register"))
           {
               System.out.print("Create a username: ");
               while(i < users.length)
               {
                   users[i] = input.nextLine();
                   break;
               }
               System.out.print("Create a password: ");
               while(i < passw.length)
               {
                   passw[i] = input.nextLine();
                   i++;
                   break;
               }

           }

           else if(selection.equals("login"))
           {
               System.out.print("Enter your username: ");
               String entered_user = input.nextLine();
               System.out.print("Enter your password: ");
               String entered_password = input.nextLine();
               int counter = 0;


               for(i = 0; i< users.length; i++)
               {
                   if(entered_user.equals(users[i]) && entered_password.equals(passw[i]))
                   {
                       System.out.println("Login Found!");
                       break;
                   }
                   else if(counter < users.length) {
                       first_cont[i] = users[i];
                       second_cont[i] = passw[i];
                       counter++;
                       if(counter == users.length)
                       {
                           System.out.println("User was not found!");
                           break;
                       }

                   }

               }

          }
        else if(selection.equals("display"))
           {
               System.out.println("Showing all users and passwords: ");
               for(int a = 0; a < users.length; a++)
               {
                   System.out.println("USER: " + users[a] + " " + "PASSWORD: " + passw[a]);

               }
           }
        else if(selection.equals("search"))
           {
               System.out.println("ENTER USER TO BE SEARCHED: ");
               String user_search = input.nextLine();

               for(i = 0; i < users.length; i++)
               {
                   String current_user = users[i];
                   if (user_search.equals(current_user)) {
                       System.out.println("THE USER " + user_search + " WAS FOUNDED " + " WITHIN THE" + (i + 1) + " POSITION OF THE ARRAY!");
                       break;
                   } else if (i == users.length) {
                       System.out.println("USER DOES NOT EXIST!");
                   }
               }

           }

        else if(selection.equals("delete")) {
               System.out.println("ENTER THE USER TO BE DELETED: ");
               String user_delete = input.nextLine();
               int k;
               int current_location = 0;

               for (i = 0; i < users.length; i++)
               {
                   if (user_delete.equals(users[i]))
                   {
                       current_location = i;

                       for (i = current_location; i < users.length - 1; i++)
                       {
                           users[i] = users[i+1];
                       }
                   }




               }
               //System.out.println("This user is in position" + current_location + "of the array");
               System.out.println("New array list is: "+users[i]);
           }
        }



    }
}