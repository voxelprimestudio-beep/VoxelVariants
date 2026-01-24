/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.voxelvariants.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.voxelvariants.item.SulfurItem;
import net.mcreator.voxelvariants.item.SaltItem;
import net.mcreator.voxelvariants.item.LemonItem;
import net.mcreator.voxelvariants.item.KalinitratpowderItem;
import net.mcreator.voxelvariants.VoxelvariantsMod;

public class VoxelvariantsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VoxelvariantsMod.MODID);
	public static final RegistryObject<Item> SULFUR;
	public static final RegistryObject<Item> SULFURORE;
	public static final RegistryObject<Item> SALT;
	public static final RegistryObject<Item> SALTBLOCK;
	public static final RegistryObject<Item> LEMON;
	public static final RegistryObject<Item> KALINITRATPOWDER;
	static {
		SULFUR = REGISTRY.register("sulfur", SulfurItem::new);
		SULFURORE = block(VoxelvariantsModBlocks.SULFURORE);
		SALT = REGISTRY.register("salt", SaltItem::new);
		SALTBLOCK = block(VoxelvariantsModBlocks.SALTBLOCK);
		LEMON = REGISTRY.register("lemon", LemonItem::new);
		KALINITRATPOWDER = REGISTRY.register("kalinitratpowder", KalinitratpowderItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}