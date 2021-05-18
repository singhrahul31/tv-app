package com.tvapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TvDiscovery {

    @JsonProperty("results")
    private List<TvSnapshot> tvShowList;
}
