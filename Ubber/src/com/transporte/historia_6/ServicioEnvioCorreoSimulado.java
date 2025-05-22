package Ubber.src.com.transporte.historia_6;

public class ServicioEnvioCorreoSimulado {
    public void enviarCorreo(String destinatario, String asunto, String cuerpo) {
        System.out.println("  [ServicioEnvioCorreoSimulado] Enviando correo a: " + destinatario);
        System.out.println("    Asunto: " + asunto);
        System.out.println("    Cuerpo (extracto): " + cuerpo.substring(0, Math.min(cuerpo.length(), 100)) + "...");
    }

    public void adjuntarFactura(String destinatario, Factura factura) {
        String asunto = "Tu Factura de Viaje #" + factura.getId();
        String cuerpo = "Estimado(a) " + factura.getPasajeroNombre() + ",\n\n" +
                        "Adjuntamos tu factura por el viaje realizado. \n\n" +
                        "Monto Total: $" + String.format("%.2f", factura.getMontoTotal()) +
                        "\n\nAtentamente,\nTu Servicio de Transporte";
        enviarCorreo(destinatario, asunto, cuerpo);
    }
}
