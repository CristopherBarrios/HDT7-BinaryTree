public class Association {
    String Español;
    String Ingles;

    public void setPabras(String Ingles,String Español) {
        this.Ingles = Ingles;
        this.Español = Español;
    }

    public String getpalabras() {
        return Ingles;
    }
    @Override
    public String toString() {
        return getpalabras();
    }
}


