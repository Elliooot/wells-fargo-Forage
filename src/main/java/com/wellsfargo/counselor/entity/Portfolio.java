import javax.persistence.*;

@Entity
public class Portfolio{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long portfolioID;

    @ManyToOne
    @JoinColumn(name = "clientID", nullable = false)
    private Client client;

    @Column(nullable = false)
    private String portfolioName;

    public Portfolio() {}
    public Portfolio(Client client, String portfolioName) {
        this.client = client;
        this.portfolioName = portfolioName;
    }
    public long getPortfolioID() {
        return portfolioID;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getPortfolioName() {
        return portfolioName;
    }
    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }
}