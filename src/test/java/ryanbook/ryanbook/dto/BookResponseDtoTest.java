package ryanbook.ryanbook.dto;

import org.junit.jupiter.api.Test;
import ryanbook.ryanbook.web.dto.BookResponseDto;

import static org.assertj.core.api.Assertions.*;

class BookResponseDtoTest {

    @Test
    public void 롬복_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        BookResponseDto dto = new BookResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}