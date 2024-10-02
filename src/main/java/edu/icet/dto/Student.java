package edu.icet.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    private String fName;

    private String LName;

    private String age;

    private  String  address;

    private String phone;

    private String email;

    private String grade;

    @Lob
    @Column(name= "image" , columnDefinition = "LONGBLOB")
    private byte[] image;


}
