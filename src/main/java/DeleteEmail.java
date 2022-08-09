//Import Java Utilities
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Import Nylas Packages
import com.nylas.RequestFailedException;
import com.nylas.NylasAccount;
import com.nylas.NylasClient;
import com.nylas.Label;
import com.nylas.LabelQuery;
import com.nylas.Labels;
import com.nylas.Messages;
import com.nylas.Message;

//Import DotEnv to handle .env files
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;

public class DeleteEmail {
    public static void main(String[] args) throws RequestFailedException, IOException {
        Dotenv dotenv = Dotenv.load();
        // Create the client object
        NylasClient client = new NylasClient();
        // Connect it to Nylas using the Access Token from the .env file
        NylasAccount account = client.account(dotenv.get("ACCESS_TOKEN"));

        String messageId = "{message_id}";
        Map<String, String> map = new HashMap<String, String>();
        Messages messages = account.messages();
        Labels labels = account.labels();
        for(Label label : labels.list()){
            map.put(label.getName(), label.getId());
        }

        try{
            messages.setLabelIds(messageId, Arrays.asList(map.get("trash")));
            System.out.println("Message was successfully deleted");
        }catch (Exception e){
            System.out.println("Message couldn't be deleted");
        }

    }
}
