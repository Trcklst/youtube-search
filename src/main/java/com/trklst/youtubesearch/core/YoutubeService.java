package com.trklst.youtubesearch.core;

import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.SearchListResponse;
import com.trklst.youtubesearch.configurations.YoutubeApiProperties;
import com.trklst.youtubesearch.core.dto.SearchIn;
import com.trklst.youtubesearch.core.dto.out.SearchDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class YoutubeService {

    private final YouTube youTube;
    private final YoutubeApiProperties youtubeApiProperties;
    private final YoutubeMapper youtubeMapper;

    private final static String ORDER_BY_VIEWS_NUMBER = "viewCount";
    private final static String VIDEO_TYPE = "video";

    SearchDto search(SearchIn searchIn) throws IOException {
        YouTube.Search.List request = youTube.search().list("snippet");
        SearchListResponse searchListResponse = request.setMaxResults(searchIn.getItemsNumber())
                .setQ(searchIn.getQuery())
                .setOrder(ORDER_BY_VIEWS_NUMBER)
                .setKey(youtubeApiProperties.getKey())
                .setType(VIDEO_TYPE)
                .execute();
        return youtubeMapper.map(searchListResponse);
    }
}
