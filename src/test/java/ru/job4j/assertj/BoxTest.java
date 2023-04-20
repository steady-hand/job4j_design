package ru.job4j.assertj;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoxTest {
    @Test
    void isThisSphere() {
        Box box = new Box(0, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Sphere")
                .endsWith("re");
    }

    @Test
    void isExistSph() {
        Box box = new Box(0, 10);
        boolean result = box.isExist();
        assertThat(result).isTrue();
    }

    @Test
    void getNumberSph() {
        Box box = new Box(0, 10);
        int rsl = box.getNumberOfVertices();
        assertThat(rsl).isEqualTo(0)
                .isZero()
                .isLessThan(1);
    }

    @Test
    void getAreaSph() {
        Box box = new Box(0, 10);
        double rsl = box.getArea();
        assertThat(rsl).isEqualTo(1256.6370614359173)
                .isCloseTo(1256, Percentage.withPercentage(1.0d));
    }
}