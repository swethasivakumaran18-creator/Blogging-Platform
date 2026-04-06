public class Comment {
    private String username;
    private String text;

    public Comment(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void display() {
        System.out.println("Comment:\n"+username + ": " + text+"\n\n");
    }
}
