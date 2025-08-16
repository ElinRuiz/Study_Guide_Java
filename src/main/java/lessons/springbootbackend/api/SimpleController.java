package lessons.springbootbackend.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/test")
    public ResponseEntity<String> sampleGet() {
        String jsonResponse = """
{
    "status": "ok",
    "data": "Hello backend world"
}
                """;
        return ResponseEntity.status(201).body(jsonResponse);
    }
}
