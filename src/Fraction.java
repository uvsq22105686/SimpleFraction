public class Fraction {
    private int denominateur;
    private int numerateur;
    public Fraction(int denominateur,int numerateur) {
        this.denominateur=denominateur;
        this.numerateur=numerateur;

    }
    public String toString()
    {
        String str = this.numerateur + "et " + this.denominateur;
        return str;
    }
}
