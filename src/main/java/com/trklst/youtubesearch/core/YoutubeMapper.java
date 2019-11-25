package com.trklst.youtubesearch.core;

import com.google.api.services.youtube.model.SearchListResponse;
import com.google.api.services.youtube.model.SearchResult;
import com.trklst.youtubesearch.core.dto.out.SearchDto;
import com.trklst.youtubesearch.core.dto.out.SearchDtoItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface YoutubeMapper {

    SearchDto map(SearchListResponse searchListResponse);

    @Mapping(target = "videoId", source = "id.videoId")
    @Mapping(target = "title", source = "snippet.title")
    @Mapping(target = "thumbnail", source = "snippet.thumbnails.default.url")
    SearchDtoItem mapItem(SearchResult searchResult);
}
