public class freefallcalcloop {
    public static void main(String[] args) {
        double gravity = 9.81;
        double velocity = 0;
        
        for (int i = 0; i < 10; i++) {
            velocity += gravity;
            System.out.println ("velocity: " + velocity);
        }
    }
}