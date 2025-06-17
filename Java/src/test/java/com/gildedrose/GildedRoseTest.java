package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void normalItem_degradesBy1EachDay() {
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, 20) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(9, items[0].sellIn);
        assertEquals(19, items[0].quality);
    }

    @Test
    void normalItem_qualityDoesNotGoBelowZero() {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 5, 0) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(4, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

}
