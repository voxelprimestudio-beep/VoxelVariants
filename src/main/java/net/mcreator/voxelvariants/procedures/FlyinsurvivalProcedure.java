package net.mcreator.voxelvariants.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.voxelvariants.network.VoxelvariantsModVariables;

public class FlyinsurvivalProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getCapability(VoxelvariantsModVariables.PLAYER_VARIABLES).orElseGet(VoxelvariantsModVariables.PlayerVariables::new).fly_on_player) {
			{
				entity.getCapability(VoxelvariantsModVariables.PLAYER_VARIABLES).ifPresent(capability -> {
					capability.fly_on_player = false;
					capability.markSyncDirty();
				});
			}
		} else {
			{
				entity.getCapability(VoxelvariantsModVariables.PLAYER_VARIABLES).ifPresent(capability -> {
					capability.fly_on_player = true;
					capability.markSyncDirty();
				});
			}
		}
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = entity.getCapability(VoxelvariantsModVariables.PLAYER_VARIABLES).orElseGet(VoxelvariantsModVariables.PlayerVariables::new).fly_on_player;
			_player.getAbilities().flying = entity.getCapability(VoxelvariantsModVariables.PLAYER_VARIABLES).orElseGet(VoxelvariantsModVariables.PlayerVariables::new).fly_on_player;
			_player.onUpdateAbilities();
		}
	}
}