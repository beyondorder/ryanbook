package ryanbook.ryanbook.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BookResponseDto {

    private final String name;
    private final int amount;

}
