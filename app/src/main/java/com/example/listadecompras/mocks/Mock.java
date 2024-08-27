package com.example.listadecompras.mocks;

import com.example.listadecompras.models.Item;

import java.util.ArrayList;
import java.util.List;

public class Mock {
    public static List<Item> items  = new ArrayList<>();

    public static void doMock() {
        setMockedItems();
    }

    private static void setMockedItems() {
        items.add(new Item(1, "Item 1", 10.0, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries"));
        items.add(new Item(2, "Item 2", 20.0, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"));
        items.add(new Item(3, "Item 3", 30.0, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially"));
        items.add(new Item(4, "Item 4", 40.0, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets"));
        items.add(new Item(5, "Item 5", 50.0, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type"));
        items.add(new Item(6, "Item 6", 60.0, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type"));
    }
}
