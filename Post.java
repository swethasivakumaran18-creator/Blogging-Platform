import java.util.*;

interface Likeable {
    void like(User user);
    void unlike(User user);
    int getLikeCount();
}

interface Commentable {
    void addComment(Comment comment);
    void deleteComment(Comment comment, User user);
}

class Post implements Likeable, Commentable{

    private String title;
    private String content;
    private String username;
    private Date timestamp;
    private Set<String> likes;
    private List<Comment> comments;

    public Post( String title, String content, String username)
    {

        this.title = title;
        this.content = content;
        this.username = username;
        this.timestamp = new Date();
        this.likes = new HashSet<>();
        this.comments = new ArrayList<>();
    }


    public Date getTimestamp() {
        return timestamp;
    }
    public void displayPost() {

        System.out.println("User: " + username);
        System.out.println("Tile: " + title);
        System.out.println("Content: " + content);
        System.out.println("Likes: " + likes.size());
        System.out.println("Comments: " + comments.size());
        System.out.println("Time: " + timestamp);
    }
    public void like(User user) {
        likes.add(user.getUsername());
        Notification.notify(username, user.getUsername() + " liked your post");
    }

    public void unlike(User user) {
        likes.remove(user.getUsername());
    }

    public int getLikeCount() {
        return likes.size();
    }

    // COMMENT METHODS
    public void addComment(Comment comment) {
        comments.add(comment);
        Notification.notify(username, comment.getUsername() + " commented on your post");
    }

    public void deleteComment(Comment comment, User user) {
        if (comment.getUsername().equals(user.getUsername())) {
            comments.remove(comment);
        }
    }

    public void viewComments() {
        for (Comment c : comments) {
            c.display();
        }
    }
}
