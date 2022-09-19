package com.apothekeTask.services;

import com.apothekeTask.model.RepoInfo;
import com.apothekeTask.model.SearchBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class RepoServicesImpl implements RepoService {
    private RestTemplate restTemplate;

    @Autowired
    public RepoServicesImpl(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    @Value("${resources.url}")
    private  String resources;



    @Override
    public ResponseEntity<?> customSearch(List<SearchBody> searchBody) throws NullPointerException
    {
        try {
            StringBuilder builder=new StringBuilder();
            RepoInfo response=null;
            List<RepoInfo>responseList=new ArrayList<>();

            for(SearchBody instance:searchBody){
               builder.setLength(0);
               builder.append(resources);
                if(instance.getSpecificWord()!=null){
                    builder.append(instance.getSpecificWord()+" ");
                }
                if(instance.getCreatedDate()!=null&&instance.getDirectionDate()!=null){
                    builder.append("created:"+instance.getDirectionDate()+instance.getCreatedDate()+" ");
                }
                if(instance.getLanguage()!=null){
                    builder.append("language:"+instance.getLanguage());
                }

                if(instance.getPopularRepository()==true){
                    builder.append("&sort=stars&order=desc");
                }
                if(instance.getPerPage()!=null){
                    builder.append("&per_page="+instance.getPerPage());
                }

//                String uri=;
//                UriComponents uriComponents = ;
                response = restTemplate.getForObject(UriComponentsBuilder.fromHttpUrl(builder.toString()).build(false).toUri() ,RepoInfo.class);
                responseList.add(response);
            }


            return new ResponseEntity<>(responseList, HttpStatus.OK);
        }catch (Exception e){

            return new ResponseEntity<>("Found Error!, Please try again later. "+"\nDetail Error message is  "+Arrays.stream(e.getStackTrace()).findFirst()+" is "+e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
