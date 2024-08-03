package com.pyedoardo.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ListaAlimento {
    public static final FoodComponent MACA_ESMERALDA_COMPONENTE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.5F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20 * 30, 2), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20 * 30, 2), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20 * 30, 2), 1)
            .build();


}
