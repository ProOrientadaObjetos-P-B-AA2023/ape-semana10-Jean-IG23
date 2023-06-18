package paquete2;

public class Prestamo {
    public Persona beneficiario;
    public int prestamoMeses;
    public String ciudadPrestamo;

    public Prestamo(Persona beneficiario, int prestamoMeses, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.prestamoMeses = prestamoMeses;
        this.ciudadPrestamo = ciudadPrestamo;
    }

    public void setCiudadPrestamo() {
        this.ciudadPrestamo = ciudadPrestamo.toLowerCase();
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "beneficiario=" + beneficiario +
                ", prestamoMeses=" + prestamoMeses +
                ", ciudadPrestamo='" + ciudadPrestamo + '\'' +
                '}';
    }
}
