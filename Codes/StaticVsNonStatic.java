public class StaticVsNonStatic {
    public static void main(String[] args) {

        //Non static methods can only be called on individual objects
        User user = new User();
        user.name = "Devarshi";
        user.walk();
        
        // It is not possible
        // User.walk();

        // Static method and variable can be accessed without object
        User.occupation = "Software development";
        User.working();
    }
    
}
