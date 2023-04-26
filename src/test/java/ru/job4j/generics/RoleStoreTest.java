package ru.job4j.generics;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoleStoreTest {
    @Test
    void whenAddAndFindThenRoleIsMonster() {
        RoleStore store = new RoleStore();
        store.add(new User("1", "Monster"));
        User result = store.findById("1");
        assertThat(result.getUsername()).isEqualTo("Monster");
    }
}