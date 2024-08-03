package com.pyedoardo.items;

import com.pyedoardo.EmeraldProject;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.item.Items.register;

public class IniciadorItems {
    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, EmeraldProject.id(name), item);


    }
    public static final Item ESMERALDA_DENSA = register("esmeralda_densa", new Item(new Item.Settings()));
    public static void initialize() {
    }
}
