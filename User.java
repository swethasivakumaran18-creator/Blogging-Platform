import java.util.*;

public class User {

    private String username;
    private String email;
    private String password;
    private String bio;
    private boolean isLoggedIn;
    private List<Post> posts;


    public User(String username,String email,  String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.bio = "";
        this.isLoggedIn = false;
        this.posts = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
    public boolean login(String input, String password) {
        if ((input.equals(username) || input.equals(email))
                && this.password.equals(password)) {
            isLoggedIn = true;
            System.out.println(username+" logged in successfully");
            return true;
        }
        System.out.println("Invalid credentials");
        return false;
    }
    public void logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println( username+" logged out successfully");
        } else {
            System.out.println("User not logged in");
        }
    }
    public void editProfile(String bio,String username) {
        if (isLoggedIn) {
            this.bio = bio;
            this.username=username;
        } else {
            System.out.println("Login required");
        }
    }
    public void viewProfile() {
        System.out.println("Username: " + username);
        System.out.println("Bio: " + bio);

        System.out.println("My Posts:");
        for (Post p : posts) {
            p.displayPost();
        }
    }
    public void addPost(Post post) {
        posts.add(post);
    }
}
