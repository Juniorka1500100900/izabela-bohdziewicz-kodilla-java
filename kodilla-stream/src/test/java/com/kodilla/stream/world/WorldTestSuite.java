package com.kodilla.stream.world;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);
        europe.addCountry(new Country("Poland", new BigDecimal("38576")));
        europe.addCountry(new Country("Germany", new BigDecimal("89764")));
        africa.addCountry(new Country("Ghana",new BigDecimal("23758")));
        africa.addCountry(new Country("Mozambique",new BigDecimal("31546")));
        asia.addCountry(new Country("China", new BigDecimal("28675067")));
        asia.addCountry(new Country("Vietnam", new BigDecimal("10473662")));

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantityPeople = new BigDecimal("39332373");
        assertEquals(expectedQuantityPeople, totalPeople);

    }
}