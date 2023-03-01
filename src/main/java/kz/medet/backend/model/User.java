package kz.medet.backend.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_table")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String pNo;
    private String address;


}
