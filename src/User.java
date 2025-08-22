public class User {
    private String name;
    private Portfolio portfolio;

    public User(String name, double balance) {
        this.name = name;
        this.portfolio = new Portfolio(balance);
    }

    public String getName() {
        return name;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }
}
