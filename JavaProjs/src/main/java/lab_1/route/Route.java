package lab_1.route;

import lab_1.Station;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Клас у якому описується маршрут для якогось транспорту.
 * Клас є набором точок між якими ходить транспорт
 */
public class Route {
    private String code;
    private ArrayList<Station> stations;

    protected Route(){
        stations = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public ArrayList<Station> getStations() {
        return stations;
    }

    /**
     * З цієї станції траспорт починає рухатись. Початок Маршруту
     * @return
     */
    public Station getStartStation() {
        return stations.get(0);
    }

    public int getStationsCount(){
        return stations.size();
    }
    /**
     *Тут траспорт закінчує рухатись. Кінець маршруту
     * @return
     */
    public Station getEndStation() {
        return stations.get(stations.size()-1);
    }

    protected void setCode(String code) {
        this.code = code;
    }

    /**
     * Присвоює маршруту переданний список станцій
     * @param stations
     */
    protected void setStations(ArrayList<Station> stations) {
        this.stations = stations;
    }

    /**
     * Додає станцію до маршруту
     * @param station
     */
    protected void addStation(Station station){
        this.stations.add(station);
    }

    /**
     * Видаляє станцію з маршруту
     * @param station
     */
    protected void removeStation(Station station){
        this.stations.remove(station);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return Objects.equals(code, route.code) && Objects.equals(stations, route.stations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, stations);
    }

    @Override
    public String toString() {
        return "Route{" +
                "code='" + code + '\'' +
                ", stations=" + stations +
                '}';
    }
}
