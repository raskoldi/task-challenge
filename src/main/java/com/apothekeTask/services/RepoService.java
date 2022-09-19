package com.apothekeTask.services;


import com.apothekeTask.model.RepoInfo;
import com.apothekeTask.model.SearchBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public interface RepoService {


       public ResponseEntity<?> customSearch(List<SearchBody> searchBody);


}
