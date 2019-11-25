package com.trklst.youtubesearch.core.dto.out;

import lombok.Data;

import java.util.List;

@Data
public class SearchDto {

    private List<SearchDtoItem> items;
}
