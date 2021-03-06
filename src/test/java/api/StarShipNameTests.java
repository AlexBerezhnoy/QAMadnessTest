package api;

import apimodels.StarShip;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;

@Feature("Rest API")
@Story("StarShips")
public class StarShipNameTests {
    private final String URL = "https://swapi.dev/api/starships/";
    private int shipId = 9;
    private String expectedName = "Death Star";

    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void nameStarShipsStringTest() {
        RestAssured
                .given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .get(URL+shipId)
                .then()
                .statusCode(200).and().body("name", equalTo(expectedName))
                .log().body();
            }

    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void nameStarShipsObjectTest() {
        assertEquals(getStarShipNamesByID(shipId), expectedName, "Name isn't correct!!!");
    }

    private String getStarShipNamesByID (int shipId) {
        return  RestAssured
                .given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .when()
                .get(URL + shipId)
                .then()
                .statusCode(200).extract().body()
                .as(StarShip.class).getName();
    }
}

