package br.com.icaro.movieinfo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieSummary {
    private String id;
    private String title;
    private String overview;
}
