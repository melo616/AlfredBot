import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello " + name + ", lovely to see you.";
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date nowDate = new Date();
        return "It is currently " + nowDate;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        int alexis = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");
        if(alexis != -1) {
            return "Right away, sir. She certainly isn't sophistated enough for that.";
        } else if (alfred != -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

