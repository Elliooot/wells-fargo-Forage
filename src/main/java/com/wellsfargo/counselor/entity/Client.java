import javax.persistence.*;

@Entity
public class Client{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long clientID;

    @ManyToOne
    @JoinColumn(name = "financialAdvisorID", nullable = false)
    private FinancialAdvisor financialAdvisor;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    public Client() {}
    public Client(FinancialAdvisor financialAdvisor, String name, String email) {
        this.financialAdvisor = financialAdvisor;
        this.name = name;
        this.email = email;
    }

    public long getClientID() {
        return clientID;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}