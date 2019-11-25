package com.trklst.youtubesearch.core;

import com.trklst.youtubesearch.core.dto.SearchIn;
import com.trklst.youtubesearch.core.dto.out.SearchDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/youtube/search")
@RequiredArgsConstructor
public class SearchController {

    private final YoutubeService youtubeService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public SearchDto searchDto(@RequestBody SearchIn searchIn) throws IOException {
        return youtubeService.search(searchIn);
    }
}
