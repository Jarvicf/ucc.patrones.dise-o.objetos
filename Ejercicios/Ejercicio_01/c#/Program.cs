// Patrones de Diseño Orientado a Objetos

class BookingFacade
{
    private HotelAPI hotelAPI;
    private PaymentService paymentService;


    public BookingFacade()
    {
        this.hotelAPI = new HotelAPI();
        this.paymentService = new PaymentService();
    }

    public void reservarHabitacion(String usuario, String hotel, double monto)
    {
        hotelAPI.buscarHotel(hotel);
        paymentService.procesarPago(usuario, monto);
        Console.WriteLine("Reserva completada para: " + usuario);
    }

}

class HotelAPI
{
    public void buscarHotel(string hotel)
    {
        Console.WriteLine("Buscando disponibilidad en " + hotel);
    }
}

class PaymentService
{
    public void procesarPago(String usuario, double monto)
    {
        Console.WriteLine("Procesando pago de $" + monto + " para " + usuario);
    }
}

// Cliente
public class Cliente
{
    public static void Main(String[] args)
    {
        BookingFacade booking = new BookingFacade();
        booking.reservarHabitacion("Juan Pérez", "Hotel Plaza", 150.00);
        booking.reservarHabitacion("Jarvic Balanta", "Hotel Toro", 250.00);

    }
}



//Console.WriteLine("Hello, World!");
