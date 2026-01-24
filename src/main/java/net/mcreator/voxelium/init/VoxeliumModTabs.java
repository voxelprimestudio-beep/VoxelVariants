/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.voxelvariants.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.voxelvariants.VoxelvariantsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VoxelvariantsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VoxelvariantsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(VoxelvariantsModItems.SULFUR.get());
			tabData.accept(VoxelvariantsModItems.KALINITRATPOWDER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(VoxelvariantsModBlocks.SULFURORE.get().asItem());
			tabData.accept(VoxelvariantsModBlocks.SALTBLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(VoxelvariantsModItems.SALT.get());
			tabData.accept(VoxelvariantsModItems.LEMON.get());
		}
	}
}