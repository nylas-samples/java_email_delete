// Import Nylas packages
import com.nylas.NylasClient;

// Import DotEnv to handle .env files
import com.nylas.models.*;
import io.github.cdimascio.dotenv.Dotenv;

public class DeleteEmail {
    public static void main(String[] args) throws NylasSdkTimeoutError, NylasApiError {
        // Load the .env file
        Dotenv dotenv = Dotenv.load();
        // Initialize the Nylas client
        NylasClient nylas = new NylasClient.Builder(dotenv.get("V3_TOKEN_API")).build();

        DeleteResponse response = nylas.messages().destroy(dotenv.get("GRANT_ID"), "{MESSAGE_ID}");
        System.out.println(response);
    }
}
