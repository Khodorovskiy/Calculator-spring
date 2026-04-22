package com.student.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testAddEndpoint() throws Exception{
        mockMvc.perform(get("/calc/add").param("a", "10").param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("15"));
    }

    @Test
    void testSubtractEndpoint() throws Exception {
        mockMvc.perform(get("/calc/subtract").param("a", "10").param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }
    @Test
    void testMultiplyEndpoint() throws Exception {
        mockMvc.perform(get("/calc/multiply").param("a", "10").param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("50"));
    }

    @Test
    void testDivideEndpoint() throws Exception {
        mockMvc.perform(get("/calc/divide").param("a", "10").param("b", "2"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }

}
