package ru.job4j.assertj;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameLoadTest {
    @Test
    void checkEmpty() {
        NameLoad nameLoad = new NameLoad();
        assertThatThrownBy(nameLoad::getMap)
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("no data");
    }

    @Test
    void checkNamesArray() {
        NameLoad nameLoad = new NameLoad();
        String[] srt = new String[0];
        assertThatThrownBy(() -> nameLoad.parse(srt))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("array");
    }

    @Test
    void checkNameHasEquals() {
        NameLoad nameLoad = new NameLoad();
        assertThatThrownBy(() -> nameLoad.parse("keyValue"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("keyValue")
                .hasMessageContaining("does not contain");
    }

    @Test
    void checkNameStartEquals() {
        NameLoad nameLoad = new NameLoad();
        assertThatThrownBy(() -> nameLoad.parse("=keyValue"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("=keyValue")
                .hasMessageContaining("does not contain");
    }

    @Test
    void checkNameFinishEquals() {
        NameLoad nameLoad = new NameLoad();
        assertThatThrownBy(() -> nameLoad.parse("keyValue="))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("keyValue=")
                .hasMessageContaining("does not contain");
    }
}