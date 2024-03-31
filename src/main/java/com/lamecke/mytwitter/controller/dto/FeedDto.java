package com.lamecke.mytwitter.controller.dto;

import com.lamecke.mytwitter.controller.dto.FeedItemDto.FeedItemDto;

import java.util.List;

public record FeedDto(List<FeedItemDto> feedItensDtos,
                      int page,
                      int pageSize,
                      int totalPages,
                      Long totalElements) {
}
