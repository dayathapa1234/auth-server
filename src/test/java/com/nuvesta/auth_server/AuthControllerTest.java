package com.nuvesta.auth_server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
class AuthControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void pingEndpointReturnsPong() throws Exception {
        mockMvc.perform(get("/auth/ping"))
                .andExpect(status().isOk())
                .andExpect(content().string("auth pong"));
    }
}