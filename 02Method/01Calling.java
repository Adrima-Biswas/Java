class Main 
    
{
    public static void fun3() {
        System.out.println("you are in fun 3");
    }    
    
    
    public static void fun2() {
        System.out.println("you are in fun 2");
        fun3();
        
    }  
    
    public static void fun1() {
        System.out.println("you are in fun 1");
        fun2();
        
    }
    
    public static void main(String[] args) {
        fun1();
    }
    
}
