package com.therapJavaFest.jagoronBD.form;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class HarassmentForm {


    private Long id;

    private String fullName;

    private String byWho;

    private String place;

    private String email;

    private String address;

    private String description;

}
