import java.util.*;

public class Feed {
    private List<Post> posts;

    public Feed() {
        posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void showFeed() {
        posts.sort((a, b) -> b.getTimestamp().compareTo(a.getTimestamp()));
        System.out.println("FEEDS:");
        for (Post p : posts) {
            p.displayPost();
        }
    }
}
