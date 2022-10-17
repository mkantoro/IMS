package pl.mkantorosinski.ims.entity;




import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="contracts")
@NoArgsConstructor
@Getter
@Setter
public class Contract {

    public Contract(String signature, Contractor contractor, Date agreementDate, Date startDate, Date endDate, BigDecimal value, String descritionInvoices, String notice, User respUser) {
        this.signature = signature;
        this.contractor = contractor;
        this.agreementDate = agreementDate;
        this.startDate = startDate;
        this.endDate = endDate;
        Value = value;
        this.descritionInvoices = descritionInvoices;
        this.notice = notice;
        this.respUser = respUser;
    }

    @Id
    private long id;
    private String signature;
    @ManyToOne
    @JoinColumn(name = "contractor")
    private Contractor contractor;
    @Column(name = "agreement_date")
    private Date agreementDate;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name="end_date")
    private Date endDate;
    @Column(name = "contract_value")
    private BigDecimal Value;
    @Column(name= "invoice_desc")
    private String descritionInvoices;
    @Column(name="notices")
    private String notice;
    @ManyToOne
    @JoinColumn(name = "respUser")
    private User respUser;
}
