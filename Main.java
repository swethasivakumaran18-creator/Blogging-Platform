public class Main {
    public static void main(String[] args) {

        System.out.println("\t\t\t Blogging platform\t\t\t\n\n\n");

        User u1 = new User("Alice", "alice@gmail.com","123");
        User u2 = new User("Bob", "bob@gmail.com","456");

        u1.login("Alice", "123");
        u2.login("Bob", "456");

        Feed feed = new Feed();

        // Create Post
        Post p1 = new Post("Intro","Hello World!", u1.getUsername());
        feed.addPost(p1);
        u1.addPost(p1);
        // Like
        p1.like(u2);

        // Comment
        Comment c1 = new Comment("Bob", "Nice post!");
        p1.addComment(c1);

        // Show Feed
        feed.showFeed();

        // View comments
        p1.viewComments();

        // Edit Profile
        u1.editProfile("Software Developer","alice");
        u1.viewProfile();

        u1.logout();
    }

}
