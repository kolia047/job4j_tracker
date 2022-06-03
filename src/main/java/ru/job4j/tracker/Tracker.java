package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] items1 = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null) {
                items1[size] = item;
                size++;
            }
        }
        items1 = Arrays.copyOf(items1, size);
        return items1;
    }

    public Item[] findByName(String key) {
        Item[] items2 = new Item[items.length];
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            Item item = items[i];
            if (key.equals(item.getName())) {
                items2[size] = item;
                size++;
            }
        }
        items2 = Arrays.copyOf(items2, size);
        return items2;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        items[index] = item;
        return true;
    }
}