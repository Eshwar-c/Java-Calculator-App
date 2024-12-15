import java.util.Scanner;
class Input{
  public void opt(int x, int y,Scanner scanner){
    System.out.println("please select number 1 to 4 for performing  operations : ");
    int val = scanner.nextInt();
      switch (val) {
        case 1:
            System.out.println("1 : Addition ");
            Operations.add( x,y);
            break;
        case 2:
            System.out.println("2 : Subraction ");
            Operations.sub(x,y);
            break;
        case 3:
            System.out.println("3 : Multiplication ");
            Operations.mul(x,y);
            break;
        case 4:
          System.out.println("4 : Division ");
          Operations.div(x,y);
          break;
        case 5:
          System.out.println("Thanks for using our app");
          break;
        default:
           System.out.println("please select a valid number from 1 to 5");
      }
    }
}
class Operations{
      public  static void add(int x , int y){
        int ans = x+y;
         System.out.println("The addition of two numbers is : "+ans);
       }
      public  static void sub(int x , int y){
        int ans = x-y;
         System.out.println("The subraction of two numbers is : "+ans);
       }
      public  static void mul(int x , int y){
        int ans = x*y;
         System.out.println("The multiplication of two numbers is : "+ans);
       }
      public static  void div(int x , int y){
        if(y!=0){
          int ans = x/y;
          System.out.println("The division of two numbers is : "+ans);
        }
        else{
          System.out.println("the second value cannot be zero ");
        }
    }
  }
class Calculator{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Input obj1 = new Input();
      System.out.println("Enter the first number : ");
      int val1 = scanner.nextInt();
      System.out.println("Enter the second number : ");        
      int val2 = scanner.nextInt();
    obj1.opt(val1,val2,scanner);
    scanner.close();
    }
}