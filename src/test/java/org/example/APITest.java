package org.example;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertTrue;

import java.util.LinkedHashMap;
import java.util.List;

import org.testng.annotations.Test;

/**
 * Test class to validate api end-point.
 */
public class APITest
{
  /**
   * Api end point url.
   */
  private static final String endPoint = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";

  /**
   * Validate Category Name for "Carbon credits".
   */
  @Test
  public void testCategoryName_thenReturnValidName()
  {
    given().when().get(endPoint).then().body("Name", equalTo("Carbon credits"));
  }

  /**
   * Validate CanReList for True.
   */
  @Test
  public void testCategoryCanReList_thenReturnTrue()
  {
    given().when().get(endPoint).then().body("CanRelist", equalTo(true));
  }

  /**
   * Validate Promotions element with the Name = Gallery, then it's description contains text "Good position in category"
   */
  @Test
  public void testCategoryPromotions_whenNameIsGallery_theValidateDescription()
  {
    final List<LinkedHashMap> promotions = given().when().get(endPoint).then().extract().jsonPath().getList("Promotions");
    promotions.forEach(p -> {
      if (p.get("Name").equals("Gallery"))
      {
        assertTrue(p.get("Description").toString().contains("Good position in category"));
      }
    });
  }
}
