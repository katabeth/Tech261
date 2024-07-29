package com.sparta.kch.springweb;

import org.hamcrest.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@AutoConfigureMockMvc
public class SpringMockMVCTests {

    @Autowired
    private WebApplicationContext webApplicationContext;
    @Autowired
    private MockMvc mockMvc;
    @BeforeEach
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                        .apply(SecurityMockMvcConfigurers.springSecurity())
                        .build();
    }

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

    @Test
    public void testWelcomeContainsAttributeDate() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().attribute("date", Matchers.notNullValue()));
    }
    @Test
    public void testWelcomePageContainsHeaderCharset() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.header().string("Content-Type","text/html;charset=UTF-8"));
    }
    @Test
    @WithMockUser(username = "user", roles = "USER")
    void testAuthorsPage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/authors"))
                .andDo(MockMvcResultHandlers.print());
    }
}
