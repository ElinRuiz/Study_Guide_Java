package lessons.springbootbackend.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SimpleControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void getTestEndpointReturns201AndHola() throws Exception {
        String jsonResponse = """
{
    "status": "ok",
    "data": "Hello backend world"
}
""";
        mockMvc.perform(get("/test"))
            .andExpect(status().isCreated())
            .andExpect(content().string(jsonResponse));
    }
}
