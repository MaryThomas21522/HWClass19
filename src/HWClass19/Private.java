package HWClass19;
class Private{

    private void myMethod(String word, int num) {
        System.out.println("First form of myMethod:" + " " + word + " " + num);
    }

    private void myMethod(int num) {
        System.out.println("Second form of myMethod:" + " " + num);
    }

    private void myMethod(String word) {
        System.out.println("Third form of myMethod" + " " + word);
    }

    public static void main(String[] args) {
        Private hw = new Private();
        hw.myMethod("Around the world", 80);
        hw.myMethod(80);
        hw.myMethod("Around the world");
    }

}

/*
Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
