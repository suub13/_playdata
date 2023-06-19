package Author.Author2;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this(name, authors, price, 0);
    }
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        if ((authors !=null) && (authors.length != 0)){
            StringBuilder ans = new StringBuilder(authors[0].toString());
            for (int i=1; i<authors.length; i++){
                ans.append(", " );
                ans.append(authors[i].toString());
            }
            return String.format("Book[name=%s, authors={%s}, price=%.2f, qty=%d", name, ans.toString(), price, qty);
        } else{ return String.format("Book[name=%s, authors={}, price=%.2f, qty=%d", name, price, qty);}

    }

    public String getAuthorNames(){
        if ((authors != null) && (authors.length != 0)){
            StringBuilder ans = new StringBuilder();
            for (Author i: authors){
                ans.append(i.getName());
                if (i != authors[authors.length-1]){
                    ans.append(", ");
                }
            }
            return ans.toString();
        } else{ return "";}
    }
}
