package com.sparta.kch.springweb;

import org.hamcrest.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class SpringMockMVCTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testWelcomePage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void testContentContainsWelcome() throws Exception {
       String content = mockMvc.perform(MockMvcRequestBuilders.get("/"))
               .andReturn()
               .getResponse()
               .getContentAsString();
        MatcherAssert.assertThat(content, Matchers.containsString("Welcome"));
    }

    @Test
    public void testWelcomePageExpectations() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Welcome")));
    }
}
