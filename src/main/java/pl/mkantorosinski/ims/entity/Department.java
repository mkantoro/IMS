package pl.mkantorosinski.ims.entity;


import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="departments")
@NoArgsConstructor
public class Department {

    @Id
    private long id;
    private String name;

    @OneToMany(mappedBy = "department")
    private List<ItemProp> itemsprop;
}
