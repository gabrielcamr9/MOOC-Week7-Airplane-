
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Airport {

    private Scanner reader;
    private HashMap<String, Airplane> planes;
    private ArrayList<Flight> flights;

    public Airport(Scanner reader) {
        this.reader = reader;
        planes = new HashMap<String, Airplane>();
        flights = new ArrayList<Flight>();
    }

    public void start() {
        airportPanel();
        flightService();
    }

    private void airportPanel() {
        System.out.print("Airport panel\n"
                + "--------------------\n"
                + "\n");
        String temp;
        while (true) {
            System.out.print("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit\n"
                    + "> ");
            temp = reader.nextLine();
            if (temp.contains("1")) {
                addPlane();
            } else if (temp.contains("2")) {
                addFlight();
            } else if (temp.contains("x")) {
                break;
            }
        }
    }

    private void addPlane() {
        System.out.print("Give plane ID: ");
        String temp = reader.nextLine();
        System.out.print("Give plane capacity: ");
        planes.put(temp, new Airplane(temp, Integer.parseInt(reader.nextLine())));
    }

    private void addFlight() {
        System.out.print("Give plane ID:");
        Airplane temp = planes.get(reader.nextLine());
        System.out.print("Give departure airport code: ");
        String temp1 = reader.nextLine();
        System.out.print("Give destination airport code: ");
        flights.add(new Flight(temp, temp1, reader.nextLine()));
    }

    private void flightService() {
        System.out.print("Flight service\n"
                + "------------\n"
                + "\n");
        String temp;
        while (true) {
            System.out.print("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit\n"
                    + "> ");
            temp = reader.nextLine();
            if (temp.contains("1")) {
                printPlanes();
            } else if (temp.contains("2")) {
                printFlights();
            } else if (temp.contains("3")) {
                airplaneInfo();
            } else if (temp.contains("x")) {
                break;
            }
        }
    }

    public void printFlights() {
        for(Flight f: flights){
            System.out.println(f);
        }
    }

    public void printPlanes() {
        for (String key : planes.keySet()) {
            System.out.println(planes.get(key));
        }
    }

    public void airplaneInfo() {
        System.out.print("Give plane ID:");
        System.out.println(planes.get(reader.nextLine()));
    }
}
