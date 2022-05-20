package com.example.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document(value = "zips")
public class Zip {
    @Id
    private String _id;
    private String city;
    private ArrayList<Double> loc;
    private Integer pop;
    private String state;
}


