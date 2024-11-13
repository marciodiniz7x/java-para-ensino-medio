public class Pitagoras {
    private double catetoOposto;
    private double catetoAdj;

    public double getCatetoOposto() {
        return catetoOposto;
    }

    public void setCatetoOposto(double catetoOposto) {
        this.catetoOposto = catetoOposto;
    }

    public double getCatetoAdj() {
        return catetoAdj;
    }

    public void setCatetoAdj(double catetoAdj) {
        this.catetoAdj = catetoAdj;
    }

    public double calcularHipotenusa() {
        return Math.sqrt((catetoAdj*catetoAdj) + (catetoOposto * catetoOposto));
    }
}
