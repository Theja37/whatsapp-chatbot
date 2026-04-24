package whatsapp_chatbot;

import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;

@RestController
public class ChatbotController {

    @PostMapping("/webhook")
    public Map<String, String> receiveMessage(@RequestBody Map<String, String> body) {
        String message = body.get("message");
        String response;

        System.out.println("Incoming message: " + message);

        if (message == null) {
            response = "No message received";
        } else if (message.equalsIgnoreCase("Hi")) {
            response = "Hello";
        } else if (message.equalsIgnoreCase("Bye")) {
            response = "Goodbye";
        } else {
            response = "I don't understand that message";
        }

        Map<String, String> reply = new HashMap<>();
        reply.put("reply", response);
        return reply;
    }
}