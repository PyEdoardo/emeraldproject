package com.pyedoardo.items;

import com.pyedoardo.EmeraldProject;
import com.pyedoardo.list.ListaAlimento;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class IniciadorItems {
    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, EmeraldProject.id(name), item);


    }
    public static final Item ESMERALDA_DENSA = register("esmeralda_densa", new Item(new Item.Settings()));

    public static final Item MACA_ESMERALDA = register("maca_esmeralda", new Item(new Item.Settings().food(ListaAlimento.MACA_ESMERALDA_COMPONENTE)));

    public static void initialize() {
    }
}
