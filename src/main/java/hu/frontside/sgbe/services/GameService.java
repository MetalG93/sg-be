package hu.frontside.sgbe.services;

import hu.frontside.sgbe.interfaces.IGameService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class GameService implements IGameService {

    @Override
    public List<Integer> getRandomNumbers() {
        Random r = new Random();
        List<Integer> numbers = new ArrayList<>();

        do {
            int number = r.nextInt(48) + 1;

            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        } while (numbers.size() < 6);

        return numbers.stream().sorted().collect(Collectors.toList());
    }
}
