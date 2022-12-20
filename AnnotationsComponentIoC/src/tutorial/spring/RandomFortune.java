package tutorial.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Component
@Qualifier("randomFortune")
public class RandomFortune implements FortuneService {

    private File file = new File("D:/Spring/AnnotationsComponentIoC/src/fortune_services.txt");
    private List<String> fortunes = new ArrayList<>();
    private Random random = new Random();

    @PostConstruct
    private void loadFortunes() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                fortunes.add(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public String getFortune() {
        random.nextInt(fortunes.size());
        return fortunes.get(random.nextInt(fortunes.size()));
    }


}
