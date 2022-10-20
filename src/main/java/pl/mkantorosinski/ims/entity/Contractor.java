package pl.mkantorosinski.ims.entity;


import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="contractors")
@NoArgsConstructor
public class Contractor {

    @Id
    private long id;
    private String name;
    private String address;
    @Column(name = "NIP")
    private String nip;
    @Column(name = "REGON")
    private String regon;
    private String email;
    private String contact;
    @Column(name = "notices")
    private String notice;
    @OneToMany(mappedBy = "contractor")
    private List<Contract> contracts;
}
