public class MethodExample {
        //no parameters no return type
         static void display(){
            System.out.println("hello");
        }
        //parametres no return type
        static void great (String a){
            System.out.println("hello"+a);
        }
        //parameters with return type
        static int sum(int a,int b){
            return a+b;
        }
        //noparameters with return type
        static int display1(){
            return 10;
        }
        public static void main (String[] args){
            display();
            great("billa");
            System.out.println(sum(10,20));
            System.out.println(display1());
        }
    }

