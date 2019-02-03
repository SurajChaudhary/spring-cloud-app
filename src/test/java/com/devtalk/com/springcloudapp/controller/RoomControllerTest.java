package com.devtalk.com.springcloudapp.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringJUnit4ClassRunner.class)
public class RoomControllerTest {

    private MockMvc mvc;

    @InjectMocks
    private RoomController roomController;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(roomController).build();
    }

    @Test
    public void testHelloEndPoint() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/roomservice/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }

    @Test
    public void testGetRooms() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/roomservice/rooms"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }



}
