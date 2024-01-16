package com.bytebodsquad.server.seeder;

import com.bytebodsquad.server.exercisegenerator.entity.Muscle;
import com.bytebodsquad.server.exercisegenerator.repository.MuscleRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.UUID;

@Component
public class DatabaseSeeder implements ApplicationRunner {

    private final MuscleRepository muscleRepository;

    public DatabaseSeeder(MuscleRepository muscleRepository) {
        this.muscleRepository = muscleRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        seedMuscleDB();
    }

    public void seedMuscleDB() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    ResourceUtils.getFile("src/main/resources/data/AdaptiveFitness-Muscle.csv")));

            String line;
            int index = 1;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] data = line.split(",");
                Muscle muscle = new Muscle();
                muscle.setId(data[0]);
                muscle.setName(data[1]);

                muscleRepository.save(muscle);

                index++;
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
