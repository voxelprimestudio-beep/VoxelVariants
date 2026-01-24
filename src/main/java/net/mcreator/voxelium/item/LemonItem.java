package net.mcreator.voxelvariants.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class LemonItem extends Item {
	public LemonItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.7f).alwaysEat().build()));
	}
}