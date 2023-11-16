import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetIngredients() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String ingredients = theOrder.getIngredients();
        // Then
        assertEquals("Cheese & tomato sauce", ingredients);
    }

    @Test
    public void testPizzaWithExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(22), theCost);
    }

    @Test
    public void testPizzaWithExtraCheeseGetIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String ingredients = theOrder.getIngredients();
        //Then
        assertEquals("Cheese & tomato sauce & extra cheese", ingredients);
    }

    @Test
    public void testPizzaWithExtraCheeseAndPepperoniAndPineappleGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new PineappleDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(33), theCost);
    }

    @Test
    public void testPizzaWithExtraCheeseAndPepperoniAndPineappleGetIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new PineappleDecorator(theOrder);
        //When
        String ingredients = theOrder.getIngredients();
        //Then
        assertEquals("Cheese & tomato sauce & extra cheese & pepperoni & the best fucking pizza ingredient: ANANAS! <3", ingredients);
    }
}

