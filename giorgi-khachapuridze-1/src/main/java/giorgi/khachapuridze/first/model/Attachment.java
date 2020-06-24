package giorgi.khachapuridze.first.model;

import lombok.ToString;

import javax.persistence.*;

import javax.persistence.Id;

public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pdfurl;

    @ToString.Exclude
    @OneToOne(mappedBy = "attachment", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

}
