package com.apothekeTask;

import com.apothekeTask.model.RepoInfo;
import com.apothekeTask.services.RepoServicesImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.apothekeTask.model.RepoInfo;

import com.apothekeTask.services.RepoServicesImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.UnorderedRequestExpectationManager;
import org.springframework.web.client.RestTemplate;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;


@RunWith(SpringRunner.class)
@RestClientTest(RepoServicesImpl.class)
public class ServiceImplTest {

    @Autowired
    RepoServicesImpl repoServices;

    @Autowired
    private MockRestServiceServer  server;
     @Autowired
    private ObjectMapper objectMapper;
    private static final String url = "https://api.github.com/search/repositories?q=cats";


    @Before
    public void setUp() throws Exception{
        server = MockRestServiceServer.bindTo(new RestTemplate()).build(new UnorderedRequestExpectationManager());


    }


    @Test
    public void expectedResque_whenReturn_thenSuccess(){
        server.expect(ExpectedCount.manyTimes(), requestTo(url)).andExpect(method(HttpMethod.GET)).andRespond(withSuccess());
    }

    @Test
    public void givenMockServerToRestService_bringResult_thenService() throws Exception {
        String detailsString = objectMapper.writeValueAsString(new RepoInfo());
        this.server.expect(requestTo(url))
                .andRespond(withSuccess(detailsString, MediaType.APPLICATION_JSON));

    }


    }

