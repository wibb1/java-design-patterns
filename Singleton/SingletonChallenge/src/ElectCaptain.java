public class ElectCaptain {
    public static void main(String[] args) {
        System.out.println("Trying to make a captain for our team");
        Captain c1 = Captain.getInstance();
        System.out.println(c1.getResponse());
        c1.setResponse("You already have a Captain for your team. Send him for the toss.");
        System.out.println("Trying to make another captain for our team");
        Captain c2 = Captain.getInstance();
        System.out.println(c2.getResponse());
        if(c1 == c2) System.out.println("c1 and c2 are the same instance");
    }
}
