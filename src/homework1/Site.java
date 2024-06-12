package homework1;

public class Site {
    //User user1=new User("John Doe","john.doe","abc",10);
    //User user2=new User("Patel Harsh","patel.harsh","123abc",11);
    //User user3=new User("Kim Yan","kim.yan","admin",12);
    //User user4=new User("Brad Pitt","brad.pitt","abcdef",13);
    //User user5=new User("David Clark","david.clark","123456",14);
    //
    //User[] users={user1,user2,user3,user4,user5};
    //
    //1. Print full names of users that has even userId number
    //2. Print full names for those who has first name less than 4 letters.
    //3. Print All details of each user as below.
    //Full name: John Doe
    //Username: john.doe
    //Password: abc
    //UserId: 10
    public static void main(String[] args) {
        User user1=new User("John Doe","john.doe","abc",10);
        User user2=new User("Patel Harsh","patel.harsh","123abc",11);
        User user3=new User("Kim Yan","kim.yan","admin",12);
        User user4=new User("Brad Pitt","brad.pitt","abcdef",13);
        User user5=new User("David Clark","david.clark","123456",14);

        User[] users={user1,user2,user3,user4,user5};
        for(int i = 0; i<users.length;i++){
            if(users[i].id%2==0){
                System.out.println(users[i].fullName);
            }
        }
        System.out.println("==========");
        String firstname;
        for(User u: users){
          firstname = u.fullName.substring(0,u.fullName.indexOf(" "));
          if(firstname.length()<4){
            System.out.println(firstname);
          }

        }
        System.out.println("==========");
        System.out.println("Full name: "+user1.fullName);
        System.out.println("Username: "+user1.username);
        System.out.println("Password: "+user1.password);
        System.out.println("Id: "+user1.id);

        System.out.println("==========");
        System.out.println("Full name: "+user2.fullName);
        System.out.println("Username: "+user2.username);
        System.out.println("Password: "+user2.password);
        System.out.println("Id: "+user2.id);

        System.out.println("==========");
        System.out.println("Full name: "+user3.fullName);
        System.out.println("Username: "+user3.username);
        System.out.println("Password: "+user3.password);
        System.out.println("Id: "+user3.id);

        System.out.println("==========");
        System.out.println("Full name: "+user4.fullName);
        System.out.println("Username: "+user4.username);
        System.out.println("Password: "+user4.password);
        System.out.println("Id: "+user4.id);

        System.out.println("==========");
        System.out.println("Full name: "+user5.fullName);
        System.out.println("Username: "+user5.username);
        System.out.println("Password: "+user5.password);
        System.out.println("Id: "+user5.id);








    }
}
