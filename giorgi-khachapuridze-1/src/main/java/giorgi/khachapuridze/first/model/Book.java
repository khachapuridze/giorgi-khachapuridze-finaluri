package giorgi.khachapuridze.first.model;

import lombok.ToString;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;


    @ToString.Exclude
    @ManyToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Author> author = new ArrayList<>();

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Attachment> attachments = new ArrayList<>();

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Tag> tags = new ArrayList<>();
}
