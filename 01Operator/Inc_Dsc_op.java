class Test {
      public static void main(String[] args) {
       // a++ : Returns the current value of a, then increments a by 1.
      // ++a : Increments a by 1 first, then returns the updated value.
          int a=3;
          a=a++; // a = 3 then incre a 3 to 4
          System.out.println("Post-Increment a: " +a);

          a=++a; // 3 => 4 then a = 4
          System.out.println("Pre-Increment a: "+a );

          a=a--;  // a = 4 then decre a 4 to 3
          System.out.println("Post-Decrement a: " +a);

          a=--a; // a = 3
          System.out.println("Pre-Decrement a: "+a );
      }
}
