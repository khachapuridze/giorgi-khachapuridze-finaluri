package giorgi.khachapuridze.first.model;

import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "author",cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Book>books=new ArrayList<>();
}
