package br.com.icaro.moviecatalogservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
public class UserRating {
    private String userId;
    private List<Rating> ratings;
}
