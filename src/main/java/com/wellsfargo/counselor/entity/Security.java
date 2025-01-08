import javax.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long securityID;

    @ManyToOne
    @JoinColumn(name = "portfolioID", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private double purchacePrice;

    @Column(nullable = false)
    private int quantity;

    public Security() {}
    public Security(Portfolio portfolio, String name, String category, String purchaseDate, double purchacePrice, int quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchacePrice = purchacePrice;
        this.quantity = quantity;
    }

    public Long getSecurityID() {
        return securityID;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }
    public void setPortfolio(Portfolio portfolio){
        this.portfolio = portfolio;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getPurchaseDate() {
        return purchaseDate;
    }
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    public double getPurchacePrice() {
        return purchacePrice;
    }
    public void setPurchacePrice(double purchacePrice) {
        this.purchacePrice = purchacePrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}