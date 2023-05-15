package HWClass19;

public class Static {
    static void myMethod(String word, int num){
        System.out.println("First form of myMethod:"+" "+word+" "+num);
    }
    static void myMethod(int num){
        System.out.println("Second form of myMethod:"+" "+num);
    }
    static void myMethod(String word){
        System.out.println("Third form of myMethod"+" "+word);
    }

    public static void main(String[] args) {
        Static hw3 = new Static();
        hw3.myMethod("Around the world", 80);
        hw3.myMethod(80);
        hw3.myMethod("Around the world");
    }
}

/*
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
