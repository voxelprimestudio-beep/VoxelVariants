/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.voxelvariants.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.voxelvariants.block.SulfuroreBlock;
import net.mcreator.voxelvariants.block.SaltblockBlock;
import net.mcreator.voxelvariants.VoxelvariantsMod;

public class VoxelvariantsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VoxelvariantsMod.MODID);
	public static final RegistryObject<Block> SULFURORE;
	public static final RegistryObject<Block> SALTBLOCK;
	static {
		SULFURORE = REGISTRY.register("sulfurore", SulfuroreBlock::new);
		SALTBLOCK = REGISTRY.register("saltblock", SaltblockBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}