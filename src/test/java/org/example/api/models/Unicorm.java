package org.example.api.models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Builder
@Data
public class Unicorm {
    private String name;
    private String color;
    @SerializedName("_id")
    private String id;

}

