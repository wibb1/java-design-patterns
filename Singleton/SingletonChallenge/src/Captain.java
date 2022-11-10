public class Captain {
    private String response = "Trying to make a captain for our team";

    private boolean tails = true;

    private Captain() { }

    private static class CaptainCreator {
        private static Captain uniqueCaptain = new Captain();
    }

    public static Captain getInstance() {
        return CaptainCreator.uniqueCaptain;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public boolean isTails() {
        return tails;
    }

    public void setTails(boolean tails) {
        this.tails = tails;
    }
}
