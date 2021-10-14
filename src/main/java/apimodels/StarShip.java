package apimodels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class StarShip {
    @JsonProperty("name")
    private String name;
    @JsonProperty("model")
    private String model;
    @JsonProperty("manufacturer")
    private String manufacturer;
    @JsonProperty("cost_in_credits")
    private Long costInCredits;
    @JsonProperty("length")
    private Long length;
    @JsonProperty("max_atmosphering_speed")
    private String maxAtmospheringSpeed;
    @JsonProperty("crew")
    private String crew;
    @JsonProperty("passengers")
    private String passengers;
    @JsonProperty("cargo_capacity")
    private Long cargoCapacity;
    @JsonProperty("consumables")
    private String consumables;
    @JsonProperty("hyperdrive_rating")
    private Double hyperdriveRating;
    @JsonProperty("MGLT")
    private String mglt;
    @JsonProperty("starship_class")
    private String starshipClass;
    @JsonProperty("pilots")
    private String[] pilots;
    @JsonProperty("films")
    private String[] films;
    @JsonProperty("created")
    private Date created;
    @JsonProperty("edited")
    private Date edited;
    @JsonProperty("url")
    private String url;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Long getCostInCredits() {
        return costInCredits;
    }

    public Long getLength() {
        return length;
    }

    public String getMaxAtmospheringSpeed() {
        return maxAtmospheringSpeed;
    }

    public String getCrew() {
        return crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public Long getCargoCapacity() {
        return cargoCapacity;
    }

    public String getConsumables() {
        return consumables;
    }

    public Double getHyperdriveRating() {
        return hyperdriveRating;
    }

    public String getMglt() {
        return mglt;
    }

    public String getStarshipClass() {
        return starshipClass;
    }

    public String[] getPilots() {
        return pilots;
    }

    public String[] getFilms() {
        return films;
    }

    public Date getCreated() {
        return created;
    }

    public Date getEdited() {
        return edited;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarShip starShip = (StarShip) o;
        return Objects.equals(name, starShip.name)
                && Objects.equals(model, starShip.model)
                && Objects.equals(manufacturer, starShip.manufacturer)
                && Objects.equals(costInCredits, starShip.costInCredits)
                && Objects.equals(length, starShip.length)
                && Objects.equals(maxAtmospheringSpeed, starShip.maxAtmospheringSpeed)
                && Objects.equals(crew, starShip.crew)
                && Objects.equals(passengers, starShip.passengers)
                && Objects.equals(cargoCapacity, starShip.cargoCapacity)
                && Objects.equals(consumables, starShip.consumables)
                && Objects.equals(hyperdriveRating, starShip.hyperdriveRating)
                && Objects.equals(mglt, starShip.mglt)
                && Objects.equals(starshipClass, starShip.starshipClass)
                && Arrays.equals(pilots, starShip.pilots)
                && Arrays.equals(films, starShip.films)
                && Objects.equals(created, starShip.created)
                && Objects.equals(edited, starShip.edited)
                && Objects.equals(url, starShip.url);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, model, manufacturer, costInCredits, length, maxAtmospheringSpeed, crew, passengers, cargoCapacity, consumables, hyperdriveRating, mglt, starshipClass, created, edited, url);
        result = 31 * result + Arrays.hashCode(pilots);
        result = 31 * result + Arrays.hashCode(films);
        return result;
    }

    @Override
    public String toString() {
        return "StarShip{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", costInCredits=" + costInCredits +
                ", length=" + length +
                ", maxAtmospheringSpeed='" + maxAtmospheringSpeed + '\'' +
                ", crew='" + crew + '\'' +
                ", passengers='" + passengers + '\'' +
                ", cargoCapacity=" + cargoCapacity +
                ", consumables='" + consumables + '\'' +
                ", hyperdriveRating=" + hyperdriveRating +
                ", mglt='" + mglt + '\'' +
                ", starshipClass='" + starshipClass + '\'' +
                ", pilots=" + Arrays.toString(pilots) +
                ", films=" + Arrays.toString(films) +
                ", created=" + created +
                ", edited=" + edited +
                ", url='" + url + '\'' +
                '}';
    }
}

