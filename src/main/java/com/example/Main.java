package com.example;

public class Main {

    public static void main(String[] args) { // HUGE TIP: A short cut to this method is to type in 'psvm' and then this WHOLE method will display
        
        Greeting greeting = new HelloGreeting();

        greeting.sayHello();

        Greeting greeting2 = new Greeting() {
            
            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };

        greeting2.sayHello();
    }
    
}
