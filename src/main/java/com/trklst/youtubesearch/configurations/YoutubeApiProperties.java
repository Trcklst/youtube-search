package com.trklst.youtubesearch.configurations;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("trklst.youtube.api")
public class YoutubeApiProperties {

    private String key;
}
