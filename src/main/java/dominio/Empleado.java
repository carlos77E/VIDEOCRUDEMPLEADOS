
package dominio;

public class Empleado {
    private int codigoEmpleados;
    private String nombre;
    private String apellido;
    private int edad;
    private double sueldo;
    
    public Empleado(){
        
    }

    public Empleado(int codigoEmpleado) {
        this.codigoEmpleados = codigoEmpleado;
    }

    public Empleado(String nombre, String apellido, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public Empleado(int codigoEmpleado, String nombre, String apellido, int edad, double sueldo) {
        this.codigoEmpleados = codigoEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleados;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleados = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigoEmpleado=" + codigoEmpleados + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
