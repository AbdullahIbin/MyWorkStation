package JavaReview;

class Demo {
        public void show(int x){
            System.out.println("In int " + x);
        }
        public void show(String s){
            System.out.println("In String " + s);
        }
        public void show(double b){
            System.out.println("In byte " + b);
        }
    }
    class UseDemo{
        public static void main(String[] args){
            byte a = 25;
            Demo obj = new Demo();
            obj.show(a);
            obj.show("hello");
            obj.show(250);
            obj.show('A');
            obj.show("A");
            obj.show(7.5);
        }
}
