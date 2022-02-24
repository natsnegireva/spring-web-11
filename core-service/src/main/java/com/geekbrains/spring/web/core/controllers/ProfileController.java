package com.geekbrains.spring.web.core.controllers;

import com.geekbrains.spring.web.api.core.ProfileDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/profile")
@Tag(name = "Профиль пользователя", description = "Методы работы с профилем пользователя")
public class ProfileController {

    @GetMapping
    @Operation(
            summary = "Запрос на получение пользователя по имени",
            responses = {
                    @ApiResponse(
                            description = "Успешный ответ", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = ProfileDto.class))
                    )
            }
    )
    public ProfileDto getCurrentUserInfo(
            @PathVariable @Parameter(description = "Имя пользователя", required = true) @RequestHeader String username
    ) {
                return new ProfileDto(username);
    }
}
