import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WeatherApp {
        private static final String API_KEY = "API_KEY";

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the Name City: ");
            String city = scanner.nextLine();
            scanner.close();

            // construir url da API
            String url = String.format("https://api.weatherbit.io/v2.0/current?city=%s&key=%s", city, API_KEY);

            // Criando o Cliente
            HttpClient cliente = HttpClient.newHttpClient();

            // Criando a requisição
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            cliente.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenAccept(response -> {
                        if (response.statusCode() == 200){
                            System.out.println("Weather Informations: ");
                            System.out.println(response.body());
                        } else {
                            System.out.println("error: " + response.statusCode());
                            System.out.println(response.body());
                        }
                    })

                    .join();
        }
}