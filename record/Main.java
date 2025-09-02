public class Main {
  public static void main(String[] args) {
    User foo = new User("aya",56);
    System.out.println(foo.toString());
    System.out.println(foo.name());
    System.out.println(foo.age());
    System.out.println(foo.greeting());
  }
}

record User(String name ,int age){
  String greeting(){
    return "Hello "+ name;
  }
}
