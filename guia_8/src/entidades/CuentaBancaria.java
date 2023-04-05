/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author ALEXIS
 */
public class CuentaBancaria {
     
    private int numeroDeCuenta ;
    private long dniCliente ;
    private double saldoActual ;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroDeCuenta, long dniCliente, double saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroDeCuenta=" + numeroDeCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }
    
    
      
}
