package net.mcreator.coops.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.coops.CoopsModElements;
import net.mcreator.coops.CoopsMod;

import java.util.Map;

@CoopsModElements.ModElement.Tag
public class CloseGUIProcedure extends CoopsModElements.ModElement {
	public CloseGUIProcedure(CoopsModElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CoopsMod.LOGGER.warn("Failed to load dependency entity for procedure CloseGUI!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
