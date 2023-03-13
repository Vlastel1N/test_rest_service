package ru.students.test_rest_service.model;


import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Max;


@Data
@Builder
public class Request {

    @NotBlank

}
