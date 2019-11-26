package com.trcklst.youtubesearch.configurations;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("trcklst.youtube.api")
public class YoutubeApiProperties {

    private String key;
    private String applicationName;
}
