# weather-app-java
# Weather App Java

A simple weather forecasting application built using Java that consumes the Weatherbit API.

## Features

- Fetches real-time weather data for a specified city.
- Displays current weather conditions such as temperature, humidity, and more.
- Easy-to-extend and integrate with additional features like multi-city support or historical weather data.

## Technologies Used

- Java 11+
- HttpClient (Java built-in library)
- Weatherbit API

## Getting Started

### Prerequisites

- JDK 11 or later
- An active [Weatherbit API Key](https://www.weatherbit.io/).

### Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/weather-app-java.git
    cd weather-app-java
    ```

2. Open the project in your preferred IDE.

3. Replace the placeholder API key in the `WeatherApp.java` file:
    ```java
    private static final String API_KEY = "YOUR_API_KEY";
    ```

4. Run the application:
    ```bash
    javac WeatherApp.java
    java WeatherApp
    ```

### How to Use

1. Run the application.
2. Enter the name of the city for which you want the weather information.
3. The current weather details will be displayed in the console.

### Example Output

Enter the city name: London
Weather Information:
{
"data": [
{
"temp": 15.6,
"city_name": "London",
...
}
]
}
