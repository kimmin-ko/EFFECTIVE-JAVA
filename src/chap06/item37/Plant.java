package chap06.item37;

import java.util.*;
import static java.util.stream.Collectors.*;

public class Plant {
    enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return name;
    }

    private static void test() {
        Plant[] garden = new Plant[8];
        garden[0] = new Plant("ANNUAL_1", LifeCycle.ANNUAL);
        garden[1] = new Plant("ANNUAL_2", LifeCycle.ANNUAL);
        garden[2] = new Plant("ANNUAL_3", LifeCycle.ANNUAL);
        garden[3] = new Plant("ANNUAL_4", LifeCycle.ANNUAL);

        garden[4] = new Plant("PERENNIAL_1", LifeCycle.PERENNIAL);
        garden[5] = new Plant("PERENNIAL_2", LifeCycle.PERENNIAL);
        garden[6] = new Plant("PERENNIAL_3", LifeCycle.PERENNIAL);

        garden[7] = new Plant("BIENNIAL_1", LifeCycle.BIENNIAL);


        // key   -> ANNUAL, PERENNIAL, BIENNIAL
        // value -> Set<Plant>
        Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);

        for(Plant.LifeCycle lc : Plant.LifeCycle.values())
            plantsByLifeCycle.put(lc, new HashSet<>());

        for(Plant p : garden)
            plantsByLifeCycle.get(p.lifeCycle).add(p);

        System.out.println(plantsByLifeCycle);
    }

    private static void test_2() {
        Plant[] garden = new Plant[8];
        garden[0] = new Plant("ANNUAL_1", LifeCycle.ANNUAL);
        garden[1] = new Plant("ANNUAL_2", LifeCycle.ANNUAL);
        garden[2] = new Plant("ANNUAL_3", LifeCycle.ANNUAL);
        garden[3] = new Plant("ANNUAL_4", LifeCycle.ANNUAL);

        garden[4] = new Plant("PERENNIAL_1", LifeCycle.PERENNIAL);
        garden[5] = new Plant("PERENNIAL_2", LifeCycle.PERENNIAL);
        garden[6] = new Plant("PERENNIAL_3", LifeCycle.PERENNIAL);

        garden[7] = new Plant("BIENNIAL_1", LifeCycle.BIENNIAL);

        System.out.println(Arrays.stream(garden)
            .collect(groupingBy(p -> p.lifeCycle)));
    }

    public static void main(String[] args) {
        test();
    }
}


















