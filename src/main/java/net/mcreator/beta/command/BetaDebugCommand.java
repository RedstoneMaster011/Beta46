
package net.mcreator.beta.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;

import net.minecraft.commands.Commands;

@Mod.EventBusSubscriber
public class BetaDebugCommand {
	@SubscribeEvent public static void registerCommand(RegisterCommandsEvent event) {
	event.getDispatcher().register(Commands.literal("beta\debug\:Sand")
		
		
	);
		}
}
