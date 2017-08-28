package classwork.lesson2;

public class User {
   static User[] users= new User[10];
    private  String name;
    private  String surname;
    private  int age;

    User(String name,String surname, int age){
        this.name = name;
       this.surname =surname;
        this.age = age;
        for (int i = 0; i <users.length ; i++) {
            if(users[i]==null) {
                users[i]=this;
                break;

          }
        }
    }
    public static void showUsers(){
        for (int i = 0; i <users.length ; i++) {
            if(users[i]!=null) {
                System.out.print(users[i].name + ", ");
                System.out.print(users[i].surname + ", ");
                System.out.println(users[i].age);
            }
        }
    }
}
