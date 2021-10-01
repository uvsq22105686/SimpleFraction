public class Fraction {
    private int denumerateur;
    private int numerateur;
    public Fraction(int denumerateur,int numerateur) {
        this.denumerateur=denumerateur;
        this.numerateur=numerateur;

    }
    public String toString()
    {
        String str = this.numerateur + "et " + this.denumerateur;
        return str;
    }
}
