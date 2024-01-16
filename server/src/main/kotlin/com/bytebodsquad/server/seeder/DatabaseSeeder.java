package com.bytebodsquad.server.seeder;

import com.bytebodsquad.server.exercisegenerator.entity.BodyArea;
import com.bytebodsquad.server.exercisegenerator.entity.Equipment;
import com.bytebodsquad.server.exercisegenerator.entity.Muscle;
import com.bytebodsquad.server.exercisegenerator.repository.BodyAreaRepository;
import com.bytebodsquad.server.exercisegenerator.repository.EquipmentRepository;
import com.bytebodsquad.server.exercisegenerator.repository.MuscleRepository;
import com.bytebodsquad.server.user.entity.HealthCondition;
import com.bytebodsquad.server.user.repository.HealthConditionRepository;
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
    private final BodyAreaRepository bodyAreaRepository;
    private final EquipmentRepository equipmentRepository;
    private final HealthConditionRepository healthConditionRepository;


    public DatabaseSeeder(MuscleRepository muscleRepository, BodyAreaRepository bodyAreaRepository, EquipmentRepository equipmentRepository, HealthConditionRepository healthConditionRepository) {
        this.muscleRepository = muscleRepository;
        this.bodyAreaRepository = bodyAreaRepository;
        this.equipmentRepository = equipmentRepository;
        this.healthConditionRepository = healthConditionRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        seedMuscleDB();
        seedBodyAreaDB();
        seedEquipmentDB();
        seedHealthConditionDB();
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

    public void seedBodyAreaDB() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    ResourceUtils.getFile("src/main/resources/data/AdaptiveFitness-BodyArea.csv")));

            String line;
            int index = 1;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] data = line.split(",");
                BodyArea bodyArea = new BodyArea();
                bodyArea.setId(data[0]);
                bodyArea.setName(data[1]);

                bodyAreaRepository.save(bodyArea);

                index++;
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void seedEquipmentDB() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    ResourceUtils.getFile("src/main/resources/data/AdaptiveFitness-Equipment.csv")));

            String line;
            int index = 1;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] data = line.split(",");
                Equipment equipment = new Equipment();
                equipment.setId(data[0]);
                equipment.setName(data[1]);

                equipmentRepository.save(equipment);

                index++;
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void seedHealthConditionDB() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    ResourceUtils.getFile("src/main/resources/data/AdaptiveFitness-HealthCondition.csv")));

            String line;
            int index = 1;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] data = line.split(",");
                HealthCondition healthCondition = new HealthCondition();
                healthCondition.setId(data[0]);
                healthCondition.setName(data[1]);

                healthConditionRepository.save(healthCondition);

                index++;
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
