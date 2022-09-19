package com.apothekeTask.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
public class SearchBody {

    @JsonProperty("language")
    private String language;
    @JsonProperty("per_page")
    private Integer perPage;
    @JsonProperty("popular_repository")
    private Boolean popularRepository;
    @JsonProperty("created_date")
    private String createdDate;
    @JsonProperty("direction_date")
    private String directionDate;
    @JsonProperty("specific_word")
    private String specificWord;
}
