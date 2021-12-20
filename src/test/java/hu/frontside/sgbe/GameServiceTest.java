package hu.frontside.sgbe;

import hu.frontside.sgbe.services.GameService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class GameServiceTest {

    private GameService unit;

    @BeforeEach
    public void init(){
        unit = new GameService();
    }

    @Test
    public void randomNumberTest(){
        List<Integer> randomNumbers = unit.getRandomNumbers();
        assertEquals(6, randomNumbers.size());
        assertEquals(randomNumbers, randomNumbers.stream().sorted().collect(Collectors.toList()));
    }
}
