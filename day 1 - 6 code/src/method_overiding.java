
    class dog {


        public void sound() {
            System.out.print("bark");
        }
    }


    class cat extends dog {
        public void sound() {
            System.out.println("meow");
        }public class method_overiding {


        }

    public static void main(String[] args) {
        cat c = new cat();
        c .sound();
    }
}
